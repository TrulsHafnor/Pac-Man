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
public class PlayerPack extends Figur {
    protected Circle packMan;
    
    public PlayerPack (int x,int y) {
        super(x,y);
        packMan = new Circle(x, y, PackmanPane.recStr/2);
            packMan.setFill(Color.YELLOW);
            packMan.toFront();   
    }
    
    
}
