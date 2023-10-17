package ocp_exam_practice.ch15;

import java.sql.*;
import java.util.HashMap;

public class ResultSetTest {
    public static void main(String[] args) throws SQLException {
        String sql = "SELECT id, name FROM exhibits";
         var idToNameMap = new HashMap<Integer, String>();

        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url);
             var ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()){

          /*  while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                idToNameMap.put(id, name);
            }*/
            /*while (rs.next()) {
                 Object idField = rs.getObject("id");
                 Object nameField = rs.getObject("name");
                 if (idField instanceof Integer id){
                     System.out.println(id);
                 }
                 if (nameField instanceof String name){
                     System.out.println(name);
                 }
            }*/

            System.out.println(idToNameMap);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}