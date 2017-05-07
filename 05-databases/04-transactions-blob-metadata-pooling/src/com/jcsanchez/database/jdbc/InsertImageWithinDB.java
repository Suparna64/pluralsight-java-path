package com.jcsanchez.database.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by jsssn on 07-May-17.
 */
public class InsertImageWithinDB {

    public static void main(String[] args) throws IOException, SQLException {
        String sql = "UPDATE NewEmployees SET PHOTO = ? WHERE Employee_ID = 100";

        try (
                Connection conn = DBUtil.getConnection(DBType.ORADB);
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            File file = new File("C:/temp.png");
            FileInputStream fis = new FileInputStream(file);

            pstmt.setBinaryStream(1, fis, fis.available());

            int count = pstmt.executeUpdate();

            System.out.println("Total Records Updated: " + count);
        }
    }
}
