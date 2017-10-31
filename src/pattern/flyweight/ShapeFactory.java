/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.flyweight;

import java.util.HashMap;

/**
 *
 * @author Max
 */
public class ShapeFactory {
    private static HashMap<String,Shape> hashMap=new HashMap<String,Shape>();

    public static Shape getCircle(String color,int x,int y){
        Shape shapeToReturn=hashMap.get(color);
        if(shapeToReturn==null){
            shapeToReturn=new Circle(x,y,color);
            hashMap.put(color, shapeToReturn);
        }
        return shapeToReturn;
    }
    
}
