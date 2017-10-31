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
class FactoryProducer{
    public AbstractFactory getFactory(Class type){
        AbstractFactory factoy=null;
        if(type==ShapeFactory.class){
            factoy=new ShapeFactory();
        }else{
             factoy=new ColorFactory();
        }
        return factoy;
    }
}