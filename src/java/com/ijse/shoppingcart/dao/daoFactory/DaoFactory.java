/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.dao.daoFactory;

import com.ijse.shoppingcart.dao.SuperDao;
import com.ijse.shoppingcart.dao.impl.AdminDaoImpl;
import com.ijse.shoppingcart.dao.impl.AdminLoginDaoImpl;
import com.ijse.shoppingcart.dao.impl.CustomerDaoImpl;
import com.ijse.shoppingcart.dao.impl.ItemCategoryDaoImpl;
import com.ijse.shoppingcart.dao.impl.ItemDaoImpl;

/**
 *
 * @author TD Athukorala
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {

    }

    public enum DAOType {
        ADMIN, ADMIN_LOGIN, CUSTOMER, ITEM, ITEM_CATEGORY
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDAOFactory(DAOType type) {
        switch (type) {
            case ADMIN:
                return new AdminDaoImpl();
            case ADMIN_LOGIN:
                return new AdminLoginDaoImpl();
            case CUSTOMER:
                return new CustomerDaoImpl();
            case ITEM:
                return new ItemDaoImpl();
            case ITEM_CATEGORY:
                return new ItemCategoryDaoImpl();

            default:
                return null;
        }
    }

}
