/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymangementsystem.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBHandler {
    
    public static int setdata(Connection con, java.sql.PreparedStatement s) throws SQLException {
        int executeUpdate = s.executeUpdate();
        return executeUpdate;
    }
       
      public static ResultSet getdata(Connection con, String s) throws SQLException {
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(s);
        return rst;
    }    
    
    }
    

