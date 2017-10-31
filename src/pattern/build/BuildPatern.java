/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.build;

import java.util.ArrayList;

/**
 *
 * @author Max
 */

public class BuildPatern {
    public static void main(String [] argv){
        MealBuilder mbuilder=new MealBuilder();
        Meal vegeterianMeal=mbuilder.buildVegetarianMeal();
        Meal chickenMeal=mbuilder.buildChickenMeal();
        
        vegeterianMeal.listOfItem();
        vegeterianMeal.priceOfItem();
        
        chickenMeal.listOfItem();
        chickenMeal.priceOfItem();
    }
}
