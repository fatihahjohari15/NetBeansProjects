/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgshaf;

/**
 *
 * @author User-PC
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class NasiAyamMeletop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         String name ;
         String address;
         int number;
         int orderSet;
         int idOrder;
         int quantity;
         double distanceArea;
         double charge = 0.0;
         double totalPrice = 0.0;
         
         
         CustomerDetails2 [] customer ;
         customer = new CustomerDetails2[10];
         OrderingDetails2 [] list ;
         list = new OrderingDetails2 [10];
        
         ListOrder details = new ListOrder();
   
        System.out.println("*   WELCOME TO NASI AYAM MELETOP SHOP   *");
        System.out.println("----------------------------------------------------");
        System.out.println("*\t\tSET AVAILABLE\t\t  *");
        System.out.println("SET NORMAL [1] : NASI AYAM BEREMPAH \t   * RM5.50");
        System.out.println("SET EXTRA [2] : NASI AYAM MADU \t\t   * RM6.50");
        System.out.println("SET EXTRAGILER [3] : NASI AYAM MADU BAKAR  * RM8.50");
        System.out.println("----------------------------------------------------");
        
        
        for( int c = 1; c > 0; c++) {
        System.out.println("Customer" + c++);
        System.out.print("Name : ");
        name = sc.next() + sc.nextLine();
        
        System.out.print("Adress: ");
        address = sc.next() + sc.nextLine();
        
        System.out.print("Number: ");
        number = sc.nextInt();
       
        customer[c] = new CustomerDetails2(name, address,number);
        
        System.out.println("----------------------------------------------------");
        
        for( int od = 1; od > 0; od++){
            
        idOrder = 10 + od++;
        
        System.out.println("Order : " + "\nSET 1 : SET NORMAL" + "\nSET 2 : SET EXTRA" + "\nSET 3 : SET EXTRAGILER" +"\nYour choose : ");
        orderSet = sc.nextInt();
        
        System.out.print("Quantity : ");
        quantity = sc.nextInt();
        
        System.out.print("Distance area from shop (1 - 20 km) : " );
        distanceArea = sc.nextInt();
        
        list [od] = new OrderingDetails2(idOrder, orderSet, quantity,  distanceArea,charge,totalPrice);
        
        System.out.println("----------------------------------------------------");
        
        System.out.print("Add another set ( Y or N ) : ");
        String add = sc.next();
             switch (add) {
               case "y":
               case "Y" :
                od = 1;
                   break;
               default :
                od = -1;
             } //switch first
             
        } // loop second
        
        System.out.print("Add another customer ( Y or N ) : ");
        String cust = sc.next();
               switch (cust){
               case "y":
               case "Y" :
                c = 1 ;
                   break;
               default :
               c = -1;
    
    } // switch second
        } // loop first
     
    details.displayCustomer();
    details.displayOrder();
        
   }
}
