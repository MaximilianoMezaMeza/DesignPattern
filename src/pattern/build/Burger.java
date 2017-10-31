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
class Burger implements Item{
    Wrapper wrapper;

    @Override
    public String name() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Packing packing() {
        wrapper=new Wrapper();
        return wrapper;
    }

    @Override
    public float price() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}