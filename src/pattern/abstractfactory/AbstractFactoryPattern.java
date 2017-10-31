/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.abstractfactory;





/**
 *
 * @author Max
 */

public class AbstractFactoryPattern {
    
    public static void main(String [] argv){
        FactoryProducer factory=new FactoryProducer();
        AbstractFactory colorFactory=factory.getFactory(ColorFactory.class);
        Color colorGreen=colorFactory.getColor(Green.class);
        colorGreen.fill();
        AbstractFactory shapeFactory=factory.getFactory(ShapeFactory.class);
        Shape shapeCircle=shapeFactory.getShape(Circle.class);
        shapeCircle.draw();
    }
    
}
