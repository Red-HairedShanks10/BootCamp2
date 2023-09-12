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

    //making it class variables
    Button btn; //variable of type Button control class
    Label lbl;//var of type Label control class...
    int iClickCount = 0;//variable will be used to keep track of number of times user clicks the button

    @Override//override the default start method of a JFX application
    public void start(Stage primaryStage) {//takes in primaryStage param,to display the main window of the app
        // Create the button
        btn = new Button();
        btn.setText("Click me please!");//using setText() to set string to be displayed on the button
        btn.setOnAction(e -> buttonClick());//use lambda, to create an event handler for when the button is clicked

        // Create the Label
        lbl = new Label();
        lbl.setText("You have not clicked the button.");//set text for the label

        // Add the label and the button to a layout pane
        BorderPane pane = new BorderPane(); //using Borderpane to manage layout of the controls displayed on screen
        pane.setTop(lbl); //add the label to the top region of the border pane
        pane.setCenter(btn); //add the button to the center position of the border pane

        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 250, 150);

        // Add the scene to the stage, set the title
        // and show the stage//main window
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.show();//41
    }

    public void buttonClick() //→44
    {
        iClickCount++; //→46
        if (iClickCount == 1) //→47
        {
            lbl.setText("You have clicked once."); //→49
        }else{
            //→53
            lbl.setText("You have clicked " + iClickCount + " times." );
        }
    }
}
