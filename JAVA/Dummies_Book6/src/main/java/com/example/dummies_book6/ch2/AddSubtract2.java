package com.example.dummies_book6.ch2;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class AddSubtract2 extends Application →8
        {
public static void main(String[] args)
        {
        launch(args);
        }
        Button btnAdd;
        Button btnSubtract;
        Label lbl;
        int iCounter = 0;
@Override public void start(Stage primaryStage)
        {
// Create a ClickHandler instance
        ClickHandler ch = new ClickHandler(); →23
// Create the Add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(ch); →28
// Create the Subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(ch); //→33
