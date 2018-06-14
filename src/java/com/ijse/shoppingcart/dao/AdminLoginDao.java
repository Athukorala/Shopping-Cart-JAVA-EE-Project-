/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.dao;

import com.ijse.shoppingcart.model.AdminLoginModel;
import java.util.List;

/**
 *
 * @author TD Athukorala
 */
public interface AdminLoginDao extends SuperDao {

    public int login(AdminLoginModel model) throws ClassNotFoundException, Exception;

    public int logout(AdminLoginModel model) throws ClassNotFoundException, Exception;
    
    public String checkLoginPassword(String email) throws ClassNotFoundException, Exception;

}
