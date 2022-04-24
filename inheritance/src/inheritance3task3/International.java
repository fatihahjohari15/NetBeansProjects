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
public class International extends StaffUUM {
private String passportNum;
private String originCountry;

public International(String name, String staffID, String school, double salary, String passportNum, String originCountry){
    super(name, staffID, school, salary);
    this.passportNum = passportNum;
    this.originCountry = originCountry;
}

public void setPassportNum(String passportNum){
    this.passportNum = passportNum;
}

public void setOriginCountry(String originCountry){
    this.originCountry = originCountry;
}

public String getPassportNum(){
    return passportNum;
}

public String getOriginCountry(){
    return originCountry;
}

@Override
public double calculateAllowance(int noOfYear)
 {
  return super.calculateAllowance(noOfYear)+900;
 }

@Override
public String toString(){
    return super.toString() + "\nPassport Number: "+passportNum+ "\nOrigin Country: "+originCountry;
}
}

