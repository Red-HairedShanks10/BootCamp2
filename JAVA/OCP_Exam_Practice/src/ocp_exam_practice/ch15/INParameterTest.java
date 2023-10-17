package ocp_exam_practice.ch15;

import java.sql.*;

public class INParameterTest {
    public static void main(String[] args) throws SQLException {
        String sql = "{call read_names_by_letter(?)}";
        String url = "jdbc:hsqldb:file:zoo";

        try (Connection conn = DriverManager.getConnection(url);
             var cs = conn.prepareCall(sql); ) {

            cs.setString("prefix", "z");
            try (ResultSet rs = cs.executeQuery()){
                while (rs.next()) {
                    System.out.println(rs.getString(3));
                }
            }catch (SQLException e){
                System.out.println(e);
            }
        }
    }
}
