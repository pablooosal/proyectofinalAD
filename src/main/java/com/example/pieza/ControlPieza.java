package com.example.pieza;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class ControlPieza {

    @FXML
    private AnchorPane fondo;

    @FXML
    private ImageView pieza;

    public AnchorPane getFondo(){ return fondo; }
    public ImageView getPieza(){ return pieza; }

}