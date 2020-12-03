/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlbanvexe;

import javafx.scene.control.Alert;
import javafx.stage.Window;

/**
 *
 * @author asus
 */
public class AlertHelper {
    public static void showAlert(Alert.AlertType alertType, Window owner, String title, String mess){
       Alert alert = new Alert(alertType);
       alert.setTitle(title);
       alert.setHeaderText("Pham Hong Ngu");
       alert.setContentText("123");
       alert.initOwner(owner);
       alert.show();
       
    }
}
