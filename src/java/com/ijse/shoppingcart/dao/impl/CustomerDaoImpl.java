/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.dao.impl;

import com.ijse.shoppingcart.connection.ResourceConnection;
import com.ijse.shoppingcart.dao.CustomerDao;
import com.ijse.shoppingcart.model.CustomerModel;
import com.ijse.shoppingcart.resourceConnectionFactory.ResourceConnectionFactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TD Athukorala
 */
public class CustomerDaoImpl implements CustomerDao{

    @Override
    public int add(CustomerModel model) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerModel> readAll() throws ClassNotFoundException, Exception {
        ResourceConnection resourceConnection = new ResourceConnectionFactory().getResourceConnection();
        List<CustomerModel> listArray=new ArrayList<>();

        try {
            Statement stm = resourceConnection.getConnection().createStatement();
            ResultSet rs = stm.executeQuery("select * from Customer");
            System.out.println(rs);
            CustomerModel md = new CustomerModel();
            while (rs.next()) {
                md=new CustomerModel(rs.getString("cid"),rs.getString("cname"),rs.getString("caddress"),rs.getString("cmobile"),rs.getString("cusername"));
                System.out.println(rs.getString("cid"));
                listArray.add(md);
            }
            return listArray;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminLoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(AdminLoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
    
    }

    @Override
    public int delete(CustomerModel model) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(CustomerModel model) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String checkLoginPassword(String email) throws ClassNotFoundException, Exception {
        
    ResourceConnection resourceConnection = new ResourceConnectionFactory().getResourceConnection();
        String res = null;

        try {
            Statement stm = resourceConnection.getConnection().createStatement();
             ResultSet rs = stm.executeQuery(" select c.cname,aes_decrypt(c.cpassword,c.cusername) from customer c where c.cusername='"+email+"'");
            String password = null;
            while (rs.next()) {
                password = rs.getString("aes_decrypt(c.cpassword,c.cusername)");
                
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
    
}
