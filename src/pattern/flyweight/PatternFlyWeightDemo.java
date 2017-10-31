/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.flyweight;

/**
 *
 * @author Max
 */
public class PatternFlyWeightDemo {
    public static String [] colors= {"Blue","Red","Green","Black","White"};
    public static void main(String [] argv){
        for(int i=0;i<20;i++){
            ShapeFactory.getCircle(generateColor(), generateX(), generateY()).draw();
        }
    }
    
    public static int generateX(){
       return (int)(Math.random()*colors.length);
    }
    
    public static int generateY(){
        return (int)(Math.random()*colors.length);
    }
    
    public static String generateColor(){
          return colors[(int)(Math.random()*colors.length)];
    }
}
