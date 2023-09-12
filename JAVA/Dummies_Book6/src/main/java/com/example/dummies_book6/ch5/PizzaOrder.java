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
        Label lblName = new Label("Name:");
        lblName.setPrefWidth(100);
        txtName = new TextField();
        txtName.setPrefColumnCount(20);
        txtName.setPromptText("Enter the customer's name here");
        txtName.setMaxWidth(Double.MAX_VALUE);
        HBox paneName = new HBox(lblName, txtName);
// Create the phone number label and text field
        Label lblPhone = new Label("Phone Number:");
        lblPhone.setPrefWidth(100);
        txtPhone = new TextField();
        txtPhone.setPrefColumnCount(20);
        txtPhone.setPromptText("Enter the customer's phone number here");
        HBox panePhone = new HBox(lblPhone, txtPhone);
// Create the address label and text field
        Label lblAddress = new Label("Address:");
        lblAddress.setPrefWidth(100);
        txtAddress = new TextField();
        txtAddress.setPrefColumnCount(20);
        txtAddress.setPromptText("Enter the customer's address here");
        HBox paneAddress = new HBox(lblAddress, txtAddress);
// Create the customer pane
        VBox paneCustomer = new VBox(10, paneName,
                panePhone, paneAddress);
// ---------- Create the order pane ----------
// Create the size pane
        Label lblSize = new Label("Size");
        rdoSmall = new RadioButton("Small");
        rdoMedium = new RadioButton("Medium");
        rdoLarge = new RadioButton("Large");
        rdoMedium.setSelected(true);
        ToggleGroup groupSize = new ToggleGroup();
        rdoSmall.setToggleGroup(groupSize);
        rdoMedium.setToggleGroup(groupSize);
        rdoLarge.setToggleGroup(groupSize);
        VBox paneSize = new VBox(lblSize, rdoSmall, rdoMedium, rdoLarge);
        paneSize.setSpacing(10);
