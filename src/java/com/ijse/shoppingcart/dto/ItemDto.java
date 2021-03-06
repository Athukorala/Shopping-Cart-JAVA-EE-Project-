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
    private double iprice;
    private String icname;

    public ItemDto() {
    }

    public ItemDto(String iid, String icid, String iname, int iqty, double iprice) {
        this.iid = iid;
        this.icid = icid;
        this.iname = iname;
        this.iqty = iqty;
        this.iprice = iprice;
    }

   
    public ItemDto(String icname, int iqty, String iname,  double iprice) {
       
        this.icname = icname;
        this.iname = iname;
        this.iqty = iqty;
        this.iprice = iprice;
    }

    public ItemDto(String iname, int iqty, double iprice) {

        this.iname = iname;
        this.iqty = iqty;
        this.iprice = iprice;
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

    public double getIprice() {
        return iprice;
    }

    public void setIprice(double iprice) {
        this.iprice = iprice;
    }

    public String getIcname() {
        return icname;
    }

    public void setIcname(String icname) {
        this.icname = icname;
    }

}
