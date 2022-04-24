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
public class StaffUUM {
private String name;
private String staffID;
private String school;
private double salary;

public StaffUUM(String name, String staffID, String school, double salary){
    this.name = name;
    this.staffID = staffID;
    this.school = school;
    this.salary = salary;
}

public void setName(String staffName){
    this.name = staffName;
}

public void setStaffID(String ID){
    this.staffID = ID;
}

public void setSchool(String school){
    this.school = school;
}

public void setSalary(double staffSalary){
    this.salary = staffSalary;
}

public String getName(){
    return name;
}

public String getStaffID(){
    return staffID;
}

public String getSchool(){
    return school;
}

public double getSalary(){
    return salary;
}

public double calculateAllowance(int noOfYear)
 {
  double bonus = noOfYear *200;
  return bonus;
 }

@Override
public String toString(){
    return ("Name: "+name+ "\nStaff ID: "+staffID+ "\nSchool: "+school+ "\nSalary : RM"+salary);
}
}

