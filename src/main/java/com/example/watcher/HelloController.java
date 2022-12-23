package com.example.watcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Label setTime;
    public VBox vBox;
    @FXML
    private Label welcomeText;
    TimeServer timeServer = new TimeServer(100,1000);
    ObserverHolder holder = new ObserverHolder();

    public void onButtonStart(ActionEvent actionEvent) {
        System.out.println("Start");
        timeServer.attach(holder.getObserver());

    }

    public void onButtonStop(ActionEvent actionEvent) {
        System.out.println("Stop");
        timeServer.detach(holder.getObserver());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       vBox.getChildren().add(holder.text);

    }
}
