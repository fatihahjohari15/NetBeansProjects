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
public class TestInheritance
{
     public static void main(String []a) {
	Rectangle objRec = new Rectangle (4, 5);
	Box objBox = new Box(5, 4, 2);
	
	System.out.println(objRec);
	System.out.println(" Area of Rectangle = " + objRec.area());

	System.out.println(objBox);
	System.out.println(" Area of Box = " + objBox.area());
	System.out.println(" Volume of Box = " + objBox.volume());
    }

} // end for class Box extends

