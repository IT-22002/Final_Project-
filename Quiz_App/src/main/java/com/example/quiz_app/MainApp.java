package com.example.quiz_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("id_entry.fxml"));
        Scene scene = new Scene(loader.load(), 400, 250);
        stage.setScene(scene);
        stage.setTitle("Enter ID");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
