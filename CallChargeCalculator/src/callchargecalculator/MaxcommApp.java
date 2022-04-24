/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callchargecalculator;

import java.util.Scanner;

/**
 *
 * @author User-PC
 */
public class MaxcommApp {
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int duration;
        int category;
        int cont;
        
        Scanner sc = new Scanner(System.in);
        
        do {
            
        System.out.print("\nEnter the call duration (in minutes): \n");
        duration = sc.nextInt();
        
        System.out.print("Enter Rate Category:  1.Daytime  2.Evening  3.Off-Peak \n");
        category = sc.nextInt();
        
        CallChargeCalculator ccc = new CallChargeCalculator();
        
        ccc.computeCharge(duration, category);
        
        System.out.printf("The amount you have to pay is = RM%.2f", ccc.charge);
        System.out.print("\nDo you want to continue? 1.Yes  2.No \n");
        cont = sc.nextInt();
        
        } while (cont == 1);
        
        if (cont == 2){
            System.out.println("Thank you! See you again.");
        }
            
        
    }
}
