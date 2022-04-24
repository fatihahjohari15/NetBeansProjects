/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pressurecooker;

import java.util.Scanner;

/**
 *
 * @author User-PC
 */
public class PressureCookerDemo {
    public static void main(String[] args) {
       String model;
       char size;
       String colour;
       int quantity;
       double price;
       
       PressureCooker[] arr = new PressureCooker[4];
       Scanner sc = new Scanner(System.in);
       
       for (int i = 0; i < arr.length; i++){
       System.out.println();
       System.out.print("Enter model of pressure cooker: ");
       model = sc.next();
       System.out.print("Enter size: ");
       size = sc.next().charAt(0);
       System.out.print("Enter colour: ");
       colour = sc.next();
       System.out.print("Enter quantity: ");
       quantity = sc.nextInt();
       System.out.print("Enter cooker price: RM");
       price = sc.nextDouble();
       
       PressureCooker pc = new PressureCooker(model, size, colour, quantity, price);
       
       arr[i] = pc;
       arr[i].calculatePrice(quantity);
       }
      
       
        for (int i = 0; i < arr.length; i++){
        System.out.println();
        System.out.println("Model  : "+arr[i].model);
        System.out.println("Size   : "+arr[i].size);
        System.out.println("Colour : "+arr[i].colour);
        System.out.println("Quantity: "+arr[i].quantity);
        System.out.printf("Total price: RM %.2f", arr[i].price);
        System.out.println();
    }

    }
}
