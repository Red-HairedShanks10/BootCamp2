package com.example.dummies_book6.ch3;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.util.*;


public class ClickCounterExit extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    Stage stage;
    int iClickCount = 0;
    @Override public void start(Stage primaryStage)
    {
        stage = primaryStage;
// Create the Click Me button
        Button btnClickMe = new Button();
        btnClickMe.setText("Click me please!");
        btnClickMe.setOnAction(e -> btnClickMe_Click());
// Create the Close button
        Button btnClose = new Button();
        btnClose.setText("Close");
        btnClose.setOnAction(e -> btnClose_Click());
// Add the buttons to a layout pane
        VBox pane = new VBox(10);
        pane.getChildren().addAll(btnClickMe, btnClose);
        pane.setAlignment(Pos.CENTER);
// Add the layout pane to a scene
        Scene scene = new Scene(pane, 250, 150);
// Finish and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.setOnCloseRequest( e ->
        {
            e.consume();
            btnClose_Click();
        } );
        primaryStage.show();
    }