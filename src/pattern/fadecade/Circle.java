/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.fadecade;

import pattern.decorator.*;

/**
 *
 * @author Max
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
    
}
