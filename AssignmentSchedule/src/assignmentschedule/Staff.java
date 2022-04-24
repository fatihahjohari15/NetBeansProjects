/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentschedule;

/**
 *
 * @author User-PC
 */
public class Staff {

private String name;
private String staffID;
private String duty;

public Staff(String name, String staffID, String duty){
    this.name = name;
    this.staffID = staffID;
    this.duty = duty;
}

public String getName(){
    return name;
}

public String getStaffID(){
    return staffID;
}

public String getDuty(){
    return duty;
}

public void printStaffDetails(){
    System.out.println("Name : "+name+"\n"
            + "Staff ID : "+staffID+"\n"
            + "Duty : "+duty);
}
}