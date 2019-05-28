/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.*;

/**
 *
 * @author uejaz
 */
public class MyConnection {
    
    public static Connection getConnection(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
        
    }
    
}
