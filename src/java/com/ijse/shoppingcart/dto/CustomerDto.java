/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.dto;

/**
 *
 * @author TD Athukorala
 */
public class CustomerDto {

    private String cid;
    private String cname;
    private String caddress;
    private String cmobile;
    private String cusername;
    private String cpassword;

    public CustomerDto() {
    }

    public CustomerDto(String cid, String cname, String caddress, String cmobile, String cusername, String cpassword) {
        this.cid = cid;
        this.cname = cname;
        this.caddress = caddress;
        this.cmobile = cmobile;
        this.cusername = cusername;
        this.cpassword = cpassword;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public String getCmobile() {
        return cmobile;
    }

    public void setCmobile(String cmobile) {
        this.cmobile = cmobile;
    }

    public String getCusername() {
        return cusername;
    }

    public void setCusername(String cusername) {
        this.cusername = cusername;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }
}
