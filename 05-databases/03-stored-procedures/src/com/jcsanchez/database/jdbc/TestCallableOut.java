package com.jcsanchez.database.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

/**
 * Created by jsssn on 06-May-17.
 */

/*
*   Create or Replace Procedure GetTotalEmployeesByDepartment
*   (
*   deptno in Employees.Department_Id%Type,
*   totalEmployees out number
*   )
*   as
*   begin
*   select count(*) into totalEmployees from Employees
*   where Department_Id = deptno;
*   end;
*   /
 */
public class TestCallableOut {

    public static void main(String[] args) throws SQLException {
        try (
                Connection conn = DBUtil.getConnection(DBType.ORADB);
                CallableStatement callableStatement = conn.prepareCall("{ call GetTotalEmployeesByDepartment(?,?) }");
                Scanner scanner = new Scanner(System.in);
        ) {
            System.out.print("Enter Department ID: ");
            int deptno = Integer.parseInt(scanner.nextLine());

            callableStatement.setInt(1, deptno);
            callableStatement.registerOutParameter(2, Types.INTEGER);

            callableStatement.execute();

            int totalEmployees = callableStatement.getInt(2);

            System.out.println("Total Employees Working " + totalEmployees);
        } catch (SQLException e) {
            DBUtil.showErrorMessage(e);
        }
    }
}
