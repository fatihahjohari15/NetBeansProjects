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
public class Tax {
    private Person person;
    private double taxableIncome;
    private String status;
    double taxAmount;
    private double RATE1 = 0.10;
    private double RATE2 = 0.20;
    private double RATE3 = 0.35;
    
public Tax(Person person, double taxableIncome, String status){
    this.person = person;
    this.taxableIncome = taxableIncome;
    this.status = status;

}

public double calculateTax(){
    
    switch (status)
        {
            case "S" :
                if(taxableIncome >= 0 && taxableIncome <= 21000)
                        taxAmount = taxableIncome * RATE1;
                else if(taxableIncome >= 21001 && taxableIncome <= 51000)
                        taxAmount = taxableIncome * RATE2;
                else
                        taxAmount = taxableIncome * RATE3;
                break;
            
            case "M" :
                if(taxableIncome >= 0 && taxableIncome <= 35000)
                        taxAmount = taxableIncome * RATE1;
                else if(taxableIncome >= 35001 && taxableIncome <= 86000)
                        taxAmount = taxableIncome * RATE2;
                    else
                        taxAmount = taxableIncome * RATE3;
                break;
            default :
                break;
                        
        }
        return taxAmount;
    
}
    @Override
    public String toString(){
    String s = "";
    s += String.format("\nTaxable Income: RM%.2f" , taxableIncome);
    s += String.format("\nTax Amount: RM%.2f" , taxAmount);
    
    return s;
}
}
