package com.example.dummies_book6.ch1;

//importing multiple JavaFX packages to be used:
import javafx.application.Application;//to use the core class for any Jfx program
import javafx.stage.Stage;//this package allows JFX applications to have a main window//which UI can be displayed in
import javafx.scene.*;//stores all the user interface elements displayed in a program
import javafx.scene.layout.*;//using UI element called layout manager to determine the position of each control shown in the UI
import javafx.scene.control.*;//has individual UI controls such as buttons, text boxes etc


//extending Application class
public class ClickMe extends Application {

    public static void main(String[] args) {

        //Launch method is what starts the JFX application...
        launch(args);
    }



    Button btn = new Button();//create new button
    @Override
    //Mandatory for all JFX programs to have start()
    //start() is where we create the UI elements the user will interact with
    //JFX framework calls the start() after the Application class is initialised
    public void start(Stage primaryStage) {

        btn.setText("Click me please!");//set the text of the button

        //using lambda expression for event handling once the button is clicked
        btn.setOnAction(e -> buttonClick());//call buttonClick

        // Add the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 300, 250);

        // Finalize and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Click Me App");
        primaryStage.show();
    }

    public void buttonClick()//this method uses an if statement to change text displayed on the button
    {
        if (btn.getText() == "Click me please!")//if the current text is = to...
        {
            btn.setText("You clicked me!");//then change text to...
        }
        else
        {
            btn.setText("Click me please!");//otherwise if set text to original
        }
    }


}
