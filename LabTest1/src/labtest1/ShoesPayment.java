/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest1;

/**
 *
 * @author User-PC
 */
//Nurul Fatihah Binti Johari (280904)
public class ShoesPayment {
private Shoes shoes;
private int quantity;

public ShoesPayment(Shoes shoes, int quantity){
    this.shoes = shoes;
    this.quantity = quantity;
}

public int getQuantity(){
    return quantity;
}

public double calculatePriceWithTax(){
   return shoes.getPrice() * 0.03;
}

@Override
public String toString(){
    String x = String.format("%-30d %-6.2f", quantity, shoes.getPrice());
    return x;
    
} 
}
