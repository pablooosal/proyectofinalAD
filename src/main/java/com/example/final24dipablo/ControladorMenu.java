package com.example.final24dipablo;

import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControladorMenu{
    @FXML
    private AnchorPane fondo;

    //Método que carga la pantalla del tablero
    @FXML
    void cargarPantallaAjedrez(ActionEvent event) throws IOException {
        cargarPantalla("ajedrez.fxml");
    }

    //Método carga la pantalla del ranking
    @FXML
    void cargarRanking(ActionEvent event) throws IOException {
        cargarPantalla("ranking.fxml");
    }

    //Método con el que cargamos las distintas pantallas
    public void cargarPantalla(String pantalla) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AjedrezApp.class.getResource(pantalla));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) fondo.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    //Método para salir del programa
    @FXML
    void salir(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }


}
