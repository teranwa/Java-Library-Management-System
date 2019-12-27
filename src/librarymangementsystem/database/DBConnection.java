/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymangementsystem.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {

    private static DBConnection connection;
    private static Connection con;
    
    private DBConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                + "library_system"
                ,"root", "mysql");
    }
    
    public static Connection getDBConnection() throws SQLException, ClassNotFoundException{ 
        if (connection == null) {
            connection = new DBConnection();
        }
        
        return con;
    }
}
