/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlbanvexe;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
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
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author asus
 */
public class loginController extends PrimaryController{
    @FXML
    public Button bt;
    @FXML
    private TextField nameField;
    @FXML
    private PasswordField passwordField;
     
    private final String _USERNAME = "ngu";
    private final String _PASSWORD = "123";
    private final String _CSSERRFIELD = "txtFieldError";
     
     
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String username = nameField.getText();
        String password = passwordField.getText();
         
        if (username != null && username .equals(_USERNAME)){
            if (password != null && password.equals(_PASSWORD)){
                //thanh cong
                validationStyle(true, true);
                 try {
                    FXMLLoader loaderDn = new FXMLLoader(getClass().getResource("statistic.fxml"));
                    Stage stageDn = (Stage) bt.getScene().getWindow();
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
                    alert.setContentText("Login unsuccess!");
                    alert.showAndWait();
                     }
        } else {
            validationStyle(false, false);
             Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Login");
                    alert.setHeaderText(null);
                    alert.setContentText("Login unsuccess!");
                    alert.showAndWait();
        }
    }
     public void validationStyle(boolean _user, boolean _pass){
        if (_user){
            nameField.getStyleClass().removeAll("txtFieldError");
            nameField.getStyleClass().add("txtField");
        }else{
            nameField.getStyleClass().add("txtFieldError");
        }
         
        if (_pass){
            passwordField.getStyleClass().removeAll("txtFieldError");
            passwordField.getStyleClass().add("txtField");
        }else{
            passwordField.getStyleClass().add("txtFieldError");
        }
    }

//       
//   public void onBtnDNClick(ActionEvent eventDn) {
//       try {
//           FXMLLoader loaderDn = new FXMLLoader(getClass().getResource("statistic.fxml"));
//           Stage stageDn = (Stage) bt.getScene().getWindow();
//           Scene sceneDn = new Scene(loaderDn.load());
//           stageDn.setScene(sceneDn);
//       }catch (IOException io){
//           io.printStackTrace();
//       }
//    }

   
    

    
      

//        
    
           
    

     @Override   
    public void initialize(URL url, ResourceBundle rb) {

}
                   }
            

        
       

