module com.example.tipmodifiedcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tipmodifiedcalculator to javafx.fxml;
    exports com.example.tipmodifiedcalculator;
}