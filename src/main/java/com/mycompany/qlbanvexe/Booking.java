/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlbanvexe;

import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 *
 * @author asus
 */
public class Booking {
    public String name;
    public int phone;
    public String go;
    public String seat;
    public String time;

    public Booking(String name, String go, String seat, String time, int phone) {
        this.name = name;
        this.go = go;
        this.seat = seat;
     
        this.time = time;
        this.phone = phone;
    }

    public Booking() {
    }

//    Booking(TextField Name, ComboBox<String> From, ComboBox<String> chooseSeat, ObservableList<String> time, TextField phoneNumber) {
//        
//    }

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
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @return the go
     */
    public String getGo() {
        return go;
    }

    /**
     * @param go the go to set
     */
    public void setGo(String go) {
        this.go = go;
    }

    /**
     * @return the seat
     */
    public String getSeat() {
        return seat;
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    /**
     * @return the date
     */
//    public int getDate() {
//        return date;
//    }
//
//    /**
//     * @param date the date to set
//     */
//    public void setDate(int date) {
//        this.date = date;
//    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the date
     */
   
    
}

    

