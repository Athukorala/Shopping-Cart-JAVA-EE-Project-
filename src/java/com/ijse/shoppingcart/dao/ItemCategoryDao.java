/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.dao;

import com.ijse.shoppingcart.model.ItemCategoryModel;
import java.util.List;

/**
 *
 * @author TD Athukorala
 */
public interface ItemCategoryDao extends SuperDao {
    public int add(ItemCategoryModel model) throws ClassNotFoundException, Exception;

    public List<ItemCategoryModel> readAll() throws ClassNotFoundException, Exception;

    public int delete(ItemCategoryModel model) throws ClassNotFoundException, Exception;

    public int update(ItemCategoryModel model) throws ClassNotFoundException, Exception;
}
