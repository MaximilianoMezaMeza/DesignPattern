/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.singleton;

/**
 *
 * @author Max
 */
public class ObjetoUnaInstancia{
    static int instancesCount;
    ObjetoUnaInstancia(){
        instancesCount++;
    }
    
    public void  printMyData(){
        System.out.println("Esta es una instancia de la clase ObjetoUnaInstancia, la cantidad de instancias son: "+instancesCount);
    }
}
