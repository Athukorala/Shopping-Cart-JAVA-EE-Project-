/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.service.serviceFactory;

import com.ijse.libsystem.service.SuperService;

/**
 *
 * @author TD Athukorala
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    private ServiceFactory(){
        
    }
    public enum ServiceType{
       //-
    }
    
    public static ServiceFactory getInstance(){
        if(serviceFactory==null){
            serviceFactory=new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getServiceFactory(ServiceType type){
        switch(type){
//            case BOOK:return new BookService();
            default: return null;
        }
    } 
}
