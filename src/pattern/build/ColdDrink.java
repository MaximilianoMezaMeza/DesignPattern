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
public class ColdDrink implements Item{
    Bottle bottle;

    @Override
    public String name() {
        return "ColdDrink";
    }

    @Override
    public Packing packing() {
        bottle=new Bottle();
        return bottle;
    }

    @Override
    public float price() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}