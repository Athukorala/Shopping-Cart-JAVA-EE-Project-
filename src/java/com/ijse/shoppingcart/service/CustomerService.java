/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.service;

import com.ijse.shoppingcart.dto.CustomerDto;
import java.util.List;

/**
 *
 * @author TD Athukorala
 */
public interface CustomerService extends SuperService {
    public boolean add(CustomerDto dto) throws ClassNotFoundException, Exception;

    public List<CustomerDto> readAll() throws ClassNotFoundException, Exception;

    public boolean delete(CustomerDto dto) throws ClassNotFoundException, Exception;

    public boolean update(CustomerDto dto) throws ClassNotFoundException, Exception;
}
