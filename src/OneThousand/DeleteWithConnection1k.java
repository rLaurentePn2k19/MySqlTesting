/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OneThousand;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import mysql.CRUD;
/**
 *
 * @author laurentera_sd2022
 */
public class DeleteWithConnection1k implements CRUD{
    int Time = 0;
    public void Delete() {
        Date timeStart = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Started: " + dateFormat.format(timeStart));

        for (int i = 1; i < 1001; i++) {
            Connection conn = null;
            Statement stmt = null;
            String delete;
            delete = "DELETE FROM `numbers` WHERE id = '" + i + "'";
            try {
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                stmt = conn.createStatement();
                int result = stmt.executeUpdate(delete);
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
        System.out.println("Time start: " + timeStart.getHours() + " : " + timeStart.getMinutes() + " : " + timeStart.getSeconds() + "\nTime end: " + timeFinish.getHours() + " : " + timeFinish.getMinutes() + " : " + timeFinish.getSeconds());
        System.out.println("Time interval in milliseconds: " + Time);
    }
}
