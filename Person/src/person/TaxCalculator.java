/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;


import java.util.Scanner;

/**
 *
 * @author User-PC
 */
public class TaxCalculator {

    public static void main(String[] args) {
    
    }
    
     public void input(){
     String name;
     String icNo;
     double totalIncome;
     double taxDeductionAmount;
     String status;   
     double taxableIncome;      
        
        Tax[] tax = new Tax[2]; 
        for (int i = 0; i <= tax.length; i++){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: " );
        name = sc.nextLine();
        
        System.out.print("Enter IC Number: " );
        icNo = sc.nextLine();
        
        System.out.print("Enter Your Taxable Income: RM" );
        totalIncome = sc.nextDouble();
        
        System.out.print("Enter Your Tax Deduction Amount : RM" );
        taxDeductionAmount = sc.nextDouble();
        
        System.out.print("Enter Your Marital Status[S/M] : " );
        status = sc.next();
        
        taxableIncome = totalIncome - taxDeductionAmount;
        Person person = new Person(name, icNo);
        Tax tax1 = new Tax(person, taxableIncome, status);
        tax1.calculateTax();
        
        System.out.println(person);
        }
    
     }
     public void printTaxAmount(){
        System.out.printf("%-30s%10s%10s%13s\n", "NAME", "IC NO", "");
        for (int j = 0; j < i; j++){
            System.out.println(tax[j].toString());
        }
     
    }

}


