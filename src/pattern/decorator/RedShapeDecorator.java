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
public class RedShapeDecorator extends ShapeDecorator{
    
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    
    public void setRedBorder(Shape shape){
        System.out.println("Decorator: Shape "+shape.getClass().getSimpleName()+" border are red");
    }
    
    public void draw(){
        this.shape.draw();
        setRedBorder(shape);
    }
    
}
