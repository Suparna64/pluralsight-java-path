package com.jcsanchez.database.jdbc;

import java.sql.*;

/**
 * Created by jsssn on 04-May-17.
 */
public class TestOracleConnection {
    static final String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
    static final String username = "hr";
    static final String password = "hr";

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(dburl, username, password);

        System.out.println("Connection to Oracle Database Established Successfully");
    }
}
