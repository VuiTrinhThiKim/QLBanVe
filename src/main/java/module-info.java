module com.mycompany.qlbanvexe {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.qlbanvexe to javafx.fxml;
    exports com.mycompany.qlbanvexe;
    requires mysql.connector.java;
<<<<<<< HEAD
    requires java.sql;
=======
>>>>>>> ef39591bfd70c9626301ecd8577efb082427e61a
}
