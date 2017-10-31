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
class Red implements Color{

    @Override
    public void fill() {
         System.out.println("Fill Red color");
    }

}