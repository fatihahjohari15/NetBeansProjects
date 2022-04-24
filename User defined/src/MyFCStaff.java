/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User-PC
 */
public class MyFCStaff {
    private String name;
    private String staffID;
    private int totalHoursWork;
    private double salary;
    private double totalSales;
    private double commission;
   
//create constructor

MyFCStaff (String name, String staffID, int totalHoursWork, double totalSales){

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

    @Override 
    public String toString(){ 

String s = "Staff Name   : "+name+ 
"\nStaff ID     : "+staffID+
"\nHours Work   : "+totalHoursWork;
s += String.format("\nTotal Sale   : RM %.2f ", totalSales);
s += String.format("\nTotal Salary : RM %.2f", salary); 

return s;
}//display
}//end class
  
  

