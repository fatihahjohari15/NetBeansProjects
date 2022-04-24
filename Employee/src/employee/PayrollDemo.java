/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author User-PC
 */
public class PayrollDemo {
     public static void main(String[] args){
         
         Employee emp = new Employee();
         Payroll payRoll = new Payroll();
         
         emp.input();
         payRoll.calculateNetPay(emp);
         payRoll.printOutput();
     }
}
