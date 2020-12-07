/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

<<<<<<< HEAD

package com.mycompany.qlbanvexe;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.sql.Connection;
import com.mysql.jdbc.Driver;

/**
 *
 * @author asus
 */
public class statisticController  extends loginController {
    
    
    public void initialize(URL url, ResourceBundle rb) {
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }  
    @FXML
    private void Add(ActionEvent eventA){
       
        
    }
    
}
=======
//package com.mysql.jdbc;
//import com.mycompany.qlbanvexe.loginController;
//import java.net.URL;
//import java.util.ResourceBundle;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
///**
// *
// * @author asus
// */
//public class statisticController  extends loginController {
//    
//    
//    public void initialize(URL url, ResourceBundle rb) {
//       
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
//        
//    }  
//    @FXML
//    private void Add(ActionEvent eventA){
//        Connection Conn = DriverManager.
//        
//    }
//    
//}
>>>>>>> ef39591bfd70c9626301ecd8577efb082427e61a
