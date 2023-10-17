package ocp_exam_practice.ch15;

import java.sql.*;

public class UpdateQueries {
    public static Connection conn2;
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url)) {
            conn2 = conn;
            var insertSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
            var updateSql = "UPDATE exhibits SET name = '' " + "WHERE name = 'None'";
            var updateSql2 = "UPDATE names SET name = 'Link' " + "WHERE name = 'Ezabelle'";
            var deleteSql = "DELETE FROM exhibits WHERE id = 10";
            var readSql = "SELECT * FROM names";

            /**INSERT QUERIES **/
            /*try (var ps = conn.prepareStatement(insertSql)) {
                 int result = ps.executeUpdate();
                System.out.println(result);
                }*/


            /** UPDATE QUERiES **/
           /* try (var ps = conn.prepareStatement(updateSql)) {
                int result = ps.executeUpdate();
                 System.out.println(result); // 0
                 }*/

          /*  try (var ps = conn.prepareStatement(updateSql2)) {
                int result = ps.executeUpdate();
                System.out.println(result);
            }*/


            /** DELETE QUERIES **/
            /*try (var ps = conn.prepareStatement(deleteSql)) {
                 int result = ps.executeUpdate();
                System.out.println(result); // 1
                 }*/
/*
            var sql = "SELECT * FROM names";
            try (var ps = conn.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getString(3));
                }
            }*/

            try{
            //    getResults(insertSql);
                getResults(updateSql);
                getResults(updateSql2);
                register(conn, 13,1,"Kura");
                getResults(readSql);
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }

    public static void getResults(String s)throws Exception{

         try (var ps = conn2.prepareStatement(s); ) {
             boolean isRs = ps.execute();

             if (isRs) {
                 try (ResultSet rs = ps.getResultSet()) {
                     System.out.println("ran a query");
                     while (rs.next()){
                         System.out.println(rs.getString(3));
                     }
                 }
             } else {
                 int result = ps.getUpdateCount();
                 System.out.println("ran an update");
                 System.out.println("num of rows affected: " + result);
             }

         }
    }

    public static void register(Connection conn, int key,
        int type, String name) throws SQLException {

        String sql = "INSERT INTO names VALUES(?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setString(3, name);
            ps.setInt(2, type);
           // ps.setInt(4, type);
             ps.executeUpdate();
             }


        }
    }