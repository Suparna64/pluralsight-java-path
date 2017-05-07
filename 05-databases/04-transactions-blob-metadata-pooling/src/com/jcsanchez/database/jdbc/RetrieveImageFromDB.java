package com.jcsanchez.database.jdbc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jsssn on 07-May-17.
 */
public class RetrieveImageFromDB {

    public static void main(String[] args) throws SQLException, IOException {
        String sql = "SELECT Photo FROM NewEmployees WHERE Employee_ID = 100";

        try (
                Connection conn = DBUtil.getConnection(DBType.ORADB);
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
        ) {
            if (rs.next()) {
                Blob imgBlob = rs.getBlob("Photo");

                FileOutputStream fos = new FileOutputStream("C:/Users/jsssn/Pictures/img100.png");
                fos.write(imgBlob.getBytes(1, (int) imgBlob.length()));

                fos.flush();
                fos.close();

                System.out.println("Photo of Employee 100 has been Downloaded successfully");
            } else {
                System.out.println("Employee Record Not Found");
            }
        }
    }
}
