package com.example.dummies_book6.ch3;


import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
public class ClickCounterAlert extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    Button btn;
    Label lbl;
    int iClickCount = 0;
    @Override public void start(Stage primaryStage)
    {
// Create the button
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());