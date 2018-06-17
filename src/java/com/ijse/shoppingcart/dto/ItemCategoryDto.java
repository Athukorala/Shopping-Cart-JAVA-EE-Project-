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
public class ItemCategoryDto {

    private int icid;
    private String icname;

    public ItemCategoryDto() {
    }

    public ItemCategoryDto(int icid, String icname) {
        this.icid = icid;
        this.icname = icname;
    }

    public int getIcid() {
        return icid;
    }

    public void setIcid(int icid) {
        this.icid = icid;
    }

    public String getIcname() {
        return icname;
    }

    public void setIcname(String icname) {
        this.icname = icname;
    }
}
