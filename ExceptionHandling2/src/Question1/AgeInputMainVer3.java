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
  class AgeInputMainVer3 {
  public static void main(String[] args){
     GregorianCalendar today;
     int age=0, thisYear, bornYr;
     String answer=null;
     Scanner scanner = new Scanner(System.in);
     AgeInputVer3 input = new AgeInputVer3() ; 
     boolean keepGoing=true;
     while(keepGoing){
     try{
       age = input.getAge("How old are you? ");    
       keepGoing=false;
     } catch (Exception e) {
        System.out.println("Error: " + e.getMessage()); 
      }//catch Exception
    }//while negative value
    today = new GregorianCalendar() ; 
    thisYear = today.get(Calendar.YEAR);
    bornYr   = thisYear - age;
    keepGoing=true;
    while (keepGoing){
    try{
     System.out.print("Already had your birthday this year? (Y or N)");
     answer = scanner.next();
     if (!(answer.equalsIgnoreCase("Y")||(answer.equalsIgnoreCase("N")))) { 
         throw new Exception("Invalid Input");
       }
       if (answer.equalsIgnoreCase("N")) { 
         bornYr--; 
       }
       System.out.println("\nYou are born in " + bornYr);
       keepGoing=false;
    }catch (Exception e) {
    System.out.println("Error: " + e.getMessage()); 
    }
  }//while  
 }//main
}//class

