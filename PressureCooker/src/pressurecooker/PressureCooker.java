/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pressurecooker;

/**
 *
 * @author User-PC
 */
public class PressureCooker {
    
String model;
char size;
String colour;
int quantity;
double price;


public PressureCooker(String model, char size, String colour, int quantity, double price){
    this.model = model;
    this.size = size;
    this.colour = colour;
    this.quantity = quantity;
    this.price = price;
    
}

public double calculatePrice(int quantity){
    
price = quantity*price;        
           
    return price;
}
    
}
