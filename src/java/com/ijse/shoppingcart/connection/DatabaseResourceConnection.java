/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TD Athukorala
 */
public class DatabaseResourceConnection implements ResourceConnection{
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/shopping_cart","root","4241");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseResourceConnection.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseResourceConnection.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return connection;
    }
}
