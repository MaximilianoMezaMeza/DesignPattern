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
class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(Class shape) {
        Shape figureInstance=null;
        if(shape==Circle.class){
            figureInstance=new Circle();
                    }else{
            if(shape==Square.class){
                figureInstance=new Square();
            }else{
                figureInstance=new Rectangle();
            }
        }
        return figureInstance;
    }
}