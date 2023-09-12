package com.example.dummies_book6.ch3;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

//this program essential switches between scenes of two different apps
//Click Counter app and AddSubtract app
public class SceneSwitcher extends Application
{
    public static void main(String[] args)
    {

        launch(args);
    }
    // class fields used for Click-Counter scene
    int iClickCount = 0;
    Label lblClicks;
    Button btnClickMe;
    Button btnSwitchToScene2;
    Scene scene1;

    // class fields used for Add-Subtract scene
    int iCounter = 0;
    Label lblCounter;
    Button btnAdd;
    Button btnSubtract;
    Button btnSwitchToScene1;
    Scene scene2;

    // class field used for stage
    Stage stage;
    @Override public void start(Stage primaryStage)
    {
        stage = primaryStage; //stage class field will reference the primary stage
        //*Build the Click-Counter scene
        //1--creates a label and buttons to be display by the scene
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
        //2--creates a VBox pane which arranges controls in a vertical stack
        VBox pane1 = new VBox(10);//..separate controls by 10 pixels
        pane1.getChildren().addAll(lblClicks, btnClickMe,
                btnSwitchToScene2);
        scene1 = new Scene(pane1, 250, 150);
        //***END of ClickCounter Scene***//

        //* Build the Add-Subtract scene
        //we do a similar thing here as we did with the Click-Counter scene
        lblCounter = new Label();
        lblCounter.setText(Integer.toString(iCounter));

        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(
                e -> btnAdd_Click() );

        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(
                e -> btnSubtract_Click() );
        btnSwitchToScene2 = new Button();
        btnSwitchToScene2.setText("Switch!");
        btnSwitchToScene2.setOnAction(
                e -> btnSwitchToScene1_Click() );

        //we use Hbox for horizontal control arrangement instead of vertical
        HBox pane2 = new HBox(10);
        pane2.getChildren().addAll(lblCounter, btnAdd,
                btnSubtract, btnSwitchToScene2);
        scene2 = new Scene(pane2, 300, 75);

        // Set the stage with scene1(click-counter) as the initial scene
        // and show the stage
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Scene Switcher");
        primaryStage.show();
    }

    // Event handlers for scene 1
    //uses an if state to check how many times the button has be clicked
    public void btnClickMe_Click()
    {
        iClickCount++;
        if (iClickCount == 1)
        {
            lblClicks.setText("You have clicked once.");
        }
        else
        {
            lblClicks.setText("You have clicked "
                    + iClickCount + " times." );
        }
    }

    //switches to scene 2 when currently in scene 1
    private void btnSwitchToScene2_Click()
    {
        stage.setScene(scene2);
    }


    //**Event handlers for scene 2
    //1--increments iCounter value as the add button is clicked on
    private void btnAdd_Click()
    {
        iCounter++;
        lblCounter.setText(Integer.toString(iCounter));
    }
    //2--decrements iCounter as the subtract button is clicked on
    private void btnSubtract_Click()
    {
        iCounter--;
        lblCounter.setText(Integer.toString(iCounter));
    }
    //3--switches to scene 1 if currently in scene 2
    private void btnSwitchToScene1_Click()
    {
        stage.setScene(scene1);
    }
}
