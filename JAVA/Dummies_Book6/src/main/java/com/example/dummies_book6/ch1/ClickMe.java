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
        launch(args);
    }

    Button btn;

    @Override
    public void start(Stage primaryStage) {

        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());

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

    public void buttonClick()
    {
        if (btn.getText() == "Click me please!")
        {
            btn.setText("You clicked me!");
        }
        else
        {
            btn.setText("Click me please!");
        }
    }


}
