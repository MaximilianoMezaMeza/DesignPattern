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
class Singleton{
    private ObjetoUnaInstancia instance=null;
    public ObjetoUnaInstancia getInstance(){
        if(!(instance instanceof ObjetoUnaInstancia)){
            instance= new ObjetoUnaInstancia();
        }
        return instance;
    }
}