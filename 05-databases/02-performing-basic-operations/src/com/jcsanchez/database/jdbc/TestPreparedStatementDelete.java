package com.jcsanchez.database.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by jsssn on 06-May-17.
 */
public class TestPreparedStatementDelete {

    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtil.getConnection(DBType.ORADB);

        String sql = "DELETE FROM Employees WHERE Employee_Id = ?";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empno = scanner.nextInt();

        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1, empno);

        int result = pstmt.executeUpdate();

        if (result == 1) {
            System.out.println("Employee Record Removed Successfully.");
        } else {
            System.err.println("Error while removing Employee Record.");
        }

        scanner.close();
        pstmt.close();
        conn.close();
    }
}
