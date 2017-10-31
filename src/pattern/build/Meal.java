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
public class Meal {
    private ArrayList<Item> itemList=null;
    
    Meal(){
    itemList=new ArrayList<Item>();
    }
    public void addItem(Item item){
    itemList.add(item);
    }
    
    public void listOfItem(){
        int size=itemList.size();
        System.out.println("** Lista de Item **");
        for(int i=0;i<size;i++){
            
            System.out.println((i+1)+"-Item: "+itemList.get(i).name());
        }
    }
    
     public void priceOfItem(){
        int size=itemList.size();
        float totalPrice=0;
        System.out.println("** Precio de los Item **");
        for(int i=0;i<size;i++){
            totalPrice+=itemList.get(i).price();
            System.out.println((i+1)+"-Item: "+itemList.get(i).name()+" precio: "+itemList.get(i).price());
        }
        System.out.println("Precio Total: "+totalPrice);
    }
}
