/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.service;

import com.ijse.shoppingcart.dto.ItemCategoryDto;
import java.util.List;

/**
 *
 * @author TD Athukorala
 */
public interface ItemCategoryService extends SuperService {
    public boolean add(ItemCategoryDto dto) throws ClassNotFoundException, Exception;

    public List<ItemCategoryDto> readAll() throws ClassNotFoundException, Exception;

    public boolean delete(ItemCategoryDto dto) throws ClassNotFoundException, Exception;

    public boolean update(ItemCategoryDto dto) throws ClassNotFoundException, Exception;
}
