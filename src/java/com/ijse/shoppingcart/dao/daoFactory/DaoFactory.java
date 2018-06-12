/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.dao.daoFactory;

import com.ijse.shoppingcart.dao.SuperDao;


/**
 *
 * @author TD Athukorala
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    private DaoFactory(){
        
    }
    public enum DAOType{
        ADMIN,ADMIN_LOGIN,CUSTOMER,ITEM,ITEM_CATEGORY
    }
     
    public static DaoFactory getInstance(){
        if(daoFactory==null){
            daoFactory=new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDAOFactory(DAOType type){
        switch(type){
           
            default:
                    return null;
        }
    }

}
