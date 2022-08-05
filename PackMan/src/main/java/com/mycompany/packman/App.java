package com.mycompany.packman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class App extends Application {
  @Override
  public void start(Stage primaryStage) throws FileNotFoundException {
    
    int xSTRL = 400;
    int ySTRL = 400;
    PackmanPane pack = new PackmanPane(xSTRL,ySTRL);
    
    Scene scene = new Scene(pack.main, xSTRL,ySTRL);
    primaryStage.setTitle("Packman"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  public static void main(String[] args) {
    launch(args);
  }

}