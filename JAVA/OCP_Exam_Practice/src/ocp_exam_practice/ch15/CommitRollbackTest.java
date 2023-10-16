package ocp_exam_practice.ch15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommitRollbackTest {
    public static void main(String[] args) throws SQLException {
         try (Connection conn =
                         DriverManager.getConnection("jdbc:hsqldb:file:zoo")) {

             conn.setAutoCommit(false);

             var elephantRowsUpdated = updateRow(conn, 5, "African Elephant");
             var zebraRowsUpdated = updateRow(conn, -5,
                     "Zebra");

             if (! elephantRowsUpdated || ! zebraRowsUpdated)
                  conn.rollback();
              else {
                  String selectSql = """
                     SELECT COUNT(*)
                     FROM exhibits
                    WHERE num_acres <= 0""";
                  try (PreparedStatement ps = conn.prepareStatement(selectSql);
                     ResultSet rs = ps.executeQuery()) {

                      rs.next();
                      int count = rs.getInt(1);
                      if (count == 0)
                          conn.commit();
                      else
                      conn.rollback();
                      } } } }

    private static boolean updateRow(Connection conn,
33: int numToAdd, String name)
34:
        35: throws SQLException {
        36:
        37: String updateSql = """
38: UPDATE exhibits
39: SET num_acres = num_acres + ?
40: WHERE name = ?""";
        41:
        42: try (PreparedStatement ps = conn.prepareStatement(updateSql)) {
            43: ps.setInt(1, numToAdd);
            44: ps.setString(2, name);
            45: return ps.executeUpdate() > 0;
             } }

}
