/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlbanvexe;

/**
 *
 * @author ACER
 */
import java.io.File;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.UUID;
import java.util.jar.Attributes.Name;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class StatisticController extends BookingController{
    @FXML
    public TableView<Booking> table1;
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File file1 = new File("src/manage.jpg");
        Image image1 = new Image(file1.toURI().toString());
        img1.setImage(image1);
        
        File file2 = new File("src/home.png");
        Image image2 = new Image(file2.toURI().toString());
        img2.setImage(image2);
       
    }
     
    
   
    
    public void changeSceneBookingDetail(ActionEvent e) throws IOException {
        Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("BookingDetail.fxml"));
        Parent bookingViewParent = loader.load();
        Scene scene = new Scene(bookingViewParent);
        BookingDetailController controller = loader.getController();
        Booking selected = table.getSelectionModel().getSelectedItem();
        controller.setBooking(selected);
        stage.setScene(scene);
    }
}
