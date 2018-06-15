/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.dao.impl;

import com.ijse.shoppingcart.connection.ResourceConnection;
import com.ijse.shoppingcart.dao.ItemCategoryDao;
import com.ijse.shoppingcart.model.ItemCategoryModel;
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
public class ItemCategoryDaoImpl implements ItemCategoryDao {

    @Override
    public int add(ItemCategoryModel model) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItemCategoryModel> readAll() throws ClassNotFoundException, Exception {
        ResourceConnection resourceConnection = new ResourceConnectionFactory().getResourceConnection();
        List<ItemCategoryModel> listArray = new ArrayList<>();

        try {
            Statement stm = resourceConnection.getConnection().createStatement();
            ResultSet rs = stm.executeQuery("select * from item_category");
            System.out.println(rs);
            ItemCategoryModel md = new ItemCategoryModel();
            while (rs.next()) {
                md=new ItemCategoryModel(rs.getString("icid"),rs.getString("icname"));
              
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
    public int delete(ItemCategoryModel model) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(ItemCategoryModel model) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
