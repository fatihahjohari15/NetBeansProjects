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
public class Malaysian extends StaffUUM {
private String icNum;
private String residentialStatus;
    
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
}
