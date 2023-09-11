package com.example.dummies_book6.ch1;

import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickCounter extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Button btn; //14
    Label lbl;//15
    int iClickCount = 0;//16

    @Override
    public void start(Stage primaryStage) {
        // Create the button
        btn = new Button(); //21
        btn.setText("Click me please!");//22
        btn.setOnAction(e -> buttonClick());
    }
}
