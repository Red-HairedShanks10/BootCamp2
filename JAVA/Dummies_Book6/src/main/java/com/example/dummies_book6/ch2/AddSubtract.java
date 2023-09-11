package com.example.dummies_book6.ch2;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class AddSubtract extends Application implements EventHandler <ActionEvent> {

    public static void main(String[] args) {

        launch(args);
    }

    Button btnAdd; //→16
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;

    @Override
    public void start(Stage primaryStage) {
        // Create the Add button
        btnAdd = new Button(); //→24
        btnAdd.setText("Add");
        btnAdd.setOnAction(this);

        // Create the Subtract button
        btnSubtract = new Button(); //→29
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(this);
    }
}
