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

public class CopoController {
    private ObservableList<String> coposComprados = FXCollections.observableArrayList();

    @FXML
    private TextField quantidadeCoposField;
    @FXML
    private TextField corCoposField;
    @FXML
    private TextField materialCoposField;

    @FXML
    private ListView<String> listViewCopos;

    @FXML
    void handleSendCopo(){
        String quantidade = quantidadeCoposField.getText();
        String cor = corCoposField.getText();
        String material = materialCoposField.getText();

        coposComprados.add("Copos = " + "Quantidade: " + quantidade + ", Cor: " + cor + ", Material: " + material);

        listViewCopos.setItems(coposComprados);
        exibirDadosCopos(quantidade, cor, material);

        quantidadeCoposField.clear();
        corCoposField.clear();
        materialCoposField.clear();
    }

    public void exibirDadosCopos(String quantidade, String cor, String material){
        Stage stage = new Stage();
        stage.setTitle("Vendido!");

        Label label = new Label("Copos comprados: \n" + "Quantidade: " + quantidade + ", Cor: " + cor + ", Material: " + material);
        VBox vbox = new VBox(label);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(vbox, 400, 100);
        stage.setScene(scene);
        stage.show();
    }
    
}

