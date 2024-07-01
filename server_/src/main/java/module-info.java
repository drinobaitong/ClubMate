module com.example.server_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.server_ to javafx.fxml;
    exports com.example.server_;
}