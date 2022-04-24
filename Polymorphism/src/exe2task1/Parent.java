/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe2task1;

/**
 *
 * @author User-PC
 */
public class Parent {
    int xy;
    double pq;
    
Parent(){ //default constructor
        xy = 10;
        pq = 1.0;
 }
    
Parent(int a){
        xy = a;
        pq = 1.0;
 }

public void methodX(){
    System.out.println("In Parent: methodX()");
    xy = 10;
}
    
public void methodY(){
    System.out.println("In Parent: methodX()");
    pq = 0.5;
}    
}
