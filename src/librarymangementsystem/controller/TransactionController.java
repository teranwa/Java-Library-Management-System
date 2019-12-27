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
import librarymangementsystem.Others.Dates;
import librarymangementsystem.database.DBConnection;
import librarymangementsystem.models.Transaction;

/**
 *
 * @author USER
 */
public class TransactionController {
    
    
    
    
   public static ResultSet  getBorrowerId(String regNo) throws SQLException, ClassNotFoundException{
       
       Connection con = DBConnection.getDBConnection();
       String sqlUpdate = "SELECT b_id,b_fines from borrower where b_regno='"+regNo+"'"; 
       
   
         PreparedStatement ps = con.prepareStatement(sqlUpdate);
        ResultSet executeQuery = ps.executeQuery();
        return executeQuery;
       
   
   }
   
   
   
      public static int addTransaction(Transaction tr ) throws ClassNotFoundException, SQLException{
        
        
        Connection con = DBConnection.getDBConnection();
        String sqlUpdate = "INSERT INTO transactions(issued_date,due_date,b_id,i_id,u_id)VALUES "
                + "('"+DateController.getSystemDate()+"','"+Dates.getDate()+"','"+tr.getB_id()+ "',"
                + "'"+tr.getI_id()+"','"+tr.getU_id()+"')";
              
        
         PreparedStatement ps = con.prepareStatement(sqlUpdate);
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
      
      
      public static int  returnBook(Transaction tr ) throws SQLException, ClassNotFoundException {
       
       Connection con = DBConnection.getDBConnection();
      
       
       String sqlUpdate;  
       sqlUpdate = "UPDATE transactions set return_date ='"+DateController.getSystemDate()+"' where i_id ='"+tr.getI_id()+"'";
       
              
   
            PreparedStatement ps = con.prepareStatement(sqlUpdate);
            int executeUpdate = ps.executeUpdate();
            return executeUpdate;
   }
      
        
   public static ResultSet  getBurrowersDetails(String bid) throws SQLException, ClassNotFoundException{
       
       Connection con = DBConnection.getDBConnection();
       String sqlUpdate = "select t.t_id, i.i_title, t.issued_date, t.due_date, t.return_date, u.u_id " +
"from transactions t inner join item i on i.i_id = t.i_id inner join user u " +
"on u.u_id = t.u_id where t.b_id = '"+bid+"'"; 
       
   
         PreparedStatement ps = con.prepareStatement(sqlUpdate);
        ResultSet executeQuery = ps.executeQuery();
        return executeQuery;
       
   
   }
   
    
}
