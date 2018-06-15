/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.service;

import com.ijse.shoppingcart.dto.ItemDto;
import java.util.List;

/**
 *
 * @author TD Athukorala
 */
public interface ItemService extends SuperService {
    public int add(ItemDto dto) throws ClassNotFoundException, Exception;

    public List<ItemDto> readAll() throws ClassNotFoundException, Exception;

    public int delete(ItemDto dto) throws ClassNotFoundException, Exception;

    public int update(ItemDto dto) throws ClassNotFoundException, Exception;
    
    public List<ItemDto> searchItemInCategory(String value) throws ClassNotFoundException, Exception; 
}
