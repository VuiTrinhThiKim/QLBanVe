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

public class PrimaryController implements Initializable{
    @FXML
    public Button bt;
    public ImageView img1;
    public ImageView img2;
    public ImageView img3;
    
    
    
    public void onBtn1Click(ActionEvent event1) {
       try {
           FXMLLoader loader1 = new FXMLLoader(getClass().getResource("primary.fxml"));
           Stage stage1 = (Stage) bt.getScene().getWindow();
           Scene scene1 = new Scene(loader1.load());
           stage1.setScene(scene1);
       }catch (IOException io){
           io.printStackTrace();
       }
    }
    
    public void onBtn2Click(ActionEvent event2) {
       try {
           FXMLLoader loader2 = new FXMLLoader(getClass().getResource("secondary.fxml"));
           Stage stage2 = (Stage) bt.getScene().getWindow();
           Scene scene2= new Scene(loader2.load());
           stage2.setScene(scene2);
       }catch (IOException io){
           io.printStackTrace();
       }
    }
    
    public void onBtn3Click(ActionEvent event3) {
       try {
           FXMLLoader loader3 = new FXMLLoader(getClass().getResource("secondary.fxml"));
           Stage stage3 = (Stage) bt.getScene().getWindow();
           Scene scene3 = new Scene(loader3.load());
           stage3.setScene(scene3);
       }catch (IOException io){
           io.printStackTrace();
       }
    }
    
    
    
    public void onBtn5Click(ActionEvent event5) {
       try {
           FXMLLoader loader5 = new FXMLLoader(getClass().getResource("secondary.fxml"));
           Stage stage5 = (Stage) bt.getScene().getWindow();
           Scene scene5 = new Scene(loader5.load());
           stage5.setScene(scene5);
       }catch (IOException io){
           io.printStackTrace();
       }
    }
    
    
    public void onBtn6Click(ActionEvent event6) {
       try {
           FXMLLoader loader6 = new FXMLLoader(getClass().getResource("info.fxml"));
           Stage stage6 = (Stage) bt.getScene().getWindow();
           Scene scene6 = new Scene(loader6.load());
           stage6.setScene(scene6);
       }catch (IOException io){
           io.printStackTrace();
       }
    }
    public void onBtn7Click(ActionEvent event7) {
       try {
           FXMLLoader loader7 = new FXMLLoader(getClass().getResource("login.fxml"));
           Stage stage7 = (Stage) bt.getScene().getWindow();
           Scene scene7 = new Scene(loader7.load());
           stage7.setScene(scene7);
       }catch (IOException io){
           io.printStackTrace();
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
        
        File file3 = new File("src/sale.jpg");
        Image image3 = new Image(file3.toURI().toString());
        img3.setImage(image3); 
    }
    
    
}
