/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlbanvexe;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author ACER
 */
public class BookingDetailController {
    @FXML
    Label nameLabel;
    @FXML
    Label phoneLabel;
    @FXML
    Label goLabel;
    @FXML
    Label seatLabel;
//    @FXML
//    Label dateLabel;
    @FXML
    Label timeLabel;

    public void setBooking(Booking booking){
        nameLabel.setText(booking.getName());
        phoneLabel.setText(String.valueOf(booking.getPhone()));
        goLabel.setText(booking.getGo());
        seatLabel.setText(booking.getSeat());
//        dateLabel.setText(String.valueOf(booking.getDate()));
        timeLabel.setText(String.valueOf(booking.getTime()));
    }
    
    public void goBack(ActionEvent e) throws IOException {
        Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("booking.fxml"));
        Parent sampleParent = loader.load();
        Scene scene = new Scene(sampleParent);
        stage.setScene(scene);
    }
}

