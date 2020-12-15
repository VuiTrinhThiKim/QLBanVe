/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlbanvexe;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author asus
 */
public class LoginController extends BookingController {
    @FXML
    public Button bt2;
    @FXML
    private TextField nameField;
    @FXML
    private PasswordField passwordField;
     
    private final String USERNAME = "admin";
    private final String PASSWORD = "123";
    private final String CSSERRFIELD = "txtFieldError";

   
     
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String username = nameField.getText();
        String password = passwordField.getText();
       
        if (username != null && username .equals(USERNAME)){
            if (password != null && password.equals(PASSWORD)){
                //thanh cong
                validationStyle(true, true);
                Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Login");
                    alert.setHeaderText(null);
                    alert.setContentText("Đăng nhập thành công !");
                    alert.showAndWait();
                
                 try {
                    FXMLLoader loaderDn = new FXMLLoader(getClass().getResource("statistic.fxml"));
                    Stage stageDn = (Stage) bt2.getScene().getWindow();
                    Scene sceneDn = new Scene(loaderDn.load());
                    stageDn.setScene(sceneDn);
                }catch (IOException io){
                    io.printStackTrace();
                }
                              
                 
            } else {
                validationStyle(true, false);
                 Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Login");
                    alert.setHeaderText(null);
                    alert.setContentText("Sai  mật khẩu  đăng nhập !");
                    alert.showAndWait();
                    
                     }
        } else {
            validationStyle(false, false);
             Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Login");
                    alert.setHeaderText(null);
                    alert.setContentText("Sai tên và mật khẩu đăng nhâp!");
                    alert.showAndWait();
        }
       
    }
     public void validationStyle(boolean user, boolean pass){
        if (user){
            nameField.getStyleClass().removeAll("txtFieldError");
            nameField.getStyleClass().add("txtField");
        }else{
            nameField.getStyleClass().add("txtFieldError");
        }
         
        if (pass){
            passwordField.getStyleClass().removeAll("txtFieldError");
            passwordField.getStyleClass().add("txtField");
        }else{
            passwordField.getStyleClass().add("txtFieldError");
        }
    }
    
     @Override   
    public void initialize(URL url, ResourceBundle rb) {
       File file1 = new File("src/manage.jpg");
        Image image1 = new Image(file1.toURI().toString());
        img1.setImage(image1);
        
        File file2 = new File("src/home.png");
        Image image2 = new Image(file2.toURI().toString());
        img2.setImage(image2);
        
        File file5 = new File("src/type.png");
        Image image5 = new Image(file5.toURI().toString());
        img5.setImage(image5);
}
}
            

        
       

