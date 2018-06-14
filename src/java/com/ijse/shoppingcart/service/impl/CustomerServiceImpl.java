/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.service.impl;

import com.ijse.shoppingcart.dao.AdminLoginDao;
import com.ijse.shoppingcart.dao.CustomerDao;
import com.ijse.shoppingcart.dao.daoFactory.DaoFactory;
import com.ijse.shoppingcart.dto.CustomerDto;
import com.ijse.shoppingcart.model.CustomerModel;
import com.ijse.shoppingcart.service.CustomerService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TD Athukorala
 */
public class CustomerServiceImpl implements CustomerService {

    @Override
    public boolean add(CustomerDto dto) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerDto> readAll() throws ClassNotFoundException, Exception {
        CustomerDao dao = (CustomerDao) DaoFactory.getInstance().getDAOFactory(DaoFactory.DAOType.CUSTOMER);
        List<CustomerDto> cusArray=new ArrayList<>();
        CustomerDto dto=new CustomerDto();
        
        List<CustomerModel> model= dao.readAll();
        for (CustomerModel mod : model) {
            dto=new CustomerDto(mod.getCid(), mod.getCname(), mod.getCaddress(), mod.getCmobile(), mod.getCusername());
            cusArray.add(dto);
        }

        return cusArray;
    }

    @Override
    public boolean delete(CustomerDto dto) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(CustomerDto dto) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String checkLoginPassword(String email) throws ClassNotFoundException, Exception {
        
        CustomerDao dao=(CustomerDao) DaoFactory.getInstance().getDAOFactory(DaoFactory.DAOType.CUSTOMER);
        return dao.checkLoginPassword(email);
    }

}
