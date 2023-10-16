package ocp_exam_practice.ch15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommitRollbackTest {
    public static void main(String[] args) throws SQLException {
        6: try (Connection conn =
                        7: DriverManager.getConnection("jdbc:hsqldb:file:zoo")) {
            
             conn.setAutoCommit(false);

             var elephantRowsUpdated = updateRow(conn, 5, "African Elephant");
}
