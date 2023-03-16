module com.example.analiz {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.analiz to javafx.fxml;
    exports com.example.analiz;
}