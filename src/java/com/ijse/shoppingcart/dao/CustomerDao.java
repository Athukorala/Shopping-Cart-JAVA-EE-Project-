/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.dao;

import com.ijse.shoppingcart.model.CustomerModel;
import java.util.List;

/**
 *
 * @author TD Athukorala
 */
public interface CustomerDao extends SuperDao {

    public int add(CustomerModel model) throws ClassNotFoundException, Exception;

    public List<CustomerModel> readAll() throws ClassNotFoundException, Exception;

    public int delete(CustomerModel model) throws ClassNotFoundException, Exception;

    public int update(CustomerModel model) throws ClassNotFoundException, Exception;
}
