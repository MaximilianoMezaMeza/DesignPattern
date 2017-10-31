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
public class ShapeMaker {

    private Shape square;
    private Shape rectangle;
    private Shape circle;

    public ShapeMaker() {
        this.square = new Square();
        this.rectangle = new Rectangle();
        this.circle = new Circle();
    }
    
    public void drawCircle(){
        this.circle.draw();
    }
    
    public void drawSquare(){
         this.square.draw();
    }
    
    public void drawRectangle(){
        this.rectangle.draw();
    }
}
