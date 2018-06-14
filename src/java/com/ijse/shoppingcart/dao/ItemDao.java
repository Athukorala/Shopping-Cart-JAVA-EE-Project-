/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.dao;

import com.ijse.shoppingcart.model.ItemModel;
import java.util.List;

/**
 *
 * @author TD Athukorala
 */
public interface ItemDao extends SuperDao {
    public int add(ItemModel model) throws ClassNotFoundException, Exception;

    public List<ItemModel> readAll() throws ClassNotFoundException, Exception;

    public int delete(ItemModel model) throws ClassNotFoundException, Exception;

    public int update(ItemModel model) throws ClassNotFoundException, Exception;
}
