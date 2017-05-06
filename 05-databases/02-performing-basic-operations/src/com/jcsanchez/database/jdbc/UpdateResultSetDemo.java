package com.jcsanchez.database.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jsssn on 06-May-17.
 */
public class UpdateResultSetDemo {

    public static void main(String[] args) throws SQLException {
        try (
                Connection conn = DBUtil.getConnection(DBType.ORADB);
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("SELECT Department_Id, Department_Name, Manager_Id, Location_Id FROM Departments");
        ) {
            rs.absolute(6);

            rs.updateString("Department_Name", "Information Technology");
            rs.updateRow();

            System.out.println("Record Updated Succesfully");

            rs.moveToInsertRow();
            rs.updateInt("Department_Id", 999);
            rs.updateString("Department_Name", "Training");
            rs.updateInt("Manager_Id", 200);
            rs.updateInt("Location_Id", 1800);
            rs.insertRow();

            System.out.println("Record Inserted Succesfully");
        } catch (SQLException ex) {
            DBUtil.showErrorMessage(ex);
        }
    }
}
