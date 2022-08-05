/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.packman;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author ASUS
 */
public class Packman {
    Circle pac;
    public int x;
    public int y;
    
    
    public Packman (int y,int x) {
        pac = new Circle ();
            pac.setFill(Color.YELLOW);
        pac.setCenterX(x);
        pac.setCenterY(y);
        pac.setRadius(5);
    }
}
