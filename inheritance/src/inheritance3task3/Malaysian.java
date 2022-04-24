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
public class Malaysian extends StaffUUM {
private String icNum;
private String residentialStatus;

public Malaysian(String name, String staffID, String school, double salary, String icNum, String residentialStatus){
    super(name, staffID, school, salary);
    this.icNum = icNum;
    this.residentialStatus = residentialStatus;
}

public void setIcNum(String icNum){
    this.icNum = icNum;
}

public void setResidentialStatus(String residentialStatus){
    this.residentialStatus = residentialStatus;
}

public String getIcNum(){
    return icNum;
}

public String getResidentialStatus(){
    return residentialStatus;
}

@Override
public double calculateAllowance(int noOfYear)
 {
  return super.calculateAllowance(noOfYear)+500;
 }

@Override
public String toString(){
    return super.toString() + "\nIC Number: "+icNum+ "\nResidential Status: "+residentialStatus;
}
}

