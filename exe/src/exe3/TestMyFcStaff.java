package exe3;

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
public class TestMyFcStaff {
    
   static Scanner console = new Scanner(System.in);
   public static void main(String arg[], double totalSales){
 	String name;
        String staffID;
        int totalHoursWork;
        double sales;
       
        System.out.println("Enter Staff Name: ");
        name = console.nextLine();
        System.out.println("Enter Staff ID: ");
        staffID = console.nextLine();
        System.out.println("Enter Total Hours Work: ");
        totalHoursWork = console.nextInt();
        System.out.println("Enter Total Sales: ");
        sales = console.nextDouble();
       
        
//create object
MyFCStaff staff = new MyFCStaff(name, staffID ,totalHoursWork, totalSales); 

//invoke calculateCommision
staff.calculateCommission(); 

//invoke calculateSalary
staff.calculateSalary(); 
    
//invoke displaySalary
 staff.displaySalary(); 
}//end main
}//end class




