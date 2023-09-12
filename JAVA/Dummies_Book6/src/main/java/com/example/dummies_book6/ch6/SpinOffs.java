package com.example.dummies_book6.ch6;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class SpinOffs extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    TreeView<String> tree; →15
    Label lblShowName;
    @Override public void start(Stage primaryStage)
    {
        TreeItem<String> root, andy, archie,//→20
        happy, george, maude;
