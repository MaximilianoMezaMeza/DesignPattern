/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.build;

/**
 *
 * @author Max
 */
public class Pepsi extends ColdDrink{
    
     @Override
    public String name() {
       return "Pepsi Cola";
    }

 
    @Override
    public float price() {
        return 10.0f;
    }
}
