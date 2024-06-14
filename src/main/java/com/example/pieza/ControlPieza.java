package com.example.pieza;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

//Controlador de la pieza
public class ControlPieza {

    @FXML
    private AnchorPane fondo;

    @FXML
    private ImageView pieza;


    public AnchorPane getFondo(){ return fondo; }
    public ImageView getPieza(){ return pieza; }

}