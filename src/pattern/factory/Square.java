/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.factory;

import pattern.abstractfactory.*;

/**
 *
 * @author Max
 */
public class Square implements Shape{
    
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
