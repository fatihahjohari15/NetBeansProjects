/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance3task5;

/**
 *
 * @author User-PC
 */
public class ShippedOrder extends Order{
    
private String location; 
private double shippingandhandling = 4.00;

public ShippedOrder(String custName, String orderID, String itemName, int quantity, double unitPrice, String location){

    super(custName, orderID, itemName, quantity, unitPrice);
    this.location = location;
}

@Override
public double computePrice(int quantity, double unitPrice){
    totalPrice = (quantity*unitPrice)+shippingandhandling;
    return totalPrice;
}

public void displayShippedOrder(){
    System.out.println("Customer Name: "+custName);
    System.out.println("Order id: "+orderID);
    System.out.println("Item Name: "+itemName);
    System.out.println("Quantity: "+quantity);
    System.out.printf("Unit Price: RM%.2f", unitPrice);
    System.out.println("\nLocation: "+location);
    System.out.printf("Total Price: RM%.2f", +computePrice(quantity, unitPrice));
       
}
}
