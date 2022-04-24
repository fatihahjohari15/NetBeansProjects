/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author User-PC
 */
public class Box extends Rectangle
{
    private double height;
     
    public Box(double L, double W, Double H){
       super(L,W);
       height = H;
    }
         public double getHeight(){
         return height;
    }
    @Override
    public double area() {
       return  2  * (getLength() * getWidth() + getLength() * height 
	+ getWidth() * height);
    } 
    public double volume() {
       return super.area() * height;
    }
    @Override
    public String toString() {
       return super.toString () + "height = " + height;
    }

} // end for class Box extends


