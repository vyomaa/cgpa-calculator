module com.example.cgpa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cgpa to javafx.fxml;
    exports com.example.cgpa;
}