/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance3task2;

/**
 *
 * @author User-PC
 */
public class StaffUUM {
private String name;
private String staffID;
private String school;
private double salary;

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
}
