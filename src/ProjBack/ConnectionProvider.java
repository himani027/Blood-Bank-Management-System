/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjBack;
import java.sql.*;

/**
 *
 * @author Cherry
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BloodBank", "root", "Himani27");
            return connection;
        }       
        catch(Exception e) {
            return null;
        }
    }
            
}
