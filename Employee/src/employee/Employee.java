/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author User-PC
 */
public class Employee {
 
   Scanner sc = new Scanner(System.in);
   
   String employeeID;
   double grossPay;
   double stateTax;
   double federalTax;
   
   public void input(){
    
   System.out.print("Enter your employee ID number: ");
   employeeID = sc.next();
   
   System.out.print("Enter your Gross Pay         :RM ");
   grossPay = sc.nextDouble();
   
   System.out.print("Enter your State Tax         :RM ");
   stateTax = sc.nextDouble();
   
   System.out.print("Enter your Federal Tax       :RM ");
   federalTax = sc.nextDouble();
   
   }
}
