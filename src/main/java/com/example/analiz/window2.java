package com.example.analiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class window2 {

    @FXML
    private Label resaltbrak;

    @FXML
    private Label resaltbrak2;
    @FXML
    private Label resaltgod;
    @FXML
    private Label resaltgod2;

    @FXML
    private Label god1;


    @FXML
    private Button buttonAnaliz;
    @FXML
    private Button buttonAnaliz2;

    @FXML
    private Label brak2;

    @FXML
    private Label god2;

    @FXML
    private Label coll;

    @FXML
    private Label brak1;


    @FXML
    private Button back_button;
    @FXML
    void BackClick(ActionEvent event) {
        back_button.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("window1.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }

    @FXML
    void AnalizClikc(ActionEvent event) {
        int first = Integer.parseInt(brak1.getText()); //записываем в int цену
        int [] analiz  = {Integer.parseInt(brak1.getText()), Integer.parseInt(brak2.getText())};// перебираем массив
        for (int i = 0; i <= 1; i++){
            if(first > analiz[i]){
                first = analiz[i];
                i = 0;
            }
        }
        if(first == Integer.parseInt(brak1.getText())){
            resaltbrak.setText("Меньше брака");
            brak1.setTextFill(Color.color(1, 0, 0));
            resaltbrak.setTextFill(Color.color(1, 0, 0));
        }
        if(first == Integer.parseInt(brak2.getText())){
            resaltbrak2.setText("Меньше брака");
            brak2.setTextFill(Color.color(1, 0, 0));
            resaltbrak2.setTextFill(Color.color(1, 0, 0));
        }
    }
    @FXML
    void AnalizClikc2(ActionEvent event) {
        int first2 = Integer.parseInt(god1.getText()); //записываем в int цену
        int [] analiz2  = {Integer.parseInt(god1.getText()), Integer.parseInt(god2.getText())};
        for (int j = 0; j <= 1; j++){
            if(first2 > analiz2[j]){
                first2 = analiz2[j];
                j = 0;
            }
        }
        if(first2 == Integer.parseInt(god1.getText())){
            resaltgod.setText("Меньше годных");
            god1.setTextFill(Color.color(1, 0, 0));
            resaltgod.setTextFill(Color.color(1, 0, 0));
        }
        if(first2 == Integer.parseInt(god2.getText())){
            resaltgod2.setText("Меньше годных");
            god2.setTextFill(Color.color(1, 0, 0));
            resaltgod2.setTextFill(Color.color(1, 0, 0));
        }
    }


}
