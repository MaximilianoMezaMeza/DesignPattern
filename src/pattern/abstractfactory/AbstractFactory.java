package pattern.abstractfactory;


import pattern.abstractfactory.Color;
import pattern.abstractfactory.Shape;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Max
 */

abstract class  AbstractFactory{
     public Color getColor(Class color){
     return null;
     }
     public Shape getShape(Class shape){
     return null;
     }

}
