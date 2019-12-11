/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MongoDb.OneThousand;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laurentera_sd2022
 */
public class MDeleteWithoutConnection1k {

    int Time = 0;

    public void delete() throws UnknownHostException {
        Date timeStart = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Started: " + dateFormat.format(timeStart));

        try {
            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
            mongoLogger.setLevel(Level.SEVERE);
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("myMongoDb");
            DBCollection collection = db.getCollection("myCollecion");
            for (int i = 1; i < 1001; i++) {
//                BasicDBObject remove1000 = new BasicDBObject("col1", i);
                collection.remove(new BasicDBObject("col1", i));
                System.out.println("Successfully deleted!");
            }
        } catch (SecurityException e) {
            System.out.println(e);
        }
        Date timeFinish = new Date();
        SimpleDateFormat dateFormatFinish = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Finish: " + dateFormatFinish.format(timeFinish));
        Time = (int) (timeStart.getTime() - timeFinish.getTime());
        System.out.println("Time start: " + timeStart.getHours() + " : " + timeStart.getMinutes() + " : " + timeStart.getSeconds() + "\nTime end: " + timeFinish.getHours() + " : " + timeFinish.getMinutes() + " : " + timeFinish.getSeconds());
        System.out.println("Time interval in milliseconds: " + Time);
    }

}
