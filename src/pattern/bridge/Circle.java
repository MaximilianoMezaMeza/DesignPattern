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
public class Circle extends Shape {

    public Circle(DrawApi drawApi) {
        super(drawApi);
    }
    

    @Override
    public void draw() {
        drawApi.drawCircle();
    }
    
}
