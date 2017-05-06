package com.jcsanchez.database.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jsssn on 05-May-17.
 */
public class TestExceptionHandling {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getConnection(DBType.ORADB);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("select * from MyCountries");
            rs.last();
            System.out.println("Total No. of Rows: " + rs.getRow());
        } catch (SQLException e) {
            DBUtil.ShowErrorMessage(e);
        } finally {
            conn.close();
        }
    }
}
