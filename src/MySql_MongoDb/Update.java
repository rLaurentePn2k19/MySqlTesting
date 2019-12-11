/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySql_MongoDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author laurentera_sd2022
 */
public class Update implements CRUD {

    public void UpdateNumbers() {

//        int col1 = 0;
//        int col2 = 0;
//        int col3 = 0;
//        int col4 = 0;
//        int col5 = 0;
//        Date timeStart = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
//        System.out.println("Time Started: " + dateFormat.format(timeStart));
//
//        for (int i = 0; i < 1001; i++) {
//            if (i == 1000) {
//                Date timeFinish = new Date();
//                SimpleDateFormat dateFormatFinish = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
//                System.out.println("Time Finish: " + dateFormatFinish.format(timeFinish));
//            } else {
//                col1++;
//                col2++;
//                col3++;
//                col4++;
//                col5++;
//                i++;
//                Connection conn = null;
//                Statement stmt = null;
//                String updateQuery;
//
//                updateQuery = "UPDATE `numbers` SET col1 = '" + col1 + "', col2 = '" + col2 + "' "
//                        + ", col3 = '" + col3 + "'WHERE brandname = '" + col4 + "' and genericname = '" + genericname + "'";
//                try {
//                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
//                    stmt = conn.createStatement();
//                    stmt.executeUpdate(updateQuery);
//                    conn.close();
//                } catch (SQLException ex) {
//                    System.out.println(ex.getMessage());
//                }
//            }
//
//        }
    }
}
