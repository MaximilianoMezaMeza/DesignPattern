/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.bridge;

/**
 *
 * @author Max
 */
public abstract class Shape {
    
    protected DrawApi drawApi;
    
    public Shape(DrawApi drawApi){
        this.drawApi=drawApi;
    }
    public abstract void  draw();
}
