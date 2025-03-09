module com.example.miniproyect1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.miniproyect1 to javafx.fxml;
    exports com.example.miniproyect1;
}