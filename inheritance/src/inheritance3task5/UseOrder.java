/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance3task5;

import java.util.Scanner;

/**
 *
 * @author User-PC
 */
public class UseOrder {
    public static void main(String[] args){
     String custName;
     String orderID;
     String itemName;
     int quantity;
     double unitPrice;
     String location;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Customer Name: ");
     custName = sc.next();
     System.out.print("Order id: ");
     orderID = sc.next();
     System.out.print("Item Name: ");
     itemName = sc.next();
     System.out.print("Quantity: ");
     quantity = sc.nextInt();
     System.out.print("Unit Price: ");
     unitPrice = sc.nextDouble();
     
     System.out.println("\nORDER\n");
     Order order = new Order(custName, orderID, itemName, quantity, unitPrice);
     order.displayOrder();
     
     System.out.print("\n\nCustomer Name: ");
     custName = sc.next();
     System.out.print("Order id: ");
     orderID = sc.next();
     System.out.print("Item Name: ");
     itemName = sc.next();
     System.out.print("Quantity: ");
     quantity = sc.nextInt();
     System.out.print("Unit Price: ");
     unitPrice = sc.nextDouble();
     System.out.print("Location: ");
     location = sc.next();
     
     System.out.println("\nSHIPPED ORDER\n");
     ShippedOrder sOrder = new ShippedOrder(custName, orderID, itemName, quantity, unitPrice, location);
     sOrder.displayShippedOrder();

    }
}
