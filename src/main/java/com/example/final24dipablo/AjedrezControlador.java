package com.example.final24dipablo;

import com.example.pieza.Pieza;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class AjedrezControlador implements Initializable {
    @FXML
    private AnchorPane c00;

    @FXML
    private AnchorPane c01;

    @FXML
    private AnchorPane c02;

    @FXML
    private AnchorPane c03;

    @FXML
    private AnchorPane c04;

    @FXML
    private AnchorPane c05;

    @FXML
    private AnchorPane c06;

    @FXML
    private AnchorPane c07;

    @FXML
    private AnchorPane c10;

    @FXML
    private AnchorPane c11;

    @FXML
    private AnchorPane c12;

    @FXML
    private AnchorPane c13;

    @FXML
    private AnchorPane c14;

    @FXML
    private AnchorPane c15;

    @FXML
    private AnchorPane c16;

    @FXML
    private AnchorPane c17;

    @FXML
    private AnchorPane c20;

    @FXML
    private AnchorPane c21;

    @FXML
    private AnchorPane c22;

    @FXML
    private AnchorPane c23;

    @FXML
    private AnchorPane c24;

    @FXML
    private AnchorPane c25;

    @FXML
    private AnchorPane c26;

    @FXML
    private AnchorPane c27;

    @FXML
    private AnchorPane c30;

    @FXML
    private AnchorPane c31;

    @FXML
    private AnchorPane c32;

    @FXML
    private AnchorPane c33;

    @FXML
    private AnchorPane c34;

    @FXML
    private AnchorPane c35;

    @FXML
    private AnchorPane c36;

    @FXML
    private AnchorPane c37;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sorteoInicio();
        Pieza peon1 =new Pieza();
        peon1.setColor("blanca");
        peon1.setNombrePieza("peon");
        c10.getChildren().add(peon1);

    }

    public void sorteoInicio(){
        if (Math.random() < 0.5){
            l1.setText("Ordenador");
            l2.setText("Jugador");
        } else {
            l2.setText("Ordenador");
            l1.setText("Jugador");
        }
    }
}