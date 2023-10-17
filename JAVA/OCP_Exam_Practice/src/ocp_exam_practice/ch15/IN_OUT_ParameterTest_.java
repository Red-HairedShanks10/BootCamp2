package ocp_exam_practice.ch15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class IN_OUT_ParameterTest_ {
    public static void main(String[] args) throws SQLException {
        String sql = "{call double_number(?)}";
        String url = "jdbc:hsqldb:file:zoo";

        try (Connection conn = DriverManager.getConnection(url);
             var cs = conn.prepareCall(sql);) {

            cs.setInt(1,8);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            System.out.println(cs.getInt("num"));
        }
    }
}
