/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.packman;

import java.io.File;
import java.util.Scanner;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author ASUS
 */
public class PackmanPane extends BorderPane {
    int strX;
    int strY;
    static int posTab[][];
    TilePane tilePane;
    Pane pane;
    BorderPane main;
    static int recStr; 
    PlayerPack packman;
    Circle c;
    
    public PackmanPane (int lengde,int høyde) {
        main = new BorderPane();
        pane = new Pane();
            pane.setMinHeight(høyde);
            pane.setMaxHeight(høyde);
            pane.setMinWidth(høyde);
            pane.setMaxWidth(høyde);
        packman = new PlayerPack(10,10);
        c = new Circle(10,10, recStr/2);
            c.toFront();
        main.setCenter(pane);
        pane.getChildren().add(lesFil(lengde,høyde));
            
    }
    public TilePane lesFil (int lengde, int høyde){
    Scanner scr = null;
    File fil = new File("v1.txt");
        try{
            scr = new Scanner(fil);
            int teller = 0;
            strX = scr.nextInt();
            strY = scr.nextInt();
             tilePane = new TilePane(strX,strY);
                tilePane.setHgap(0);
                tilePane.setVgap(0);
                tilePane.setMinHeight(pane.getMaxHeight());
                tilePane.setMaxHeight(pane.getMaxHeight());
                tilePane.setMinWidth(pane.getMaxWidth());
                tilePane.setMaxWidth(pane.getMaxWidth());
                posTab = new int[strX][strY];
            for(int y = 0; scr.hasNextLine(); y++){
                for(int x = 0; x < strX; x++){
                    posTab [x][y] = scr.nextInt();
                    System.out.print(posTab[x][y]);
                    if(posTab[x][y] == 1){
                        Rectangle r = new Rectangle(0,0,lengde/strX,høyde/strY);
                            r.setFill(Color.RED);
                        tilePane.getChildren().add(r);
                    }else if(posTab[x][y] == 0){
                        Rectangle r = new Rectangle(0,0,lengde/strX,høyde/strY);
                            r.setFill(Color.BLACK);
                        tilePane.getChildren().add(r);
                    }
                }
                System.out.println();
            }
        }catch(Exception FileNotFoundException){
            System.out.println("Fil ikke funnet");
        }
        recStr = lengde/strX;
        scr.close();
        return tilePane;
    }
    public int [][] getBane(){
        return posTab;
    }
   
}
