package com.example.analiz;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button ButtonChoice;

    @FXML
    private ListView<String> ListAll;
    @FXML
    private ListView<String> ListAll1;
    JOptionPane JOptionPane;

    @FXML
    void ButtonChoiceClick(ActionEvent event) {

        String message = ""; //объект в которой записывается значение о выборе
        ObservableList<String> movies; //объект листа который мы выбрали и записываем месэндж
        movies = ListAll.getSelectionModel().getSelectedItems();

        for (String m: movies){ //перебираем объекты
            message += m; //записываем в мессэдж
        }

        String message2 = ""; //объект в которой записывается значение о выборе
        ObservableList<String> movies2; //объект листа который мы выбрали и записываем месэндж
        movies2 = ListAll1.getSelectionModel().getSelectedItems();

        for (String m2: movies2){ //перебираем объекты
            message2 += m2; //записываем в мессэдж
        }

        if(message.equals("") || message2.equals("")) {
            JOptionPane.showMessageDialog(null, "Ошибка! Станки не выбраны!");
        }
        else {
            ButtonChoice.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("window2.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Scene scene = new Scene(root, 600, 350);

            Label lab1 = (Label) scene.lookup("#stan");
            Label lab2 = (Label) scene.lookup("#stan1");
            Label label = (Label) scene.lookup("#coll");
            Label label1 = (Label) scene.lookup("#god1");
            Label label2 = (Label) scene.lookup("#brak1");
            Label label3 = (Label) scene.lookup("#god2");
            Label label4 = (Label) scene.lookup("#brak2");
            label.setText(message);
            label.setText(message2);

            if (message.equals("Станок 'Sodick'")) {
                lab1.setText("Станок 'Sodick'");
                label1.setText("869");
                label2.setText("131");

            }
            if (message.equals("Станок 'Ewag'")) {
                lab1.setText("Станок 'Ewag'");
                label1.setText("987");
                label2.setText("13");

            }
            if (message.equals("Станок 'Mikron'")) {
                lab1.setText("Станок 'Mikron'");
                label1.setText("946");
                label2.setText("54");

            }
            if (message.equals("Станок 'Hermle'")) {
                lab1.setText("Станок 'Hermle'");
                label1.setText("798");
                label2.setText("202");

            }
            if (message.equals("Станок 'Hanwha'")) {
                lab1.setText("Станок 'Hanwha'");
                label1.setText("856");
                label2.setText("144");

            }
            if (message2.equals("Станок 'Lenz'")) {
                lab2.setText("Станок 'Lenz'");

                label3.setText("998");
                label4.setText("2");
            }
            if (message2.equals("Станок 'Schmoll'")) {
                lab2.setText("Станок 'Schmoll'");
                label3.setText("653");
                label4.setText("347");
            }
            if (message2.equals("Станок 'Everising'")) {
                lab2.setText("Станок 'Everising'");
                label3.setText("874");
                label4.setText("126");
            }
            if (message2.equals("Станок 'Datron'")) {
                lab2.setText("Станок 'Datron'");
                label3.setText("978");
                label4.setText("22");
            }
            if (message2.equals("Станок 'Eastar'")) {
                lab2.setText("Станок 'Eastar'");
                label3.setText("837");
                label4.setText("163");
            }

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ListAll.getItems().addAll("Станок 'Sodick'", "Станок 'Ewag'", "Станок 'Mikron'", "Станок 'Hermle'", "Станок 'Hanwha'");
        ListAll.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        ListAll1.getItems().addAll( "Станок 'Lenz'", "Станок 'Schmoll'", "Станок 'Everising'","Станок 'Datron'", "Станок 'Eastar'");
        ListAll1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
}
