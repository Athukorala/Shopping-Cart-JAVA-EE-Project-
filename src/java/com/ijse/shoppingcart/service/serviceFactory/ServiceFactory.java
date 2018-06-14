/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.service.serviceFactory;

import com.ijse.shoppingcart.service.SuperService;
import com.ijse.shoppingcart.service.impl.AdminLoginServiceImpl;
import com.ijse.shoppingcart.service.impl.AdminServiceImpl;
import com.ijse.shoppingcart.service.impl.CustomerServiceImpl;
import com.ijse.shoppingcart.service.impl.ItemCategoryServiceImpl;
import com.ijse.shoppingcart.service.impl.ItemServiceImpl;

/**
 *
 * @author TD Athukorala
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    private ServiceFactory(){
        
    }
    public enum ServiceType{
       ADMIN, ADMIN_LOGIN, CUSTOMER, ITEM, ITEM_CATEGORY
    }
    
    public static ServiceFactory getInstance(){
        if(serviceFactory==null){
            serviceFactory=new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getServiceFactory(ServiceType type){
        switch(type){
            
            case ADMIN:
                return new AdminServiceImpl();
            case ADMIN_LOGIN:
                return new AdminLoginServiceImpl();
            case CUSTOMER:
                return new CustomerServiceImpl();
            case ITEM:
                return new ItemServiceImpl();
            case ITEM_CATEGORY:
                return new ItemCategoryServiceImpl();
            
            default: return null;
        }
    } 
}
