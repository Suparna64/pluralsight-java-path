package com.jcsanchez.database.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jsssn on 06-May-17.
 */
public class IteratingWithResultSets {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getConnection(DBType.ORADB);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from Employees");

            String format = "%-4s%-20s%-25s%-10f\n";

            while (rs.next()) {
                System.out.format(
                        format,
                        rs.getString("Employee_ID"),
                        rs.getString("First_Name"),
                        rs.getString("Last_Name"),
                        rs.getFloat("Salary"));
            }
        } catch (SQLException e) {
            DBUtil.showErrorMessage(e);
        } finally {
            rs.close();
            stmt.close();
            conn.close();
        }
    }
}
