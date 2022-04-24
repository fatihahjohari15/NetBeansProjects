/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author User-PC
 */
public class Staff { //start class Staff
//variable declaration
protected String name;
protected String staffID;
protected String duty;

public Staff(String name, String staffID, String duty){ //constructor
    this.name = name;
    this.staffID = staffID;
    this.duty = duty;
}

// start getName method
public String getName(){
    return name;
} //end getName method

// start getStaffID method
public String getStaffID(){
    return staffID;
} //end getStaffID method

//start getDuty method
public String getDuty(){
    return duty;
} //end getDuty method

//start printStaffDetails method
public String printStaffDetails(){
    return "\nName : "+name+ "\nStaff ID : "+staffID+ "\nDuty : " +duty+"\n";
} //end printStaffDetails method

} //end class Staff
