/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author laurentera_sd2022
 */
public class CreateWConnection implements CRUD {

    int col1 = 0;
    int col2 = 0;
    int col3 = 0;
    int col4 = 0;
    int col5 = 0;

    int Time = 0;

    public void Insert() {
        Date timeStart = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Started: " + dateFormat.format(timeStart));

        for (int i = 0; i < 200; i++) {
            Connection conn = null;
            Statement stmt = null;
            String insertQuery;

            col1++;
            col2++;
            col3++;
            col4++;
            col5++;
            i++;

            insertQuery = String.format("INSERT INTO `numbers` (col1,col2,col3,col4,col5)"
                    + "VALUES ('%d','%d','%d','%d','%d')", col1, col2 + 1, col3 + 2, col4 + 3, col5 + 4);
            try {
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                stmt = conn.createStatement();
                int result = stmt.executeUpdate(insertQuery);
                System.out.println(result);
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        Date timeFinish = new Date();
        SimpleDateFormat dateFormatFinish = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Finish: " + dateFormatFinish.format(timeFinish));

        Time = (int) (timeStart.getTime() - timeFinish.getTime());

        System.out.println("Time interval: " + Time);
    }
//    public void insertNumbers() {
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
//                String insertQuery;
//
//                insertQuery = String.format("INSERT INTO `numbers` (col1,col2,col3,col4,col5)"
//                        + "VALUES ('%d','%d','%d','%d','%d')", col1, col2 + 1, col3 + 2, col4 + 3, col5 + 4);
//                try {
//                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
//                    stmt = conn.createStatement();
//                    int result = stmt.executeUpdate(insertQuery);
//                    System.out.println(result);
//                    conn.close();
//                } catch (SQLException ex) {
//                    JOptionPane.showMessageDialog(null, ex);
//                    System.out.println(ex.getMessage());
//                }
//
//            }
//        }
//
//    }

}
