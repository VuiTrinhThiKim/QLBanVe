module com.mycompany.qlbanvexe {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.qlbanvexe to javafx.fxml;
    exports com.mycompany.qlbanvexe;
    requires mysql.connector.java;

    requires java.sql;

 
}
