package com.jcsanchez.database.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by jsssn on 06-May-17.
 */
public class TestCallableBatchProcessing {

    public static void main(String[] args) throws SQLException {
        try (
                Connection conn = DBUtil.getConnection(DBType.ORADB);

                CallableStatement callableStatement = conn.prepareCall("{call AddNewEmployee(?, ?, ?, ?, ?)}");
        ) {
            String option;

            do {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter Employee #: ");
                int empno = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Employee Name: ");
                String ename = scanner.nextLine();

                System.out.print("Enter Email: ");
                String email = scanner.nextLine();

                System.out.print("Enter Hire Date: ");
                Date doj = Date.valueOf(scanner.nextLine());

                System.out.print("Enter Salary: ");
                double salary = Double.parseDouble(scanner.nextLine());

                callableStatement.setInt(1, empno);
                callableStatement.setString(2, ename);
                callableStatement.setString(3, email);
                callableStatement.setDate(4, doj);
                callableStatement.setDouble(5, salary);

                callableStatement.addBatch();

                System.out.print("Do you want to add another record (yes/no)?: ");
                option = scanner.nextLine();
            } while (option.equals("yes"));

            int [] updateCounts = callableStatement.executeBatch();

            System.out.println("Total Records Inserted are " + updateCounts.length);
        } catch (SQLException e) {
            DBUtil.showErrorMessage(e);
        }
    }
}
