package com.example.dummies_book6.ch5;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.text.*;


public class PizzaOrder extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    Stage stage;
    // Customer name, phone and address fields
    TextField txtName;
    TextField txtPhone;
    TextField txtAddress;
    // Size radio buttons
    RadioButton rdoSmall;
    RadioButton rdoMedium;
    RadioButton rdoLarge;
    // Crust style radio buttons
    RadioButton rdoThin;
    RadioButton rdoThick;
    // Topping radio buttons
    CheckBox chkPepperoni;
    CheckBox chkSausage;
    CheckBox chkLinguica;
    CheckBox chkOlives;
    CheckBox chkMushrooms;
    CheckBox chkTomatoes;
    CheckBox chkAnchovies;
    @Override public void start(Stage primaryStage)
    {
        stage = primaryStage;
// ----- Create the top pane -----
        Text textHeading = new Text("Order Your Pizza Now!");
        textHeading.setFont(new Font(20));
        HBox paneTop = new HBox(textHeading);
        paneTop.setPadding(new Insets(20, 10, 20, 10));
// ---------- Create the customer pane ----------
// Create the name label and text field
