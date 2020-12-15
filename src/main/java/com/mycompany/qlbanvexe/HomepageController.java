package com.mycompany.qlbanvexe;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HomepageController implements Initializable {
    @FXML
    public Button bt;
    @FXML
    public ImageView img1;
    @FXML
    public ImageView img3;
    
    public void onBtn2Click(ActionEvent event2) {
       try {
           FXMLLoader loader2 = new FXMLLoader(getClass().getResource("booking.fxml"));
           Stage stage2 = (Stage) bt.getScene().getWindow();
           Scene scene2= new Scene(loader2.load());
           stage2.setScene(scene2);
       }catch (IOException io){
           io.printStackTrace();
       }
    }
    
    public void onBtn3Click(ActionEvent event3) {
       try {
           FXMLLoader loader3 = new FXMLLoader(getClass().getResource("booking.fxml"));
           Stage stage3 = (Stage) bt.getScene().getWindow();
           Scene scene3 = new Scene(loader3.load());
           stage3.setScene(scene3);
       }catch (IOException io){
           io.printStackTrace();
       }
    }
    
    public void onBtn4Click(ActionEvent event4) {
       try {
           FXMLLoader loader4 = new FXMLLoader(getClass().getResource("login.fxml"));
           Stage stage4 = (Stage) bt.getScene().getWindow();
           Scene scene4= new Scene(loader4.load());
           stage4.setScene(scene4);
       }catch (IOException io){
           io.printStackTrace();
       }
    }
    
    public void onBtn5Click(ActionEvent event5) {
       try {
           FXMLLoader loader5 = new FXMLLoader(getClass().getResource("booking.fxml"));
           Stage stage5 = (Stage) bt.getScene().getWindow();
           Scene scene5 = new Scene(loader5.load());
           stage5.setScene(scene5);
       }catch (IOException io){
           io.printStackTrace();
       }
    }
    
    public void initialize(URL url, ResourceBundle rb) {
        File file1 = new File("src/manage.jpg");
        Image image1 = new Image(file1.toURI().toString());
        img1.setImage(image1);
        
        File file3 = new File("src/sale.jpg");
        Image image3 = new Image(file3.toURI().toString());
        img3.setImage(image3); 
    }   
}
