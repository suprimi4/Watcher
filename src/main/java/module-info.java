module com.example.watcher {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.watcher to javafx.fxml;
    exports com.example.watcher;
}