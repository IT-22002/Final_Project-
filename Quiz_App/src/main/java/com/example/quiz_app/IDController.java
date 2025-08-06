package com.example.quiz_app;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class IDController {

    @FXML private TextField txtID;
    @FXML private Label lblError;

    @FXML
    private void handleStart() {
        String id = txtID.getText().trim();

        if (id.isEmpty()) {
            lblError.setText("আইডি দিতে হবে!");
            return;
        }

        // Check last digit
        char lastChar = id.charAt(id.length() - 1);
        if (lastChar != '2') {
            lblError.setText("আপনার আইডির শেষ সংখ্যা 2 হতে হবে!");
            return;
        }

        try {
            Stage stage = (Stage) txtID.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
            Scene scene = new Scene(loader.load(), 600, 400);
            stage.setScene(scene);
            stage.setTitle("বাংলা কুইজ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
