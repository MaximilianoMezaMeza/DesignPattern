/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.fadecade;

/**
 *
 * @author Max
 */
public class PatternDemoFadecade {
    public static void main(String [] argv){
        ShapeMaker shapeMaker=new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
