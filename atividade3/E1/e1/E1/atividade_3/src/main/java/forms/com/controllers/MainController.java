package forms.com.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * MainController
 */
public class MainController {
    @FXML
    private void openGatoScreen(ActionEvent event){
        openFXML("gato.fxml");
    }

    @FXML
    private void openBolachaScreen(ActionEvent event){
        openFXML("bolacha.fxml");
    }

    @FXML
    private void openCoposScreen(ActionEvent event){
        openFXML("copos.fxml");
    }

    private void openFXML(String fxmlFileName){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/forms/com/" + fxmlFileName));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
