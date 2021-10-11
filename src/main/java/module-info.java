module com.example.leestephenscomp1011assignment1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.leestephenscomp1011assignment1 to javafx.fxml;
    exports com.example.leestephenscomp1011assignment1;
}