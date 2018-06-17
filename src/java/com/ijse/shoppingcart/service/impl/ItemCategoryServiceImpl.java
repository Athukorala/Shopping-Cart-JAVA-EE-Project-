/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.service.impl;

import com.ijse.shoppingcart.dao.ItemCategoryDao;
import com.ijse.shoppingcart.dao.daoFactory.DaoFactory;
import com.ijse.shoppingcart.dto.ItemCategoryDto;
import com.ijse.shoppingcart.model.ItemCategoryModel;
import com.ijse.shoppingcart.service.ItemCategoryService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TD Athukorala
 */
public class ItemCategoryServiceImpl implements ItemCategoryService {

    @Override
    public boolean add(ItemCategoryDto dto) throws ClassNotFoundException, Exception {
       ItemCategoryDao dao=(ItemCategoryDao) DaoFactory.getInstance().getDAOFactory(DaoFactory.DAOType.ITEM_CATEGORY);
        ItemCategoryModel model=new ItemCategoryModel(0, dto.getIcname());
        boolean res = false;

        res = (0 < dao.add(model));

        return res;
        
    
    }

    @Override
    public List<ItemCategoryDto> readAll() throws ClassNotFoundException, Exception {
        
        ItemCategoryDao dao=(ItemCategoryDao) DaoFactory.getInstance().getDAOFactory(DaoFactory.DAOType.ITEM_CATEGORY);
        List<ItemCategoryModel> modelArray=dao.readAll();
        List<ItemCategoryDto> dtoArray = new ArrayList<>();
        for (ItemCategoryModel md : modelArray) {
            ItemCategoryDto dto=new ItemCategoryDto(md.getIcid(), md.getIcname());
            dtoArray.add(dto);
        }
        return dtoArray;
    }

    @Override
    public boolean delete(ItemCategoryDto dto) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ItemCategoryDto dto) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
