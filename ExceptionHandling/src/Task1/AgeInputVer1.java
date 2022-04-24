/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

import java.util.*;
  class AgeInputVer1 {
     private static final String DEFAULT_MESSAGE = "Your age: ";
     private Scanner scanner;
     public AgeInputVer1(){ 
       scanner = new Scanner(System.in); 
     }
     public int getAge() { 
        return getAge(DEFAULT_MESSAGE); 
    }
    public int getAge(String prompt){
    int age; 
    boolean keepGoing = true;
    while (true){
    System.out.print(prompt);
    try {
     age = scanner.nextInt();
     return age;
    } catch (InputMismatchException e){
     scanner.next(); //remove the leftover garbage 
                     //from the input buffer
    System.out.println("Invalid Entry.Please enter digits only.");
   }
  }
 }
   
}
