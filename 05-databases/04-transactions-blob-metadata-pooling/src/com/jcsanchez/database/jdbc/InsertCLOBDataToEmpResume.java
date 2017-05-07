package com.jcsanchez.database.jdbc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by jsssn on 07-May-17.
 */
public class InsertCLOBDataToEmpResume {

    public static void main(String[] args) throws SQLException, FileNotFoundException {
        String sql = "Update NewEmployees set Resume = ? where Employee_ID = 100";

        try (
                Connection conn = DBUtil.getConnection(DBType.ORADB);
                PreparedStatement pstmt = conn.prepareCall(sql);
        ) {
            String resumeFile = "C:/temp.txt";
            File file = new File(resumeFile);
            FileReader reader = new FileReader(file);

            pstmt.setCharacterStream(1, reader, (int) file.length());

            pstmt.executeUpdate();

            System.out.println("Resume Updated Successfully...");
        }
    }
}
