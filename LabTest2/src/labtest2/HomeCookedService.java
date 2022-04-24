/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest2;

public class HomeCookedService {
private String name;
private String foodCode;
private int numberOfOrder;

    public HomeCookedService(String name, String foodCode, int numberOfOrder) {
        this.name = name;
        this.foodCode = foodCode;
        this.numberOfOrder = numberOfOrder;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return foodCode;
    }

    public int getNumOrder() {
        return numberOfOrder;
    }
    
    public double totalPrice(double price){
    
        double totalPrice = 0;
        double salesTax = 0.01;
        double discount = 0.03;
        double totalPriceWTax = 0;
                
        if (numberOfOrder > 3){
            
            totalPrice = ((numberOfOrder * price)-((numberOfOrder * price)*discount));      
            totalPriceWTax = totalPrice + (totalPrice*salesTax);
        }
        else{
            totalPrice = (numberOfOrder * price);      
            totalPriceWTax = totalPrice + (totalPrice*salesTax); 
        }
     
    return totalPriceWTax;
        
    }    
    
}
