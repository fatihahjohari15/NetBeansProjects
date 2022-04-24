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
public class International extends StaffUUM {
private String passportNum;
private String originCountry;

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
}
