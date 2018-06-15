/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.dao.impl;

import com.ijse.shoppingcart.connection.ResourceConnection;
import com.ijse.shoppingcart.dao.ItemDao;
import com.ijse.shoppingcart.model.ItemModel;
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
public class ItemDaoImpl implements ItemDao {

    @Override
    public int add(ItemModel model) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItemModel> readAll() throws ClassNotFoundException, Exception {
        ResourceConnection resourceConnection = new ResourceConnectionFactory().getResourceConnection();
        List<ItemModel> listArray = new ArrayList<>();

        try {
            Statement stm = resourceConnection.getConnection().createStatement();
            ResultSet rs = stm.executeQuery("select * from item i, item_category ic where i.icid=ic.icid;");
            System.out.println(rs);
            ItemModel md = new ItemModel();
            while (rs.next()) {
                md = new ItemModel(rs.getString("iid"), rs.getString("icid"), rs.getString("iname"), rs.getInt("iqty"), rs.getDouble("iprice"), rs.getString("icname"));

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

        //select * from item i, item_category ic where i.icid=ic.icid;
    }

    @Override
    public int delete(ItemModel model) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(ItemModel model) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItemModel> searchItemInCategory(String value) throws ClassNotFoundException, Exception {
        ResourceConnection resourceConnection = new ResourceConnectionFactory().getResourceConnection();
        List<ItemModel> listArray = new ArrayList<>();

        try {
            Statement stm = resourceConnection.getConnection().createStatement();
            ResultSet rs = stm.executeQuery("select iname,iqty,iprice from item i,item_category ic where i.icid=ic.icid && ic.icname='" + value + "'");
            System.out.println(rs);
            ItemModel md = new ItemModel();
            while (rs.next()) {
                md = new ItemModel(rs.getString("iname"), rs.getInt("iqty"), rs.getDouble("iprice"));

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

}
