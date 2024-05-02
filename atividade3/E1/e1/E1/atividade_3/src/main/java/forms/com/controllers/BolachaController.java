package forms.com.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BolachaController {
    private ObservableList<String> bolachaCadastradas = FXCollections.observableArrayList();

    @FXML
    private TextField marcaField;
    @FXML
    private TextField saborField;
    @FXML
    private TextField tamanhoField;

    @FXML
    private ListView<String> listViewBolacha;


    @FXML 
    void handleSendBolacha(){
        String marca = marcaField.getText();
        String sabor = saborField.getText();
        String tamanho = tamanhoField.getText();

        bolachaCadastradas.add("Bolacha = " + "Marca: " + marca + ", Sabor: " + sabor + ", Tamanho: " + tamanho);

        listViewBolacha.setItems(bolachaCadastradas);
        exibirDadosBolacha(marca, sabor, tamanho);

        marcaField.clear();
        saborField.clear();
        tamanhoField.clear();
    }

    public void exibirDadosBolacha(String marca, String sabor, String tamanho){
        Stage stage = new Stage();
        stage.setTitle("Pronto!");

        Label label = new Label("Bolacha comprada: \n" + "Marca: " + marca + ", Sabor: " + sabor + ", Tamanho: " + tamanho);
        VBox vbox = new VBox(label);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(vbox, 200, 100);
        stage.setScene(scene);
        stage.show();
    }
}
