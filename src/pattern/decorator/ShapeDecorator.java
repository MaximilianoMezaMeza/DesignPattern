/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.decorator;

/**
 *
 * @author Max
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape shape;
    
    public ShapeDecorator(Shape shape){
        this.shape=shape;
    }
    public void draw(){
        this.shape.draw();
    }
}
