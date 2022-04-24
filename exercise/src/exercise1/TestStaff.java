/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author User-PC
 */
import java.util.Scanner;

public class TestStaff {
   static Scanner console = new Scanner(System.in);
   public static void main(String arg[]){
 	
    Staff staff = new Staff();
    
    System.out.print("Name: ");
    String name = console.nextLine();
    
    System.out.print("Staff ID: ");
    String staffID = console.next();
    
    System.out.print("Working per Day: ");
    int workingDay = console.nextInt();
    
    staff.setStaffInfo(name, staffID, workingDay);
    staff.calculateSalary();
    staff.getSalary();
    

    
     }//end main
 
}
