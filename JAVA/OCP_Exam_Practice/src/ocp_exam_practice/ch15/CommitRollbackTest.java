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
             13:
             14: if (! elephantRowsUpdated || ! zebraRowsUpdated)
                 15: conn.rollback();
             16: else {
                 17: String selectSql = """
18: SELECT COUNT(*)
19: FROM exhibits
20: WHERE num_acres <= 0""";
                 21: try (PreparedStatement ps = conn.prepareStatement(selectSql);
22: ResultSet rs = ps.executeQuery()) {
                     23:
                     24: rs.next();
                     25: int count = rs.getInt(1);
                     26: if (count == 0)
                         27: conn.commit();
                     28: else
                     29: conn.rollback();
                      } } } }

}
