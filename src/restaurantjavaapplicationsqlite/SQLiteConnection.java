/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantjavaapplicationsqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Tylor
 */
public class SQLiteConnection {
    
    private static Connection con;
    private static boolean hasData = false; 
    
    public ResultSet displayData() throws ClassNotFoundException, SQLException
    {
        if(con == null){
            getConnection();
        }
        Statement state = con.createStatement();
        ResultSet res = state.executeQuery("select 1 from dual");
        return res;
    }
    
    public void getConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:SQLiteDB.db");
    }
    
    private void initialize() throws SQLException
    {
        if(!hasData)
        {
            hasData = true;
            
            Statement state = con.createStatement();
            ResultSet res = state.executeQuery("select 1 from dual");
        }
    }
    
}
