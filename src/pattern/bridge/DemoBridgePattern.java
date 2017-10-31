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
public class DemoBridgePattern {
    public static void main(String [] argv){
        RedCircle redCircle=new RedCircle();
        GreenCircle greenCircle=new GreenCircle();
        
        Circle circle1=new Circle(redCircle);
        circle1.draw();
        Circle circle2=new Circle(greenCircle);
        circle2.draw();
    }
}
