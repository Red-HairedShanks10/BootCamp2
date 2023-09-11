package com.example.dummies_book6.ch3;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class SceneSwitcher extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    // class fields for Click-Counter scene →15
    int iClickCount = 0;
    Label lblClicks;
    Button btnClickMe;
    Button btnSwitchToScene2;
    Scene scene1;
    // class fields for Add-Subtract scene →22
    int iCounter = 0;
    Label lblCounter;
    Button btnAdd;
    Button btnSubtract;
    Button btnSwitchToScene1;
    Scene scene2;
    // class field for stage
    Stage stage; →31
    @Override public void start(Stage primaryStage)
    {
        stage = primaryStage; →35
// Build the Click-Counter scene →37
        lblClicks = new Label();
        lblClicks.setText("You have not clicked the button.");
        btnClickMe = new Button();
        btnClickMe.setText("Click me please!");
        btnClickMe.setOnAction(
                e -> btnClickMe_Click() );
        btnSwitchToScene2 = new Button();
        btnSwitchToScene2.setText("Switch!");
        btnSwitchToScene2.setOnAction(
                e -> btnSwitchToScene2_Click() );
