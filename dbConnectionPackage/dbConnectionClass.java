/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnectionPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class dbConnectionClass {
    public Connection con;
    
    public void getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?autoReconnect=true&openSSL=false","root","admin@123");
            
            System.out.println("Connection successful");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(dbConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
