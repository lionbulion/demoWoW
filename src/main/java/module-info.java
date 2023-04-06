module com.example.demowow {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demowow to javafx.fxml;
    exports com.example.demowow;
}