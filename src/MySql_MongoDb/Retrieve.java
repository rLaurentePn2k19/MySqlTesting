/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MySql_MongoDb;

import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author laurentera_sd2022
 */
public class Retrieve implements CRUD{
    
    public Object[][] retrieveNumbers() {
        
        Object[][] data = new Object[1000][6];
        Connection conn = null;
        Statement stmt = null;
        String retrieveQuery;
        retrieveQuery = String.format("SELECT * from `numbers`");
        try {
            int cols = 0;
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(retrieveQuery);
            System.out.println(rs);
            while (rs.next()) {
                data[cols][0] = rs.getInt("id");
                data[cols][1] = rs.getString("col1");
                data[cols][2] = rs.getInt("col2");
                data[cols][3] = rs.getString("col3");
                data[cols][4] = rs.getString("col4");
                data[cols][5] = rs.getString("col5");
            ++cols;
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return data;
    }
    
    public void displayRetrieveNumbers(){
        String[] columns = {"id", "col1", "col2", "col3","col4","col5"};
        Object[][] data = this.retrieveNumbers();
        DefaultTableModel tableModel = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all ceisCellEditablells false
                return false;
            }
        };
        JTable popUpTable = new JTable(data, columns);
        Font font = new Font("Verdana", Font.PLAIN, 12);
        popUpTable.setModel(tableModel);
        popUpTable.setFont(font);
        popUpTable.setRowHeight(25);
        popUpTable.getTableHeader().setPreferredSize(new Dimension(100, 30));
        popUpTable.getTableHeader().setFont(font);
        JOptionPane.showMessageDialog(null, new JScrollPane(popUpTable), "Numbers", JOptionPane.INFORMATION_MESSAGE
        );
    }
}
