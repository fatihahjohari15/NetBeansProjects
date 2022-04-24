package assignment3;

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

public String printStaffDetails(){
    return "\nName : "+name+ "\nStaff ID : "+staffID+ "\nDuty : " +duty+"\n";
} //end printStaffDetails method

} //end class Staff