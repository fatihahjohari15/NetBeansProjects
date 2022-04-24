/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentschedule;

import java.util.Scanner;

/**
 *
 * @author User-PC
 */
public class TestJobSchedule {
    public static void main(String[] args){
    
    int numOfStaff;
    int morningStaff;
    int middleStaff;
    int eveningStaff;    
    String name;
    String staffID;
    String duty;  
            
    int opt, proceed = 0;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Number of staff: ");
    numOfStaff = sc.nextInt();
    
    System.out.print("Number of staff in the morning shift: ");
    morningStaff = sc.nextInt();
    System.out.print("Number of staff in the middle shift: ");
    middleStaff = sc.nextInt();
    System.out.print("Number of staff in the evening shift: ");
    eveningStaff = sc.nextInt();
    
    Staff[] stf = new Staff[numOfStaff];
    
    for (int i=0; i< stf.length; i++){ 
          System.out.print("Enter staff name : ");
          name = sc.next();
          System.out.print("Enter staff id : ");
          staffID = sc.next();
          System.out.print("Enter staff duty : ");
          duty = sc.next();
    
        
    Staff staff = new Staff(name, staffID, duty);
    
    stf[i] = staff;
    stf[i].printStaffDetails();
    
    JobSchedule sch = new JobSchedule(staff);

    do{
        System.out.println();
        Option();
        System.out.print("\nYour Option: ");
        opt = sc.nextInt();
        
        switch(opt){
             case 1: 

             process = sch.addShift(); 
             break;
                 
             case 2: 
             sch.editShift(); 
             break;
                 
             case 3: 
             sch.deleteShift(); 
             break;
                 
             case 4: 
             sch.searchShift();
             break;
                 
             case 5: 
             sch.displaySchedule();
             break;
                 
             case 6: 
             System.exit(0);
             break;
                 
             default: 
             System.out.println("INVALID OPTION!"); 
             System.out.println("Please try again"); break;
            }
        
        }while (opt >= 1 && opt <= 6);
        
 }//end for

    }
    
 public static void Option(){
         System.out.println("Option: \n"
                   +"1: Add Shift\n"
                   +"2: Edit Shift\n"
                   +"3: Delete Shift\n"
                   +"4: Search Shift\n"
                   +"5: Display Schedule\n"
                   +"6: Exit");   
        }
        
        public static void shiftTimetable(){
          System.out.println("Shift           Time\n"
                            + "Morning       9AM - 6PM\n"
                            + "Middle       12PM - 8PM\n"
                            + "Evening      2PM - 11PM");
          
        }
        
            
}
    

