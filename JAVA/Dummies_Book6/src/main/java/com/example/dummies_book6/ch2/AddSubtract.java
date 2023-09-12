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
        btnAdd.setOnAction(this);

        // Create the Subtract button
        btnSubtract = new Button(); //→29
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(this);

        // Create the Label →33
        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));

        // Add the buttons and label to an HBox pane
        HBox pane = new HBox(10); //→38
        pane.getChildren().addAll(lbl, btnAdd, btnSubtract);

        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 200, 75); //→42

        // Add the scene to the stage, set the title
        // and show the stage
        primaryStage.setScene(scene); //→46
        primaryStage.setTitle("Add/Sub");
        primaryStage.show();
    }


    @Override
    public void handle(ActionEvent e){
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
