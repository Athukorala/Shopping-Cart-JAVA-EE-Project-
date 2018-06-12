/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.model;

/**
 *
 * @author TD Athukorala
 */
public class AdminLoginModel {

    private String aid;
    private String aemail;
    private String apassword;

    public AdminLoginModel() {
    }

    public AdminLoginModel(String aid, String aemail, String apassword) {
        this.aid = aid;
        this.aemail = aemail;
        this.apassword = apassword;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

}
