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
public class TestPolymorphismArray{
    public static void main(String [] args){
        
    int numMalaysian = 0;
    int numInternational = 0;
   //create array of object for StaffUUM, size: 10.      
    StaffUUM[] arr = new StaffUUM[10];
   //create and assign 5 objects into the array. Use multiple objects (Malaysian and International)
    arr[0] = new Malaysian("Syed", "1169", "SBM", 6000.00, "830818-02-5261", "Citizen");
    arr[1] = new International("Jason", "2290", "SMMTC", 1000.00, "G8990298", "United Kingdom");
    arr[2] = new International("Charlie", "2291", "SOC", 1000.00, "S8990298", "Singapore");
    
   //use for loop to call method toString() and calculateAllowance(int noOfYear). Assume all staff has been working for 10 years 
    for (int i = 0; i < 3; i++)  {
        if (arr[i] instanceof Malaysian){
        numMalaysian++;
        System.out.println("Malaysian Staff\n"+arr[i]);
        }
        else{
        numInternational++;
        System.out.println("International Staff\n"+arr[i]);        
        }
        System.out.println("Allowance: RM"+arr[i].calculateAllowance(10));
        }
        System.out.println("Number of Malaysian Staff: "+numMalaysian);
        System.out.println("Number of International Staff: "+numInternational);
    
  }
}

