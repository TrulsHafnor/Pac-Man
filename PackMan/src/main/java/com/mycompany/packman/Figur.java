/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.packman;

import javafx.scene.shape.Circle;


public abstract class Figur {
    protected int x,y;
    
    public Figur(int x,int y){
       int [][] posTab = PackmanPane.posTab;
       this.x=x;
       this.y=y;
    }
}
