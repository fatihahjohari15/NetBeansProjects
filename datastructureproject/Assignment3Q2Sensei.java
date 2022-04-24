import java.util.Scanner;
   public class Assignment3Q2Sensei
   {
      public static void main(String[]args) //main method
      {
          int income;
          int time;
          double consult_time;
          double hours_rate;
          double service_charge;
          double total_charge;
          Scanner sc = new Scanner(System.in);
          boolean resp = true;
          String answer;
      
          System.out.print("****A&N FIRM SERVICES****");
      
          while (resp == true)
          {
              double bills;
              
              System.out.print("\n");
              System.out.print("Enter your income: RM ");
              income = sc.nextInt();
              System.out.print("Enter consulting time (minutes): ");
              consult_time = sc.nextDouble();
              System.out.print("Enter hourly rate: " );
              hours_rate = sc.nextDouble();
              resp = true;
                  
              bills = billing(income, consult_time, hours_rate);
              
              System.out.print("\n");
              System.out.printf("Total service charge is RM %.2f ",bills);    

              System.out.print("\n\n");
              System.out.print("Do you have any tax service to process? (Y/N) : ");
              answer = sc.next();

              if (answer.equalsIgnoreCase("Y"))
              {
               resp = true;
              }
              
              else if(answer.equalsIgnoreCase("N")) 
              {
               resp = false;
              }   
              
      
          } // end while
      
          System.out.print("\n");
          System.out.print("**THANK YOU FOR USING OUR SERIVES**");
            
        
      } // end main method
      
      
      public static double billing(int income, double consult_time, double hours_rate) // method header
      {
      
          double total_charge = 0; 
          int hours;
      
          if (income <= 25000)
          {  
              if (consult_time <= 30)
                System.out.print("No service charges!");
              else
                consult_time = (consult_time - 30)/60 * hours_rate;
                hours = 30;            
                total_charge = consult_time * 0.40;        
          }
          if (income > 25000)
          {  
              if (consult_time <= 20)
                System.out.print("No service charges!");
              else
                consult_time = (consult_time - 20)/60 * hours_rate;
                hours = 20;            
                total_charge = consult_time * 0.70;                                
          }
          return total_charge;
      } // end method header
      
   } // end class