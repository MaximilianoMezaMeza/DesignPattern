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
class VegBurger extends Burger{
     
     @Override
    public String name() {
       return "Vegetarian Burger";
    }

 
    @Override
    public float price() {
        return 20.0f;
    }

}