package com.jcsanchez.database.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by jsssn on 05-May-17.
 */
public class TestManageDBResources {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            conn = DBUtil.getConnection(DBType.MYSQLDB);

            System.out.println("Connection Established to MySQL Database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            conn.close();
        }
    }
}
