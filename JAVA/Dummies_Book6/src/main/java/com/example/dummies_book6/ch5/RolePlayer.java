package com.example.dummies_book6.ch5;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
public class RolePlayer extends Application //→8
        {
public static void main(String[] args)
        {
        launch(args);
        }
        TextField txtCharacter; //→15
        TextField txtActor;

            @Override public void start(Stage primaryStage)
            {
                // Create the Character
                Label lblCharacter = new Label("Character's Name:");
                lblCharacter.setMinWidth(100);
                lblCharacter.setAlignment(Pos.BOTTOM_RIGHT);
// Create the Character text field →25
                txtCharacter = new TextField();
                txtCharacter.setMinWidth(200);
                txtCharacter.setMaxWidth(200);
                txtCharacter.setPromptText(
                        "Enter the name of the character here.");
// Create the Actor label →32
                Label lblActor = new Label("Actor's Name:");
                lblActor.setMinWidth(100);
                lblActor.setAlignment(Pos.BOTTOM_RIGHT);
// Create the Actor text field →37
                txtActor = new TextField();
                txtActor.setMinWidth(200);
                txtActor.setMaxWidth(200);
                txtActor.setPromptText("Enter the name of the actor here.");
                // Create the OK button →43
                Button btnOK = new Button("OK");
                btnOK.setMinWidth(75);
                btnOK.setOnAction(e -> btnOK_Click() );
                // Create the Character pane →48
                HBox paneCharacter = new HBox(20, lblCharacter, txtCharacter);
                paneCharacter.setPadding(new Insets(10));
                // Create the Actor pane →52
                HBox paneActor = new HBox(20, lblActor, txtActor);
                paneActor.setPadding(new Insets(10));
                // Create the Button pane →56
                HBox paneButton = new HBox(20, btnOK);
                paneButton.setPadding(new Insets(10));
                paneButton.setAlignment(Pos.BOTTOM_RIGHT);
                // Add the Character, Actor, and Button panes to a VBox →61
                VBox pane = new VBox(10, paneCharacter, paneActor, paneButton);
                // Set the stage →64
                Scene scene = new Scene(pane);
                primaryStage.setScene(scene);
                primaryStage.setTitle("Role Player");
