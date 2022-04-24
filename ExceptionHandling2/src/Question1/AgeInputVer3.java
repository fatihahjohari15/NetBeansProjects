/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author User-PC
 */
import java.util.*;
  class AgeInputVer3 {
     private static final String DEFAULT_MESSAGE = "Your age: ";
     private Scanner scanner;
     public AgeInputVer3(){ 
       scanner = new Scanner(System.in); 
     }
     public int getAge() throws Exception{ 
        return getAge(DEFAULT_MESSAGE); 
     }
    public int getAge(String prompt)throws Exception {
     int age=0;
     String inputStr ="";
     while (true) { 
     System.out.print(prompt);
     try { 
      inputStr = scanner.next();
      age = Integer.parseInt(inputStr);
      if (age < 0) { 
        throw new Exception("Negative age is invalid"); }
      return age; //input okay so return the value & exit
      } catch (NumberFormatException e) {
        System.out.println("Input is invalid.\n" 
                     + "Please enter integer digits only");
      } 
     }//while true
    }//getAge()
}//class

