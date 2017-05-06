package com.jcsanchez.database.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by jsssn on 05-May-17.
 */
public class DBUtil {
    private static final String oraUser = "hr";
    private static final String oraPwd = "hr";
    private static final String mySqlUser = "root";
    private static final String mySqlPwd = "mysqlpassword";
    private static final String oraCS = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String mySqlCS = "jdbc:mysql://localhost:3306/world_x";

    public static Connection getConnection(DBType dbType) throws SQLException {
        switch (dbType) {
            case ORADB:
                return DriverManager.getConnection(oraCS, oraUser, oraPwd);
            case MYSQLDB:
                return DriverManager.getConnection(mySqlCS, mySqlUser, mySqlPwd);
            default:
                return null;
        }
    }

    public static void ShowErrorMessage(SQLException e) {
        System.err.println("Error: " + e.getMessage());
        System.err.println("Error Code: " + e.getErrorCode());
    }
}
