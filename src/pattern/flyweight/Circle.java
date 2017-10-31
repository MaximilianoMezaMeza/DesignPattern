/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.flyweight;

import pattern.fadecade.*;
import pattern.decorator.*;

/**
 *
 * @author Max
 */
public class Circle implements Shape{
    
    private int x,y;
    private String color;

    @Override
    public void draw() {
        System.out.println("Shape: Circle ("+this.x+","+this.y+")"+" Color: "+this.color);
    }

    public Circle(int x, int y,  String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void setColor(String color) {
        this.color = color;
    }
    
    
}
