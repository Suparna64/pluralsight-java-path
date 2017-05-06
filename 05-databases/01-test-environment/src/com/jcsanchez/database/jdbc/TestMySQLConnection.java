package com.jcsanchez.database.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by jsssn on 05-May-17.
 */
public class TestMySQLConnection {
    static String username = "root";
    static String password = "mysqlpassword";
    static String dbUrl = "jdbc:mysql://localhost:3306/world_x";

    public static void main(String[] args) {
        try (Connection conn =
                     DriverManager.getConnection(dbUrl, username, password)){


            System.out.println("Connection Established to MySQL Database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
