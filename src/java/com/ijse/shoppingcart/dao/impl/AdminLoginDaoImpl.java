/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.dao.impl;

import com.ijse.shoppingcart.connection.ResourceConnection;
import com.ijse.shoppingcart.dao.AdminLoginDao;
import com.ijse.shoppingcart.model.AdminLoginModel;
import com.ijse.shoppingcart.resourceConnectionFactory.ResourceConnectionFactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;

/**
 *
 * @author TD Athukorala
 */
public class AdminLoginDaoImpl implements AdminLoginDao {

    @Override
    public String checkLoginPassword(String email) throws ClassNotFoundException, Exception {
        ResourceConnection resourceConnection = new ResourceConnectionFactory().getResourceConnection();
        String res = null;

        try {
            Statement stm = resourceConnection.getConnection().createStatement();
           ResultSet rs = stm.executeQuery(" select aes_decrypt(apassword,aemail) from Admin_Login where aemail='"+email+"'");
            String password = null;
            while (rs.next()) {
                password = rs.getString("aes_decrypt(apassword,aemail)");
                
            }
            return password;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminLoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(AdminLoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
       

    }

    @Override
    public int login(AdminLoginModel model) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int logout(AdminLoginModel model) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
