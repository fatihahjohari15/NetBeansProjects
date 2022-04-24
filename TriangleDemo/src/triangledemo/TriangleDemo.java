/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangledemo;

/**
 *
 * @author User-PC
 */
import java.util.Scanner;
public class TriangleDemo
{
   public static void main(String[] args)
   {
      //create a Scanner object
      Scanner sc = new Scanner(System.in);

      // Prompt user to input value for height and base                 
      System.out.print("Enter height: ");
	double height = sc.nextDouble();
	System.out.print("Enter base: ");
	double base = sc.nextDouble();
        
      Triangle triangle = new Triangle(height, base);  
      //Set the height and base (use mutator) 
//      triangle.setHeight(height);
//      triangle.setBase(base);
      // Display the height, base and area (use accessor)
      System.out.println("The pyramid's height is "
                         + triangle.getHeight());
      System.out.println("The pyramid's base is "
                         + triangle.getBase());
      
     System.out.println("The pyramid's area is "
                         + triangle.getArea());
      
   }


}



