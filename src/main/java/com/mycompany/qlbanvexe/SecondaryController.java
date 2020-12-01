package com.mycompany.qlbanvexe;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class SecondaryController implements Initializable{
    @FXML
    public ComboBox<String> From; 
    public ComboBox<String> To;
    @FXML
    public ComboBox<String> Time; 
    public ComboBox<String> Type; 
    public ComboBox<String> chooseSeat;
    
    ObservableList<String> place = FXCollections.observableArrayList("An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Đà Nẵng", 
            "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Cần Thơ", 
            "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp","Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", 
            "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang","Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", 
            "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", 
            "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "TP Hồ Chí Minh",
            "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Phú Yên");
    
    ObservableList<String> time = FXCollections.observableArrayList("01:10", "02:20", "03:30", "04:40", "05:50",
            "06:00", "07:15", "08:25", "09:35", "10:45", "11:05", "12:55");
    
    ObservableList<String> type = FXCollections.observableArrayList("Thường: Ghế ngồi", "Thường: Giường nằm", "VIP: LIMOUSINE");
            
    ObservableList<String> seat = FXCollections.observableArrayList("A01", "A02", "A03", "A04", "A05", "B01", "B02", "B03", "B04", "B05");
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        From.setItems(place);
        To.setItems(place);
        Time.setItems(time);
        Type.setItems(type);
        chooseSeat.setItems(seat);
    }
}