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
import librarymangementsystem.models.Borrower;

/**
 *
 * @author USER
 */
public class BorrowerController {
    
   public static int addBorrower(Borrower borrower) throws SQLException, ClassNotFoundException{
       
       Connection con = DBConnection.getDBConnection();
       
        String sqlUpdate = "INSERT INTO borrower (b_fname,b_mname,b_lname,b_gender,b_address,b_regno,b_dob,b_nic_no,b_phoneno) VALUES " 
                 + "('"+borrower.getFirst_Name()+"','"+borrower.getMiddle_Name()+"','"+borrower.getLast_Name()+"'"
                + ",'"+borrower.getGender()+"','"+borrower.getAddress()+"','"+borrower.getReg_No()+"'"
                + ",'"+borrower.getBirth_Day()+"','"+borrower.getNic_No()+"','"+borrower.getPhone_Number()+"')";
        PreparedStatement ps = con.prepareStatement(sqlUpdate);
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
       
        
        
        
   }
   
   
   public static ResultSet searchBorrower(String reg_No) throws SQLException, ClassNotFoundException{
       
        Connection con = DBConnection.getDBConnection();
        String sqlQuery = "Select * from borrower where b_regno='"+reg_No+"'";
       PreparedStatement ps = con.prepareStatement(sqlQuery);
        ResultSet result = ps.executeQuery();
        return result;
    
   
   }
   
   
   
   public static int updateBorrower(Borrower borrower) throws SQLException, ClassNotFoundException{
       
       Connection con = DBConnection.getDBConnection();
       
        String sqlUpdate = "UPDATE borrower SET b_fname='"+borrower.getFirst_Name()+"',b_mname='"+borrower.getMiddle_Name()+"',b_lname='"+borrower.getLast_Name()+"',b_gender='"+borrower.getGender()+"',b_address='"+borrower.getAddress()+"',b_regno='"+borrower.getReg_No()+"',b_dob='"+borrower.getBirth_Day()+"',b_nic_no='"+borrower.getNic_No()+"',b_phoneno='"+borrower.getPhone_Number()+"' WHERE b_regno='"+borrower.getReg_No()+"'"; 
              
        PreparedStatement ps = con.prepareStatement(sqlUpdate);
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
       
   
    }
   
    public static ResultSet  getBorrowerId(String regNo) throws SQLException, ClassNotFoundException{
       
       Connection con = DBConnection.getDBConnection();
       String sqlUpdate = "SELECT b_id from borrower where b_regno='"+regNo+"'"; 
       
   
         PreparedStatement ps = con.prepareStatement(sqlUpdate);
        ResultSet executeQuery = ps.executeQuery();
        return executeQuery;
       
   
   }
}

   
   
   
   
   
    
    
    
    

