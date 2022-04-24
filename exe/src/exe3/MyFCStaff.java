/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3;

/**
 *
 * @author User-PC
 */
public class MyFCStaff {
    
 
    private final String name;
    private final String staffID ;
    private final int totalHoursWork;
    private double salary;
    private final double totalSales;
    private double commission;
   
//create constructor

MyFCStaff (String name, String staffID, int  totalHoursWork, double totalSales){

      //left instance variable(must put "this.") and right is parameter
      this.name = name;
      this.staffID =  staffID;
      this.totalHoursWork = totalHoursWork;
      this.totalSales = totalSales;

}//end constructor

public void calculateCommission(){

  if (totalSales <150)
	commission = 0;
  else if (totalSales >= 150 && totalSales <= 300)
	commission = 0.05*totalSales;
  else if (totalSales >= 301 && totalSales <= 500)
	commission = 0.10*totalSales;
  else 
	commission =  0.15*totalSales;

}//end calculateCommision

public void calculateSalary(){  
  
  salary = ((totalHoursWork*8) + commission);
  
}//end calculateSalary

public void displaySalary(){ 

System.out.println("Staff Name:" +name);
System.out.println("StaffID             :" +staffID);
System.out.println("Hours Work     :" +totalHoursWork);
System.out.printf("\nTotal Sale  RM%.2f:" ,totalSales);
System.out.printf("\nTotal Salary  RM%.2f:",salary); 

}//display
}//end class


