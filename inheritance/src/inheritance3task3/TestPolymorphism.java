/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance3task3;

/**
 *
 * @author User-PC
 */
public class TestPolymorphism {
    public static void main(String args[]){
        
        StaffUUM s;
        //create Malaysian object
        s = new Malaysian("Syed", "1169", "SBM", 6000.00, "830818-02-5261", "Citizen");
        System.out.println("Malaysian Staff\n"+s);
        System.out.println("Allowance: RM"+s.calculateAllowance(10));
        
        //create International object
        s = new International("Jason", "2290", "SMMTC", 10000.00, "G8990298", "United Kingdom");
        System.out.println("International Staff\n"+s);
        System.out.println("Allowance: RM"+s.calculateAllowance(7));
    }
}
