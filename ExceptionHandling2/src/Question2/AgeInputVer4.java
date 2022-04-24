/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author User-PC
 */
import java.util.*;
public class AgeInputVer4 {
    private static final String DEFAULT_MESSAGE = "Your age: ";
     private Scanner scanner;
     public AgeInputVer4(){ 
       scanner = new Scanner(System.in); 
     }
     public int getAge() throws Exception{ 
        return getAge(DEFAULT_MESSAGE); 
     }
        public int getAge(String prompt)throws NumberFormatException {
     int age=0;
     String inputStr ="";
     while (true) { 
     System.out.print(prompt);
     
      inputStr = scanner.next();
      age = Integer.parseInt(inputStr);
      return age; //input okay so return the value & exit
      
     }//while true
    }//getAge()
}//class
