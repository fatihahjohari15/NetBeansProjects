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
public class Payroll {

private double netPay;
    
    public void calculateNetPay(Employee emp){
    
    netPay = emp.grossPay - emp.stateTax - emp.federalTax;

    }
    public void printOutput(){
    
    System.out.printf("\nNet pay is : RM %.2f", netPay);
    
    }

}

