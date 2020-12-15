/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlbanvexe.pojo;

import java.sql.Date;
import javafx.scene.control.DatePicker;

/**
 *
 * @author asus
 */
public class Ve {
    private int idVe;
    private String Tuyen;
    private int Ghe;
    private String loaiXe;
    private Date gioKhoiHanh;

    public Ve(int idVe, String Tuyen, int Ghe, String loaiXe, Date gioKhoiHanh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Ve(int idVe, String Tuyen, int Ghe, String loaiXe,Date gioKhoiHanh)
    {
        this.idVe =idVe;
        this.Tuyen = Tuyen;
        this.Ghe = Ghe;
        this.loaiXe = loaiXe;
        this.gioKhoiHanh = gioKhoiHanh;
    }
    /**
     * @return the idVe
     */
    public int getIdVe() {
        return idVe;
    }

    /**
     * @param idVe the idVe to set
     */
    public void setIdVe(int idVe) {
        this.idVe = idVe;
    }

    /**
     * @return the Tuyen
     */
    public String getTuyen() {
        return Tuyen;
    }

    /**
     * @param Tuyen the Tuyen to set
     */
    public void setTuyen(String Tuyen) {
        this.Tuyen = Tuyen;
    }

    /**
     * @return the Ghe
     */
    public int getGhe() {
        return Ghe;
    }

    /**
     * @param Ghe the Ghe to set
     */
    public void setGhe(int Ghe) {
        this.Ghe = Ghe;
    }

    /**
     * @return the loaiXe
     */
    public String getLoaiXe() {
        return loaiXe;
    }

    /**
     * @param loaiXe the loaiXe to set
     */
    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    /**
     * @return the gioKhoiHanh
     */
    public Date getGioKhoiHanh() {
        return gioKhoiHanh;
    }

    /**
     * @param gioKhoiHanh the gioKhoiHanh to set
     */
    public void setGioKhoiHanh(Date gioKhoiHanh) {
        this.gioKhoiHanh = gioKhoiHanh;
    }
    
    
}
