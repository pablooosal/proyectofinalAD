package com.example.final24dipablo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AjedrezApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AjedrezApp.class.getResource("menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        ControladorMenu controlador = fxmlLoader.getController();
        stage.setTitle("Ajedrez");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}