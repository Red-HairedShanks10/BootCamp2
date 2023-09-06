module com.example.javafx_book6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_book6 to javafx.fxml;
    exports com.example.javafx_book6;
}