package com.example.dummies_book6.ch2;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

//AddSubtract implements EventHandler interface
//this interface will help define a method that handles Action events when a button is clicked
public class AddSubtract extends Application implements EventHandler <ActionEvent> {

    public static void main(String[] args) {

        launch(args);
    }

    //setting up control variables
    Button btnAdd; //→16
    Button btnSubtract;
    Label lbl;
    //
    int iCounter = 0;//keeps track of values displayed by the label

    @Override
    public void start(Stage primaryStage) {
        // Create the Add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(this);//set current object as the event handler for btnAdd

        // Create the Subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(this);//same as btnAdd

        // Create the Label
        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));

        // Add the buttons and label to an HBox pane
        //Hbox is another layout pane, which arranges the controls in a horizontal row
        HBox pane = new HBox(10);//separate the controls by 10 pixels
        pane.getChildren().addAll(lbl, btnAdd, btnSubtract);

        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 200, 75);

        // Add the scene to the stage, set the title
        // and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add/Sub");
        primaryStage.show();
    }


    @Override//override default handle()
    public void handle(ActionEvent e){//this method is being implemented by the AddSubtract class
        if (e.getSource()==btnAdd) //→53
        {
            iCounter++;
        }else if (e.getSource()==btnSubtract)//59
        {
            iCounter--;
        }
        lbl.setText(Integer.toString(iCounter));//64
    }



}
