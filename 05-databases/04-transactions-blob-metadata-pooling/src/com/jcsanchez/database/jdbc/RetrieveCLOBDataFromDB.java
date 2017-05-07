package com.jcsanchez.database.jdbc;

import com.sun.deploy.security.DeployNTLMAuthCallback;

import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jsssn on 07-May-17.
 */
public class RetrieveCLOBDataFromDB {

    public static void main(String[] args) throws SQLException, IOException {
        String sql = "SELECT Resume FROM NewEmployees WHERE Employee_ID = 100";

        try (
                Connection conn = DBUtil.getConnection(DBType.ORADB);
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
        ) {
            if (rs.next()) {
                Clob resume = rs.getClob("Resume");
                Reader data = resume.getCharacterStream();

                int i;
                String resumeDetails = "";
                while ((i = data.read()) != -1) {
                    resumeDetails += ((char) i);
                }

                System.out.println("Resume Details for Employee 100");
                System.out.println(resumeDetails);
            }
        }
    }
}
