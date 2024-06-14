package com.example.final24dipablo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AjedrezControlador {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}