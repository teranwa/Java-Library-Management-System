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
import librarymangementsystem.models.Item;

/**
 *
 * @author USER
 */
public class ItemController {
    
    public static int addItem(Item item) throws ClassNotFoundException, SQLException{
        
        
        Connection con = DBConnection.getDBConnection();
        String sqlUpdate = "INSERT INTO item(i_id,i_author,i_publisher,i_type,i_title,i_addeddate,i_category,i_price)VALUES "
                + "('"+item.getItem_ID()+"','"+item.getAuthor()+"','"+item.getPublisher_ID()+"','"+item.getType()+"','"+item.getTitle()+ "',"
                + "'"+item.getAdded_Date()+"','"+item.getCategory()+"','"+item.getPrice()+"')";
              
        
         PreparedStatement ps = con.prepareStatement(sqlUpdate);
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    
        public static ResultSet  getItemId(String title) throws SQLException, ClassNotFoundException{
       
       Connection con = DBConnection.getDBConnection();
       String sqlUpdate = "SELECT i_id from item where i_title='"+title+"'"; 
       
   
         PreparedStatement ps = con.prepareStatement(sqlUpdate);
        ResultSet executeQuery = ps.executeQuery();
        return executeQuery;
       
   
   }
}
