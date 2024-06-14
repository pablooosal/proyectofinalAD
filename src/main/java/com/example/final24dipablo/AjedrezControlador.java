package com.example.final24dipablo;

import com.example.pieza.Pieza;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class AjedrezControlador implements Initializable {
    @FXML
    private AnchorPane fondo;
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

    @FXML
    void menuPrincipal(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AjedrezApp.class.getResource("menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) fondo.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sorteoInicio();

        Pieza torre1 = new Pieza();
        torre1.setColor("negra");
        torre1.setNombrePieza("torre");
        c00.getChildren().add(torre1);
        torre1.ponerPieza();

        Pieza torre2 = new Pieza();
        torre2.setColor("negra");
        torre2.setNombrePieza("torre");
        c07.getChildren().add(torre2);
        torre2.ponerPieza();

        Pieza caballo1 = new Pieza();
        caballo1.setColor("negra");
        caballo1.setNombrePieza("caballo");
        c01.getChildren().add(caballo1);
        caballo1.ponerPieza();

        Pieza caballo2 = new Pieza();
        caballo2.setColor("negra");
        caballo2.setNombrePieza("caballo");
        c06.getChildren().add(caballo2);
        caballo2.ponerPieza();

        Pieza alfil1 = new Pieza();
        alfil1.setColor("negra");
        alfil1.setNombrePieza("alfil");
        c02.getChildren().add(alfil1);
        alfil1.ponerPieza();

        Pieza alfil2 = new Pieza();
        alfil2.setColor("negra");
        alfil2.setNombrePieza("alfil");
        c05.getChildren().add(alfil2);
        alfil2.ponerPieza();

        Pieza reina1 = new Pieza();
        reina1.setColor("negra");
        reina1.setNombrePieza("reina");
        c03.getChildren().add(reina1);
        reina1.ponerPieza();

        Pieza rey1 = new Pieza();
        rey1.setColor("negra");
        rey1.setNombrePieza("rey");
        c04.getChildren().add(rey1);
        rey1.ponerPieza();

        Pieza peon1 = new Pieza();
        peon1.setColor("negra");
        peon1.setNombrePieza("peon");
        c10.getChildren().add(peon1);
        peon1.ponerPieza();

        Pieza peon2 = new Pieza();
        peon2.setColor("negra");
        peon2.setNombrePieza("peon");
        c11.getChildren().add(peon2);
        peon2.ponerPieza();

        Pieza peon3 = new Pieza();
        peon3.setColor("negra");
        peon3.setNombrePieza("peon");
        c12.getChildren().add(peon3);
        peon3.ponerPieza();

        Pieza peon4 = new Pieza();
        peon4.setColor("negra");
        peon4.setNombrePieza("peon");
        c13.getChildren().add(peon4);
        peon4.ponerPieza();

        Pieza peon5 = new Pieza();
        peon5.setColor("negra");
        peon5.setNombrePieza("peon");
        c14.getChildren().add(peon5);
        peon5.ponerPieza();

        Pieza peon6 = new Pieza();
        peon6.setColor("negra");
        peon6.setNombrePieza("peon");
        c15.getChildren().add(peon6);
        peon6.ponerPieza();

        Pieza peon7 = new Pieza();
        peon7.setColor("negra");
        peon7.setNombrePieza("peon");
        c16.getChildren().add(peon7);
        peon7.ponerPieza();

        Pieza peon8 = new Pieza();
        peon8.setColor("negra");
        peon8.setNombrePieza("peon");
        c17.getChildren().add(peon8);
        peon8.ponerPieza();

        Pieza torre3 = new Pieza();
        torre3.setColor("blanca");
        torre3.setNombrePieza("torre");
        c30.getChildren().add(torre3);
        torre3.ponerPieza();

        Pieza torre4 = new Pieza();
        torre4.setColor("blanca");
        torre4.setNombrePieza("torre");
        c37.getChildren().add(torre4);
        torre4.ponerPieza();

        Pieza caballo3 = new Pieza();
        caballo3.setColor("blanca");
        caballo3.setNombrePieza("caballo");
        c31.getChildren().add(caballo3);
        caballo3.ponerPieza();

        Pieza caballo4 = new Pieza();
        caballo4.setColor("blanca");
        caballo4.setNombrePieza("caballo");
        c36.getChildren().add(caballo4);
        caballo4.ponerPieza();

        Pieza alfil3 = new Pieza();
        alfil3.setColor("blanca");
        alfil3.setNombrePieza("alfil");
        c32.getChildren().add(alfil3);
        alfil3.ponerPieza();

        Pieza alfil4 = new Pieza();
        alfil4.setColor("blanca");
        alfil4.setNombrePieza("alfil");
        c35.getChildren().add(alfil4);
        alfil4.ponerPieza();

        Pieza reina2 = new Pieza();
        reina2.setColor("blanca");
        reina2.setNombrePieza("reina");
        c33.getChildren().add(reina2);
        reina2.ponerPieza();

        Pieza rey2 = new Pieza();
        rey2.setColor("blanca");
        rey2.setNombrePieza("rey");
        c34.getChildren().add(rey2);
        rey2.ponerPieza();

        Pieza peon9 = new Pieza();
        peon9.setColor("blanca");
        peon9.setNombrePieza("peon");
        c20.getChildren().add(peon9);
        peon9.ponerPieza();

        Pieza peon10 = new Pieza();
        peon10.setColor("blanca");
        peon10.setNombrePieza("peon");
        c21.getChildren().add(peon10);
        peon10.ponerPieza();

        Pieza peon11 = new Pieza();
        peon11.setColor("blanca");
        peon11.setNombrePieza("peon");
        c22.getChildren().add(peon11);
        peon11.ponerPieza();

        Pieza peon12 = new Pieza();
        peon12.setColor("blanca");
        peon12.setNombrePieza("peon");
        c23.getChildren().add(peon12);
        peon12.ponerPieza();

        Pieza peon13 = new Pieza();
        peon13.setColor("blanca");
        peon13.setNombrePieza("peon");
        c24.getChildren().add(peon13);
        peon13.ponerPieza();

        Pieza peon14 = new Pieza();
        peon14.setColor("blanca");
        peon14.setNombrePieza("peon");
        c25.getChildren().add(peon14);
        peon14.ponerPieza();

        Pieza peon15 = new Pieza();
        peon15.setColor("blanca");
        peon15.setNombrePieza("peon");
        c26.getChildren().add(peon15);
        peon15.ponerPieza();

        Pieza peon16 = new Pieza();
        peon16.setColor("blanca");
        peon16.setNombrePieza("peon");
        c27.getChildren().add(peon16);
        peon16.ponerPieza();
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