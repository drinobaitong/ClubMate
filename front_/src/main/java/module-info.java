module com.example.front_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.front_ to javafx.fxml;
    exports com.example.front_;
}