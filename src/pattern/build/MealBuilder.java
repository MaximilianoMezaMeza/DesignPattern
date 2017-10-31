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
public class MealBuilder {

    public Meal buildVegetarianMeal(){
        Meal vegetarian=new Meal();
        vegetarian.addItem(new Pepsi());
        vegetarian.addItem(new VegBurger());
        return vegetarian;
    }
    
     public Meal buildChickenMeal(){
        Meal chicken=new Meal();
        chicken.addItem(new CocaCola());
        chicken.addItem(new ChickenBurger());
        return chicken;
    }
}