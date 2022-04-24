/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest1;

import java.util.Scanner;

/**
 *
 * @author User-PC
 */
//Nurul Fatihah Binti Johari (280904)
public class TestShoesPayment {
static ShoesPayment[] arr = new ShoesPayment[2];
static Scanner read = new Scanner(System.in);
static int count = 0;
    public static void main(String arg[]){
     
        char cont = 0;
        
       
        do{
            char add = 0;
        do{  
        for (int i = 0; i <= arr.length; i++){
        System.out.println("Customer "+(i+1));
        System.out.println("----------");
//        for (int j = 0; j <= arr.length; j++){
        System.out.println("Shoes "+(i+1));
        input();//invoke input method
        System.out.print("Add more shoes (Y/N)?");
        add = read.next().charAt(0);    
       
        }
        }while (add == 'Y' || add == 'y');
        if (add == 'N' || add == 'n'){
            billDetails();//invoke billDetails to print
            System.out.print("Do you want to continue (Y/N)?");
            cont = read.next().charAt(0);
        }
        }while(cont == 'Y' || cont == 'y');
        if (cont == 'N' || cont == 'n'){
        System.out.println("Thank You. Bye");
        }
        
            
    }
    
    public static void input(){
    String brand;
    String colour;
    int size;
    double price;   
    int quantity;
    char add;
    
    System.out.print("Enter brand: ");
    brand = read.next();
    
    System.out.print("Enter colour: ");
    colour = read.next();
    
    System.out.print("Enter size: ");
    size = read.nextInt();
    
    System.out.print("Enter price: RM ");
    price = read.nextDouble();
    
    System.out.print("Enter quantity of the shoes: ");
    quantity = read.nextInt();
  
    Shoes shoes = new Shoes(brand, size, colour, price);
    ShoesPayment shoesP = new ShoesPayment(shoes, quantity);
    
    arr[count] = shoesP;
    count++;
    
    
    
    }
    
    public static void billDetails(){
       
    System.out.println("---------------------BILL DETAILS----------------------------");
    String.format("-6s, -6s, -6s, -6s, -6s, -6.2f", "Brand", "Colour", "Size", "Price", "Quantity", "Price with Tax");    
    for (int count = 0; count < arr.length; count++){
    System.out.println(shoes);
    System.out.println(arr[count].x);
    System.out.println("------------------------------");
    String.format("Total Price with Tax: RM %.2f");
    System.out.println("Total Bonus Point: ");
    System.out.println("------------------------------");
    
            }
    }
    
    public static int determineBonusPoint(int quantity){
    int bonuspoint;
    
        if(quantity < 2){
            bonuspoint = 0;
        }    
        else if (quantity >= 2 && quantity<= 5){
            bonuspoint = 10;
        }
        else if (quantity >= 6 && quantity<= 10){
            bonuspoint = 20;
        }
        else{
            bonuspoint = 30;
        }
        
        return bonuspoint;
    }
}
