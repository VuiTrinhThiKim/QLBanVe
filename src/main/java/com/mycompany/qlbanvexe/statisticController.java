/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlbanvexe;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

/**
 *
 * @author asus
 */
public class statisticController extends loginController{
    @FXML
    public ComboBox<String> Place; 
    public ComboBox<String> Time; 
    public ComboBox<String> Type; 
    public ComboBox<String> chooseSeat;
    
    ObservableList<String> place = FXCollections.observableArrayList ("Gia Lai - TPHCM", "TPHCM - Gia Lai","Hà Nội - TPHCM", "TPHCM - Hà Nội");
    ObservableList<String> time = FXCollections.observableArrayList("01:10", "02:20", "03:30", "04:40", "05:50",
            "06:00", "07:15", "08:25", "09:35", "10:45", "11:05", "12:55");
    
    ObservableList<String> type = FXCollections.observableArrayList("Thường: Ghế ngồi", "Thường: Giường nằm", "VIP: LIMOUSINE");
            
    ObservableList<String> seat = FXCollections.observableArrayList("A01", "A02", "A03", "A04", "A05", "B01", "B02", "B03", "B04", "B05");
    
     @Override   
    public void initialize(URL url, ResourceBundle rb) {
       
        Place.setItems(place);
        Time.setItems(time);
        Type.setItems(type);
       

}
    
}
