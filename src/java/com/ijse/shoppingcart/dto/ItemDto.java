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
public class ItemDto {

    private String iid;
    private String icid;
    private String iname;
    private int iqty;

    public ItemDto() {
    }

    public ItemDto(String iid, String icid, String iname, int iqty) {
        this.iid = iid;
        this.icid = icid;
        this.iname = iname;
        this.iqty = iqty;
    }

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public String getIcid() {
        return icid;
    }

    public void setIcid(String icid) {
        this.icid = icid;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public int getIqty() {
        return iqty;
    }

    public void setIqty(int iqty) {
        this.iqty = iqty;
    }
}
