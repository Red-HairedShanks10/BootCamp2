package ocp_exam_practice.ch15;

import java.sql.*;

public class OutParameterTest {
    public static void main(String[] args) throws SQLException {
        String sql = "{?= call magic_number(?)}";
        String url = "jdbc:hsqldb:file:zoo";

        try (Connection conn = DriverManager.getConnection(url);
             var cs = conn.prepareCall(sql);) {

            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            System.out.println(cs.getInt("num"));
        }
    }
}
