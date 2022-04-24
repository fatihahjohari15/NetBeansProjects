/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User-PC
 */

import java.util.Scanner;
public class TestMyFCStaff {
 static Scanner console = new Scanner(System.in);

    /**
     *
     * @param arg
     */
    public static void main(String arg[]){
 	String name;
        String staffID;
        int hoursWork;
        double sales;
       
        System.out.print("Enter Staff Name: ");
        name = console.nextLine();
        System.out.print("Enter Staff ID: ");
        staffID = console.nextLine();
        System.out.print("Enter Total Hours Work: ");
        hoursWork = console.nextInt();
        System.out.print("Enter Total Sales: ");
        sales = console.nextDouble();
       
        
//create object
MyFCStaff staff = new MyFCStaff(name, staffID ,hoursWork, sales); 

//invoke calculateCommision
staff.calculateCommission(); 

//invoke calculateSalary
staff.calculateSalary(); 
    
//invoke displaySalary
 System.out.println(staff); 
}//end main
}//end class

    

