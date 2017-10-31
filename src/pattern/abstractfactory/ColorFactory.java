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
public class ColorFactory extends AbstractFactory {
     public Color  getColor(Class color){
    Color colorInstance=null;
        if(color==Green.class){
            colorInstance=new Green();
                    }else{
            if(color==Red.class){
                colorInstance=new Red();
            }else{
                colorInstance=new Blue();
            }
        }
        return colorInstance;
     }
}
