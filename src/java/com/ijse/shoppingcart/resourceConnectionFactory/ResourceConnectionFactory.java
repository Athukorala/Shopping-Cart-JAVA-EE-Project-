/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.resourceConnectionFactory;

import com.ijse.shoppingcart.connection.DatabaseResourceConnection;
import com.ijse.shoppingcart.connection.ResourceConnection;

/**
 *
 * @author TD Athukorala
 */
public class ResourceConnectionFactory {
     public ResourceConnection getResourceConnection()throws Exception{
        return new DatabaseResourceConnection();
    }

}
