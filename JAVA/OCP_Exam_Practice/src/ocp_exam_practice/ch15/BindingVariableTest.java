package ocp_exam_practice.ch15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BindingVariableTest {
    public static void main(String[] args) throws SQLException {
        String sql = "SELECT id, name FROM exhibits WHERE name = ?";

        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url);
             var ps = conn.prepareStatement(sql);) {


            ps.setString(1, "Zebra");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    System.out.println(id + ": " + name);
                }

            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}
