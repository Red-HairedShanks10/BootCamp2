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
    TreeView<String> tree; //defined a tree model as class instance variable
    Label lblShowName;
    @Override public void start(Stage primaryStage)
    {
        //defined TreeItem variables for the root node and shows with a spinoff
        TreeItem<String> root, andy, archie, happy, george, maude;

        root = new TreeItem<String>("Spin Offs");//created root node with text
        root.setExpanded(true);
        //created nodes for each show and its spin-offs
        andy = makeShow("The Andy Griffith Show", root);
        makeShow("Gomer Pyle, U.S.M.C.", andy);
        makeShow("Mayberry R.F.D", andy);
        archie = makeShow("All in the Family", root);// →31
        george = makeShow("The Jeffersons", archie);
        makeShow("Checking In", george);
        maude = makeShow("Maude", archie);
        makeShow("Good Times", maude);
        makeShow("Gloria", archie);
        makeShow("Archie Bunker's Place", archie);
        happy = makeShow("Happy Days", root);// →39
        makeShow("Mork and Mindy", happy);
        makeShow("Laverne and Shirley", happy);
        makeShow("Joanie Loves Chachi", happy);
        tree = new TreeView<String>(root);// →44
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty() //→46
            .addListener( (v, oldValue, newValue) -> tree_SelectionChanged(newValue) );
        lblShowName = new Label();
        VBox pane = new VBox(10);
        pane.setPadding(new Insets(20,20,20,20));
        pane.getChildren().addAll(tree, lblShowName);// →54
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My Favorite Spin Offs");
        primaryStage.show();
    }
    public TreeItem<String> makeShow(String title, TreeItem<String> parent)//→64
    {
        TreeItem<String> show = new TreeItem<String>(title);
        show.setExpanded(true);
        parent.getChildren().add(show);
        return show;
    }
    public void tree_SelectionChanged(TreeItem<String> item) //→73
    {
        if (item != null)
        {
            lblShowName.setText(item.getValue());
        }
    }
}
