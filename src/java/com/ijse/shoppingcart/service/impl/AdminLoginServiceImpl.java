/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.service.impl;

import com.ijse.shoppingcart.dao.AdminLoginDao;
import com.ijse.shoppingcart.dao.SuperDao;
import com.ijse.shoppingcart.dao.daoFactory.DaoFactory;
import com.ijse.shoppingcart.dto.AdminLoginDto;
import com.ijse.shoppingcart.model.AdminLoginModel;
import com.ijse.shoppingcart.service.AdminLoginService;

/**
 *
 * @author TD Athukorala
 */
public class AdminLoginServiceImpl implements AdminLoginService {

    @Override
    public String checkLoginPassword(String email) throws ClassNotFoundException, Exception {
        System.out.println("Okk");
        AdminLoginDao dao=(AdminLoginDao) DaoFactory.getInstance().getDAOFactory(DaoFactory.DAOType.ADMIN_LOGIN);
        return dao.checkLoginPassword(email);
    }
    
    @Override
    public boolean login(AdminLoginDto dto) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean logout(AdminLoginDto dto) throws ClassNotFoundException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
