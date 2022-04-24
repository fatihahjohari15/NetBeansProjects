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
public class Order {
String custName;
String orderID;
String itemName;
int quantity;
double unitPrice;
double totalPrice;

public Order(String custName, String orderID, String itemName, int quantity, double unitPrice){
    
    this.custName = custName;
    this.orderID = orderID;
    this.itemName = itemName;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
    
}

public void setTotalPrice(double totalPrice){
    this.totalPrice = totalPrice;
}

public double computePrice(int quantity, double unitPrice){
    totalPrice = quantity*unitPrice;
    return totalPrice;
}

public void displayOrder(){
    System.out.println("Customer Name: "+custName);
    System.out.println("Order id: "+orderID);
    System.out.println("Item Name: "+itemName);
    System.out.println("Quantity: "+quantity);
    System.out.printf("Unit Price: RM%.2f", unitPrice);
    System.out.printf("\nTotal Price: RM%.2f", +computePrice(quantity, unitPrice));    
}
}   