/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

/**
 *
 * @author User-PC
 */
 import java.util.*;
  class AgeInputVer2 {
     private static final String DEFAULT_MESSAGE = "Your age: ";
     private Scanner scanner;
     public AgeInputVer2(){ 
       scanner = new Scanner(System.in); 
     }
     public int getAge() throws NumberFormatException { 
        return getAge(DEFAULT_MESSAGE); 
    }
     public int getAge(String prompt){
     int age; 
     boolean keepGoing = true;
while (true) { 
  System.out.print(prompt);
  try { 
   age = scanner.nextInt();
   if (age < 0) { 
     throw new Exception("Negative age is invalid"); }
    return age; //input okay so return the value & exit
   } catch (InputMismatchException e) {
    scanner.next();
    System.out.println("Input is invalid.\n" 
                     + "Please enter digits only");
  } catch (Exception e) {
    System.out.println("Error: " + e.getMessage()); 
 }
}
    }
 }
