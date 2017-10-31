/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.prototype;

import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Max
 */

abstract class Shape implements Cloneable{
    String id;
    String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
     abstract public void draw();
     
    public Object clone(){
        Object clone=null;
        try {
            clone= super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Shape.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clone;
    }

}


class Rectangle extends Shape{

    public  Rectangle() {
        this.type= "Rectangle";
    }
    
      public void draw(){
       System.out.println("Inside Rectangle::draw() method.");
    }

}

class Square extends Shape{
    public  Square() {
        this.type= "Square";
    }
     public void draw(){
        System.out.println("Inside Square::draw() method.");
    }

}

class Circle extends Shape{
    public  Circle() {
        this.type= "Circle";
    }
    
     public void draw(){
        System.out.println("Inside Circle::draw() method.");
    }

}

class ShapeCache{
    public static Hashtable<String,Shape> hashTable=new  Hashtable<String, Shape>();
    
    public static Shape getShape(String id){
        Shape shape=(Shape)hashTable.get(id);
        return (Shape)shape.clone();
    
    }
    
    public static void localCache(){
        Circle circle=new Circle();
        circle.setId("1");
        hashTable.put(circle.getId(), circle);
        
        Square square=new Square();
        square.setId("2");
        hashTable.put(square.getId(), square);
        
        Rectangle rectangle=new Rectangle();
        rectangle.setId("3");
        hashTable.put(rectangle.getId(), rectangle);
    }
}

public class Prototype {

    public static void main(String [] argv){
        ShapeCache.localCache();
        Shape shapeCircle=ShapeCache.getShape("1");
        shapeCircle.draw();
        Shape shapeSquare=ShapeCache.getShape("2");
        shapeSquare.draw();
        Shape shapeRectangle=ShapeCache.getShape("3");
        shapeRectangle.draw();
    
    }
}
