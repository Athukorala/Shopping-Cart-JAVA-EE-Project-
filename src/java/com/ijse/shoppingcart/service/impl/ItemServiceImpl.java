/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.service.impl;

import com.ijse.shoppingcart.dao.ItemDao;
import com.ijse.shoppingcart.dao.daoFactory.DaoFactory;
import com.ijse.shoppingcart.dto.ItemDto;
import com.ijse.shoppingcart.model.ItemModel;
import com.ijse.shoppingcart.service.ItemService;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author TD Athukorala
 */
public class ItemServiceImpl  implements ItemService{

    @Override
    public int add(ItemDto dto) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItemDto> readAll() throws ClassNotFoundException, Exception {
        ItemDao dao = (ItemDao) DaoFactory.getInstance().getDAOFactory(DaoFactory.DAOType.ITEM);
        List<ItemDto> itemArray=new ArrayList<>();
        ItemDto dto=new ItemDto();
        
        List<ItemModel> model= dao.readAll();
        for (ItemModel mod : model) {
            dto=new ItemDto(mod.getIcname(),mod.getIqty(), mod.getIname(),  mod.getIprice());
            itemArray.add(dto);
        }

        return itemArray;
    
    }

    @Override
    public int delete(ItemDto dto) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(ItemDto dto) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
