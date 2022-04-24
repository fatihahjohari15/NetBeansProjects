/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe1task1;

/**
 *
 * @author User-PC
 */
public class TestPoly{
 public static void main(String [] args){
   X abc = new X();
   abc.printName(); //print Name 1
   
   X def = new Y();
   def.printName(); //print Name 2
   System.out.println(def.returnInt()); //print 100
   
   X ghi = new Z();
   System.out.println(ghi.returnInt()); //print 200
   
   ghi = new Y();
   ghi.printName(); //print Name 2

   X [] arr = new X[2];
   arr[0] = new Y();
   arr[1] = new Z();
   
   for(int i=0;i<arr.length;i++)
   {
    System.out.println(arr[i].returnInt()); //print 100
    if(arr[i] instanceof X) //Y = true, Z = true
     System.out.println("Instance of X"); //print Instance of X
    if(arr[i] instanceof Y) // Y = true, Z = false
     System.out.println("Instance of Y"); //print Instance of Y
    if(arr[i] instanceof Z) //Y = false, Z = true
     System.out.println("Instance of Z"); //print Instance of Z
   }
   
 }
}//end of class TestPoly

