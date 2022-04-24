/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author User-PC
 */
public class Person {

 private String name;
 private String icNo;
 
public Person(String name, String icNo ){
   this.name = name;
   this.icNo = icNo;
}

public String toString(){
    
    String personInfo = String.format("%-35s%-15s",name,icNo);
    return personInfo;
}
   
}
