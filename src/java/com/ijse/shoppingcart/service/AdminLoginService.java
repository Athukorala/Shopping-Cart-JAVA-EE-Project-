/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.service;

import com.ijse.shoppingcart.dto.AdminLoginDto;


/**
 *
 * @author TD Athukorala
 */
public interface AdminLoginService extends SuperService{
    public boolean login(AdminLoginDto dto) throws ClassNotFoundException, Exception;

    public boolean logout(AdminLoginDto dto) throws ClassNotFoundException, Exception;
}
