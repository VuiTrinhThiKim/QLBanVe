/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlbanvexe.pojo;

import com.mycompany.qlbanvexe.pojo.Ve;

/** 
 *
 * @author asus
 */
public class KhachHang {
    private int id;
    private String name;
    private int number;
    private String address;
    private int cmnd;

    public KhachHang(String string, String string0, Ve veById) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public KhachHang(int aInt, String string, Ve veById) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public KhachHang(int aInt, String string, int aInt0, String string0, int aInt1, Ve veById) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void KhachHang(int id, String name, int number, String address, int cmnd)
    {
        this.id = id;
        this.name = name;
        this.number = number;
        this.address = address;
        this.cmnd = cmnd;
        
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the cmnd
     */
    public int getCmnd() {
        return cmnd;
    }

    /**
     * @param cmnd the cmnd to set
     */
    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public Object getVe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

