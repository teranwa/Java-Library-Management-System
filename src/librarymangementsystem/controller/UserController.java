/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymangementsystem.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import librarymangementsystem.database.DBConnection;


public class UserController {
    
    
    
     
   public static ResultSet  getPassword(int username) throws SQLException, ClassNotFoundException{
       
       Connection con = DBConnection.getDBConnection();
       String sqlUpdate = "SELECT u_password from user where u_id='"+username+"'"; 
       
   
         PreparedStatement ps = con.prepareStatement(sqlUpdate);
        ResultSet executeQuery = ps.executeQuery();
        return executeQuery;
       
   
   
     }
}
