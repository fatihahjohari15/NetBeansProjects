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
public class Rectangle {
private double length;
private double width;
     
   public Rectangle(double L, double W)  {
       length = L;
       width = W;
   }
   public double getLength() {
       return length;
   }
   public double getWidth() {
       return width;
   }
   public double area() {
       return length * width;
   }
@Override
   public String toString() {
     return ("length = " + length + "\n" + "width = " + width);
   }

} // end for Rectangle class
   

