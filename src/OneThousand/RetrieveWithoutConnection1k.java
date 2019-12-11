/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneThousand;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import MySql_MongoDb.CRUD;

/**
 *
 * @author laurentera_sd2022
 */
public class RetrieveWithoutConnection1k implements CRUD {

    int Time = 0;

    public void Retrieve() {

        float avgCol1 = 0;
        float avgCol2 = 0;
        float avgCol3 = 0;
        float avgCol4 = 0;
        float avgCol5 = 0;

        Date timeStart = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Started: " + dateFormat.format(timeStart));

        Connection conn = null;
        Statement stmt = null;
        String retrieve;

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            for (int column = 1; column < 5; column++) {
                retrieve = "SELECT AVG(col"+ column +") FROM numbers";
                ResultSet result = stmt.executeQuery(retrieve);
                while(result.next()) {
                    System.out.println("Average Column"+column+" = "+ result.getFloat(column)+"\t");
                }
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        Date timeFinish = new Date();
        SimpleDateFormat dateFormatFinish = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");

        System.out.println("Time Finish: " + dateFormatFinish.format(timeFinish));
        Time = (int) (timeStart.getTime() - timeFinish.getTime());
        System.out.println("Time start: " + timeStart.getHours() + " : " + timeStart.getMinutes() + " : " + timeStart.getSeconds() + "\nTime end: " + timeFinish.getHours() + " : " + timeFinish.getMinutes() + " : " + timeFinish.getSeconds());
        System.out.println("Time interval in milliseconds: " + Time);
    }
}
