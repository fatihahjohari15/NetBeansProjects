/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author User-PC
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
  static Scanner sc = new Scanner(System.in);   */
    public static void main(String[] args) {
        // TODO code application logic here
   
      //variable declaration
      int[] arr = new int[100];
      int opt;
      int proceed = 0;
      
      //Array for storing food prices 
      double[] price = { 12.00 , 16.00 , 8.00 , 11.00 , 10.00 , 15.00 , 10.00 , 5.00 , 5.00 , 10.00 };
      
      //Array for storing food name
      String[] foodName = {"Spicy Korean Chicken(12pcs)", "Cheezy Korean Chicken(12pcs)", "Beef Gimbap(6pcs)", "Jjajangmyeon", "Tteotbokki", "Spicy Oden", "Bulgogi", "Kimchi", "Danmuji", "So-tteok so-tteok"};  
      
      //welcome message
      System.out.println("````Welcome To Smirtea Korean Cuisine Hub````");
      System.out.println("\t\t =======  start to order =======");
      
      //Prompt user to input their name, adress and area      
      System.out.print("\nName: ");
      String name = sc.nextLine();
      
      System.out.print("Adress: ");
      String adress = sc.nextLine();
          
      System.out.println("Area:- \n"
                     +"1: Gelugor\n"
                     +"2: Bayan Baru\n"
                     +"3: Bayan Lepas\n"
                     +"4: Balik Pulau\n"
                     +"5: Tg Bungah\n");
      
      
      int area;      
      double DeliveryFees = 0, Fees = 0, TotalOrder = 0, TotalPrice = 0;
      do { //start of loop for delivery fees 
      
      System.out.print("Please select only available area: ");
  
      area = sc.nextInt(); 
      
      switch(area){
         case 1: 
            DeliveryFees += 3.00;
            break;
         case 2:
            DeliveryFees += 4.00;
            break;
         case 3:
            DeliveryFees += 5.00;
            break;
         case 4:
            DeliveryFees += 6.00;
            break;
         case 5:
            DeliveryFees += 5.00;
            break;
         default:
            System.out.println("Sorry we didn't cover your area");
            System.out.println();
                      
         } 
      }  while (area != 1 && area != 2 && area != 3 && area != 4 && area != 5); //end of loop if user input available area 
      
      Fees += DeliveryFees;  
      System.out.println(); 
      FoodMenu(); 
      
      do{ //start of loop for option
       
      System.out.println();
      Option();
      System.out.print("\nYour Option: ");
      opt = sc.nextInt();
      
      if (opt == 6){

      //calculation for total order, tax and total price
      TotalOrder = CalculateOrder(arr, proceed, TotalPrice, price);
      double Tax = 0.05*TotalOrder;
      TotalPrice = TotalOrder + Tax + Fees;
      
      //display output 
      System.out.println("-----------------------------------------");
      System.out.printf("\nSubtotal:          RM "+"%.2f",TotalOrder);
      System.out.printf("\ninc. Tax:          RM "+"%.2f",Tax);
      System.out.printf("\nDelivery Fee       RM "+"%.2f",Fees);
      System.out.printf("\nTOTAL(INCL. TAX):  RM "+"%.2f",TotalPrice);
      System.out.println();  
      System.out.println("-----------------------------------------");
      
      System.out.println();
      //Ask user to choose which payment method they preferred
      System.out.println("\nPayment Method\n1: Online Banking\n2: Cash On Delivery");
      int payment;
      
      do{ //start of loop for payment method
      
      System.out.print("Select your preferred payment method: ");
      payment = sc.nextInt();
      
      if (payment == 1){
      System.out.println("\nSuccessfully paid");
      }
      else if (payment == 2){
      System.out.println("\nPlease pay the exact amount to the rider");
      }
      else{
      System.out.println();
      System.out.println("INVALID PAYMENT METHOD!");
      System.out.println("\nPayment Method\n1: Online Banking\n2: Cash On Delivery");}
      
      } while (payment != 1 && payment != 2);// end of loop if user choose valid payment method
     
      System.out.println("\nThank you for your purchase, ENJOY YOUR MEAL !");
      System.out.println("************************************************"); 
      System.exit(0);  
             
      }     
      else {
      proceed = processOrder(arr, opt, proceed, foodName, price);
      }

      } while (opt != 7); //end of loop for option if user input 7
      System.out.println("\nGoodbye :(");
      System.exit(0);
      
   }//end main method
   
   //create Option method   
   public static void Option(){
    System.out.println("Option: \n"
                   +"1: Add To Cart\n"
                   +"2: Change Order\n"
                   +"3: Remove Order\n"
                   +"4: Display Order\n"
                   +"5: Search Your Order\n"
                   +"6: Check Out Order & Finish\n"
                   +"7: Exit");
                   
   }//end Option method 
   
    public static void FoodMenu(){
     System.out.println("\t\t\tFOOD MENU\t\t\t\t\t\tPRICE(RM)");
     System.out.println("0:  Spicy Korean Chicken(12pcs)      12.00");
     System.out.println("1:  Cheezy Korean Chicken(12pcs)     16.00");
     System.out.println("2:  Beef Gimbap(6pcs)                 8.00");
     System.out.println("3:  Jjajangmyeon                     11.00");
     System.out.println("4:  Tteotbokki                       10.00");
     System.out.println("5:  Spicy Oden                       15.00");
     System.out.println("6:  Bulgogi                          10.00");
     System.out.println("7:  Kimchi                            5.00");
     System.out.println("8:  Danmuji                           5.00");
     System.out.println("9:  So-tteok so-tteok                10.00");
   }//end FoodMenu method
    
    //start processOrder method
    public static int processOrder(int[] arr, int opt, int proceed, String[] foodName, double[] price){
    switch(opt){
    case 1: 
      proceed = AddToCart(arr, proceed); 
    break;
    case 2: 
      ChangeOrder(arr, proceed); 
    break;
    case 3: 
      proceed = RemoveOrder(arr, proceed); 
    break;
    case 4: 
      DisplayOrder(arr, proceed, foodName, price); 
    break;
    case 5: 
      SearchOrder(arr, proceed); 
    break;
    case 7: 
    break;
    default: 
      System.out.println("INVALID OPTION!"); 
      System.out.println("Please try again"); break;
    }
    return proceed;
    } //end processOrder method
    
    //start AddToCart method
    public static int AddToCart (int [] arr, int proceed ){
    FoodMenu();
    System.out.println();
      if (proceed < arr.length){
         System.out.print("Items to be added : ");
         arr[proceed] = sc.nextInt();
         if (arr[proceed] <= 9){
         proceed++;
         }
         else{
         System.out.println("Sorry, your order is not available in our menu :(");
         System.out.print("Please select order that available only: ");
         arr[proceed++] = sc.nextInt();}
            
        }
        else {    
        System.out.print("CART IS FULL ");
        }
     return proceed;
    } //end AddToCart method
   
    //start ChangeOrder method
   public static void ChangeOrder(int[] arr, int proceed){
      int order;
      boolean search = false;
      if (proceed==0)
         System.out.println("Sorry order cart is null.");
      else {
         System.out.print("Change order?:");
         order = sc.nextInt();
         
         for (int i = 0; i < proceed; i++){
         if (arr[i] == order){
            System.out.print("New order ?:");
            order = sc.nextInt();
            arr[i]=order;
            search = true;
            break;
         }
        }
        if (search == false)
         System.out.println("Sorry your search order is not in the cart.");
    }
   } //end ChangeOrder method
   
   //start RemoveOrder method
   public static int RemoveOrder(int[] arr, int proceed){
    int i, j, order;
    int total = proceed;
    boolean remove = false;
    if (total == 0)
      System.out.println("Sorry the cart is null");
    else {
      System.out.print("Order to be removed ? : ");
      order = sc.nextInt();
      
      for ( i = 0; i < total; i++)
      if (arr[i] == order){
      
      for(j = i; j < proceed-1 ; j++)
           arr[j] = arr[j+1];
         --total;
         remove = true;
     break;
       }
     }
     if (remove == false)
     System.out.println("Sorry the order is not in the cart.");
     
     return total;
     } //end RemoveOrder method
     
     //start DisplayOrder method
     public static void DisplayOrder(int[] arr, int proceed, String[] foodName, double[] price){
     if (proceed == 0)
     
          System.out.println("Sorry the cart is null.");
          
     else
      for (int i = 0 ; i < proceed; i++)

        System.out.printf("\nOrder "+(i+1)+": "+foodName[arr[i]]+" RM%.2f",price[arr[i]]);  
        System.out.println();
        
     } //end DisplayOrder method
    
    //start SearchOrder method
    public static void SearchOrder(int[] arr,int proceed){
    int order;
    boolean search = false;
    
    if (proceed == 0)
      System.out.println("Sorry the cart is null.");
    else {
    
      System.out.print("Search order ?:");
      order = sc.nextInt();
      
    for (int i = 0; i < proceed; i++){
      if (arr[i] == order){
      search = true;
      System.out.println("Your order is at index "+i+" in the cart.");
      break;
     }
    }
    if (search == false)
     System.out.println("Sorry your search order is not in the cart.");
      }    
    } //end SearchOrder method
    
    //start CalculateOrder method
    public static double CalculateOrder(int[] arr , int proceed, double TotalOrder, double[] price){
    
     if (proceed == 0){
          System.out.println("You didn't select any food yet");
          System.out.println("Your cart is null");
          
          }
     else
      for (int i = 0 ; i < proceed ; i++)

        TotalOrder += price[arr[i]];
        return TotalOrder; 
    }//end CalculateOrder method
}
