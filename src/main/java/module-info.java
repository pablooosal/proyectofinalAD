module com.example.final24dipablo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.pieza to javafx.fxml;
    exports com.example.pieza;

    opens com.example.final24dipablo to javafx.fxml;
    exports com.example.final24dipablo;
}