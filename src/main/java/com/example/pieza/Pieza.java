package com.example.pieza;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Pieza extends AnchorPane {
    //Propiedades
    ControlPieza controlador;
    String nombrePieza;
    String color;

    //Constructor
    public Pieza(){
        super();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pieza.fxml"));
            controlador = new ControlPieza();
            loader.setController(controlador);
            Node nodo = loader.load();
            this.getChildren().add(nodo);
            this.setNombrePieza("PEON");
            this.setColor("blanca");
            this.ponerPieza();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void ponerPieza() {
        String nombreimagen = this.color + "_" + this.nombrePieza + ".png";
        Image img = new Image(getClass().getResourceAsStream("piezas/"+nombreimagen));
        controlador.getPieza().setImage(img);
    }

    public void setColor(String color){
        this.color = color.toLowerCase();
    }

    public void setNombrePieza(String nombre){
        this.nombrePieza = nombre.toUpperCase();
    }


}

