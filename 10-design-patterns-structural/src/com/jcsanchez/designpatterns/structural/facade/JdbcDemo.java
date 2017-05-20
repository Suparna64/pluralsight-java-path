package com.jcsanchez.designpatterns.structural.facade;

import com.sun.org.apache.xpath.internal.SourceTreeManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jsssn on 19-May-17.
 */
public class JdbcDemo {

    public static void main(String[] args) {
         DbSingleton instance = DbSingleton.getInstance();

        try {
            Connection conn = instance.getConnection();

            Statement stmnt = conn.createStatement();
            int count = stmnt.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName "
                + "VARCHAR(20), City VARCHAR(20))");

            System.out.println("Table created");
            stmnt.close();

            stmnt = conn.createStatement();
            count = stmnt.executeUpdate("INSERT INTO Address (ID, StreetName, City) "
                    + "values (1, '1234 Some street', 'Layton')");

            System.out.println(count + " records(s) created.");
            stmnt.close();

            stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT * FROM Address");

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
