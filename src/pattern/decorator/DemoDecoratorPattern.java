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
public class DemoDecoratorPattern {
    public static void main(String [] argv){
     
        Circle circle=new Circle();
        Rectangle rectangle= new Rectangle();
        
        RedShapeDecorator redCircleDecorator=new RedShapeDecorator(circle);
     
        RedShapeDecorator redRectangleDecorator=new RedShapeDecorator(rectangle);
      
        redRectangleDecorator.draw();
      
        redCircleDecorator.draw();
    
    }

}
