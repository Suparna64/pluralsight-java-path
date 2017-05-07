package com.jcsanchez.database.jdbc;

import oracle.jdbc.OracleTypes;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by jsssn on 06-May-17.
 */

/*
*   Create or Replace Procedure GetEmployeesByRefCursor
*   (
*   p_deptno in Employees.Department_ID%Type,
*   p_recordSet out SYS_REFCURSOR
*   )
*   as
*   Begin
*   OPEN p_recordSet FOR
*   Select Employee_ID, First_Name || Last_Name as Employee_Name,
*   Email, Salary From Employees
*   Where Department_Id = p_deptno
*   Order By Employee_ID;
*   End;
*   /
 */
public class TestCallableResultSet {

    public static void main(String[] args) throws SQLException {
        try (
                Connection conn = DBUtil.getConnection(DBType.ORADB);
                CallableStatement callableStatement = conn.prepareCall("{ call GetEmployeesByRefCursor(?,?) }");
                Scanner scanner = new Scanner(System.in);
        ) {
            System.out.print("Enter Department ID: ");
            int deptno = Integer.parseInt(scanner.nextLine());

            callableStatement.setInt(1, deptno);
            callableStatement.registerOutParameter(2, OracleTypes.CURSOR);
            callableStatement.execute();

            ResultSet rs = ((oracle.jdbc.internal.OracleCallableStatement) callableStatement).getCursor(2);

            String format = "%-4s%-50s%-25s%-10f\n";

            while (rs.next()) {
                System.out.format(
                        format,
                        rs.getString("Employee_ID"),
                        rs.getString("Employee_Name"),
                        rs.getString("Email"),
                        rs.getFloat("Salary"));
            }
        } catch (SQLException e) {
            DBUtil.showErrorMessage(e);
        }
    }
}
