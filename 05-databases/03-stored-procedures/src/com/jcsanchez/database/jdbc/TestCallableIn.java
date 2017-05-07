package com.jcsanchez.database.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by jsssn on 06-May-17.
 */

/*
*   ======  Stored Procedure Used  ===============
*
*   Create or Replace Procedure AddNewEmployee
*   (
*   eid in NewEmployees.Employee_ID%Type,
*   ename in NewEmployees.Employee_Name%Type,
*   email in NewEmployees.Email%Type,
*   doj in NewEmployees.Hire_Date%Type,
*   sal in NewEmployees.Salary%Type
*   )
*   is
*   begin
*   insert into NewEmployees values (eid, ename, email, doj, sal );
*   commit;
*   end;
*   /
*
 */
public class TestCallableIn {

    public static void main(String[] args) throws SQLException {
        try (
                Connection conn = DBUtil.getConnection(DBType.ORADB);

                CallableStatement callableStatement = conn.prepareCall("{call AddNewEmployee(?, ?, ?, ?, ?)}");
        ) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Employee #: ");
            int empno = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Employee Name: ");
            String ename = scanner.nextLine();

            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            System.out.print("Enter Hire Date: ");
            Date doj = java.sql.Date.valueOf(scanner.nextLine());

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();

            callableStatement.setInt(1, empno);
            callableStatement.setString(2, ename);
            callableStatement.setString(3, email);
            callableStatement.setDate(4, doj);
            callableStatement.setDouble(5, salary);

            callableStatement.execute();

            System.out.println("Employee Record Added Succesfully.");
        } catch (SQLException e) {
            DBUtil.showErrorMessage(e);
        }
    }
}
