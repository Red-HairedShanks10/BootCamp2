package ocp_exam_practice.ch15;

import java.sql.CallableStatement;
import java.sql.*;
import java.sql.DriverManager;

public class CallableStatementsTest {
    public static void main(String[] args) throws SQLException {
        String sql = "{call read_e_names()}";
        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url);
        CallableStatement cs = conn.prepareCall(sql); ResultSet rs = cs.executeQuery()){
            while (rs.next()){
                System.out.println(rs.getString(3));
            }

        }
    }
}
