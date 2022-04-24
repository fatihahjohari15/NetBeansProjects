/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callchargecalculator;

/**
 *
 * @author User-PC
 */
public class CallChargeCalculator {
   
    double charge;
    
    
public double computeCharge(int duration, int category){

if (category == 1){
    charge = duration*0.07;
}
else if (category == 2){

    charge = duration*0.12;
}
else if (category == 3){

    charge = duration*0.05;
}


return charge;

}
}


    
    
