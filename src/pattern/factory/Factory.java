/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.factory;







/**
 *
 * @author Max
 */
public class Factory {
    
    public Shape createObject(Class typeObject){
        Shape figureInstance=null;
        if(typeObject==Circle.class){
            figureInstance=new Circle();
                    }else{
            if(typeObject==Square.class){
                figureInstance=new Square();
            }else{
                figureInstance=new Rectangle();
            }
        }
        return figureInstance;
    }
    
    public static void main(String [] argv){
        Factory factory=new Factory();
        Shape obj1=factory.createObject(Circle.class);
        obj1.draw();
        Shape obj2=factory.createObject(Square.class);
        obj2.draw();
        Shape obj3=factory.createObject(Rectangle.class);
        obj3.draw();
    }
    
}
