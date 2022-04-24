/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author User-PC
 */
public class Staff {
   	private String name, staffID;
 	private double salary;
 	private int workingDay;
 	public void setStaffInfo(String nm, String id, int wDay){
       	name=nm;
          staffID=id;
          workingDay=wDay;
 	}
 	public void calculateSalary(){
       	salary = workingDay * 35.0;
 	}
 	public double getSalary(){
       	return salary;
 	}
 	public String getName(){
       	return name;
 	}
 	public String getStaffID(){
       	return staffID;
 	}
}//end class
  
