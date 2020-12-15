package com.mycompany.qlbanvexe;

import com.mycompany.qlbanvexe.pojo.KhachHang;
import com.mycompany.qlbanvexe.services.KhachHangServices;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BookingController extends HomepageController implements Initializable {
    @FXML
    public Button btn;
    @FXML
    public ImageView img2;
//    @FXML
//    public ImageView img4;
    @FXML
    public ImageView img5;
//    @FXML
//    public ImageView img6;
//    @FXML
//    public ImageView img7;
    @FXML
    public ComboBox<String> From; 
    @FXML
    public ComboBox<String> To; 
    @FXML
    public ComboBox<String> Type; 
    @FXML
    public ComboBox<String> Time; 
    @FXML
    public ComboBox<String> chooseSeat;
    @FXML
    public TextField Name;
    @FXML
    public TextField Id;
    @FXML
    public TextField phoneNumber;
    @FXML
    public TextField pickupPlace;
    
     @FXML
    private TableColumn <Booking, String> nameColumn;

    @FXML
    private TableColumn <Booking, Integer> phoneColumn;

    @FXML
    private TableColumn <Booking, String> goColumn;

    @FXML
    private TableColumn <Booking, String> seatColumn;
    
    @FXML
    private TableColumn<Booking, Integer> dateColumn;

    @FXML
    private TableColumn <Booking, String> timeColumn;
    
    @FXML
    public TableView<Booking> table;
    
    public ObservableList<Booking> bookingList;
    {
     bookingList = FXCollections.observableArrayList();
    }
   

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
        buildTable();
        From.setItems(place);
        To.setItems(place);
        Time.setItems(time);
        Type.setItems(type);
        chooseSeat.setItems(seat);
//        Date.setTime(12);
         nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        goColumn.setCellValueFactory(new PropertyValueFactory<>("go"));
        seatColumn.setCellValueFactory(new PropertyValueFactory<>("seat"));
//        dateColumn.setCellValueFactory(new PropertyValueFactory<Booking, Integer>("date"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<Booking, Integer>("phone"));
       table.getSelectionModel().getTableView();
  
        File file1 = new File("src/manage.jpg");
        Image image1 = new Image(file1.toURI().toString());
        img1.setImage(image1);
        
        File file2 = new File("src/home.png");
        Image image2 = new Image(file2.toURI().toString());
        img2.setImage(image2);

//        File file4 = new File("src/FromTo.png");
//        Image image4 = new Image(file4.toURI().toString());
//        img4.setImage(image4);
//        
//        File file5 = new File("src/type.png");
//        Image image5 = new Image(file5.toURI().toString());
//        img5.setImage(image5);
//        
//        File file6 = new File("src/calendar.png");
//        Image image6 = new Image(file6.toURI().toString());
//        img6.setImage(image6);
//        
//        File file7 = new File("src/clock.png");
//        Image image7 = new Image(file7.toURI().toString());



//        try {
//            // TODO
//            cbCategories.getItems().addAll(CategoryServices.getCategories());
//            loadQuestions("");
//        } catch (SQLException ex) {
//            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        txtKeyword.textProperty().addListener(evt -> {
//            loadQuestions(txtKeyword.getText());
//        });
        
    
            
            
    }    
    
        
    
     private void buildTable() {
        TableColumn colId = new TableColumn("ID");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        goColumn.setCellValueFactory(new PropertyValueFactory<>("go"));
        seatColumn.setCellValueFactory(new PropertyValueFactory<>("seat"));
//        dateColumn.setCellValueFactory(new PropertyValueFactory<Booking, Integer>("date"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
        
        TableColumn colAction = new TableColumn();
        colAction.setCellFactory(evt -> {
            TableCell cell = new TableCell();
            Button btn = new Button("Xóa");
            btn.setOnMouseClicked(et -> {
                Button b = (Button) et.getSource();
                TableCell c = (TableCell) b.getParent();
               KhachHang q = (KhachHang) c.getTableRow().getItem();
                
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setContentText("Bạn chắc chắn xóa? Nó sẽ xóa các lựa chọn luôn quan!");
                alert.showAndWait().ifPresent(res -> {
                    if (res == ButtonType.OK) {
                        
                    }
                });
                
            });
            
            cell.setGraphic(btn);
            
            return cell;
        });
        
        table.getColumns().addAll(nameColumn,goColumn, seatColumn, timeColumn, phoneColumn);
    }
    public void onBtn1Click(ActionEvent event1) {
       try {
           FXMLLoader loader1 = new FXMLLoader(getClass().getResource("homepage.fxml"));
           Stage stage1 = (Stage) btn.getScene().getWindow();
           Scene scene1 = new Scene(loader1.load());
           stage1.setScene(scene1);
       }catch (IOException io){
           io.printStackTrace();
       }
    }
    

    
    public void reset(ActionEvent event6)
    {
        Name.setText(""); 
        From.setValue("");
        To.setValue("");
        Time.setValue("");
        Type.setValue("");
        chooseSeat.setValue("");
        Id.setText("");
        phoneNumber.setText("");
        pickupPlace.setText("");
    }
    
//   public void setDate(String date) {
//           currentDisplayDate = Calendar.getInstance();
////
// }
    
     public void add (ActionEvent e){
        Booking newBooking = new Booking();
        newBooking.setName(Name.getText());
        newBooking.setPhone(Integer.parseInt(phoneNumber.getText()));
        newBooking.setGo(From.getValue());
        newBooking.setSeat(chooseSeat.getValue());
//        newBooking.setDate.
        newBooking.setTime(Time.getValue());
        bookingList.add(newBooking);
        table.setItems(bookingList);
        
     }
    
     public void delete (ActionEvent e){
        Booking selected = table.getSelectionModel().getSelectedItem();
        bookingList.remove(selected);
        
    }
     
//    public void error (ActionEvent e){
////        String di = From.getValue();
////        String loaiXe = Type.getValue();
////        String gio = Time.getValue();
////        String ghe = chooseSeat.getValue();
//        String ten = Name.getText();
////        String cmnd = Id.getText();
////        String sdt = phoneNumber.getText();
////        String don = pickupPlace.getText();
////    Booking b = new Booking();
//        if (ten == null){
//                Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                    alert.setTitle("Error Information !!!");
//                    alert.setHeaderText(null);
//                    alert.setContentText("Vui lòng nhập nơi xuất phát đi !!!");
//                    alert.showAndWait();
//        }
//    }
//    private final String chuoiRong = "";
//    @FXML
//    private void handleButtonAction(ActionEvent event) {
////        String di = From.getValue();
////        String loaiXe = Type.getValue();
////        String gio = Time.getValue();
////        String ghe = chooseSeat.getValue();
//        String ten = Name.getText();
////        String cmnd = Id.getText();
////        String sdt = phoneNumber.getText();
////        String don = pickupPlace.getText();
////         
//        if (ten != null && ten.equals(chuoiRong)){
//            validationStyle(true);
//                Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                    alert.setTitle("Error Information !!!");
//                    alert.setHeaderText(null);
//                    alert.setContentText("Vui lòng nhập nơi xuất phát đi !!!");
//                    alert.showAndWait();
//        }
//    }
//    
//    public void validationStyle(boolean nhapTen){
//        if (nhapTen){
//            Name.getStyleClass().removeAll("txtFieldError");
//            Name.getStyleClass().add("txtField");
//        }else{
//            Name.getStyleClass().add("txtFieldError");
//        }
//    }
}


