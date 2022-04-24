/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author User-PC
 */
//**This is driver class for Staff and JobSchedule classes
//**This program help manager to manage their staff work schedule at the restaurant

public class TestJobSchedule {
        
    static Scanner sc = new Scanner(System.in);
    //creating arrays to store values
    static JobSchedule[] jobs = new JobSchedule[100];
    static Staff staff;
    static JobSchedule js;
    static int count = 0;

    public static void main(String[] args){

        int morningStaff;
        int middleStaff;
        int eveningStaff;
        int opt; 
        
        System.out.print("Number of staff in the morning shift: ");
        morningStaff = sc.nextInt();
        System.out.print("Number of staff in the middle shift: ");
        middleStaff = sc.nextInt();
        System.out.print("Number of staff in the evening shift: ");
        eveningStaff = sc.nextInt();
        
        System.out.println("\nAttention!! Please make sure there are " +morningStaff+ " staff for every morning shift, "+middleStaff+ " staff for middle shift and "+eveningStaff+ " staff for evening shift.");
        System.out.println("Thank you.");
        
        do{ //start do..while looping
        System.out.println();
        Option(); //calling Option method
        System.out.print("\nYour Option: "); //prompt user to enter their option based on option given
        opt = sc.nextInt();
        
        switch(opt){ // start selection
             case 1: 
             if (count < jobs.length){    
             input();
             }else
             {
                  System.out.println("Error. Sorry, list is FULL! cannot add another staff!"); //display when list is full
             }
             js.addShift(jobs);//invoke addShift method from JobSchedule class
             break;
                 
             case 2:   
             js.editShift(jobs);//invoke editShift method from JobSchedule class 
             break;
                 
             case 3:               
             js.deleteShift(jobs); //invoke deleteShift method from JobSchedule class
             break;
                 
             case 4:      
             js.searchShift(jobs);//invoke searchShift method from JobSchedule class
             break;
                 
             case 5:       
             js.displaySchedule(jobs);//invoke displaySchedule method from JobSchedule class
             break;
                 
             case 6: 
             System.out.println("End of job scheduling system.");
             System.out.println("Thank you for trusting us!! :)");
             System.exit(0); //Exit program
             break;
                 
             default: 
             System.out.println("INVALID OPTION!"); 
             System.out.println("Please try again"); 
             System.out.print("Enter any number from 1 - 6 to continue: ");
             opt = sc.nextInt();
             break;
            } //end of selection
        }while (opt >= 1 && opt <= 6); //end for looping
        
        
 } //end main
        //start Option method
        public static void Option(){
         System.out.println("Option: \n"
                   +"1: Add Shift\n"
                   +"2: Edit Shift\n"
                   +"3: Delete Shift\n"
                   +"4: Search Shift\n"
                   +"5: Display Schedule\n"
                   +"6: Exit");   
        } //end Option method
        //start shiftTimetable method
        public static void shiftTimetable(){
          System.out.println();
          System.out.println("Shift           Time\n"
                            + "Morning       9AM - 6PM\n"
                            + "Middle       12PM - 8PM\n"
                            + "Evening      2PM - 11PM");
          
        } //end shiftTimetable method
        
        //start input() method
        public static void input(){
         String name;
         String staffID;
         String duty;
         String shiftday1 = "";
         String shiftday2 = "";
         String shiftday3 = "";
         String shiftday4 = "";
         String shiftday5 = "";
         String shiftday6 = "";
         String shiftday7 = "";
            
            //prompt user to enter staff name, id, duty
             System.out.print("Enter staff name : ");
             name = sc.next() + sc.nextLine();
             System.out.print("Enter staff id : ");
             staffID = sc.next() + sc.nextLine();
             System.out.print("Enter staff duty : ");
             duty = sc.next() + sc.nextLine();
             System.out.println();
             shiftTimetable(); //calling shiftTimetable method
             System.out.println();
             System.out.print("");
//             //prompt user to enter shift for each day from Monday till Sunday
//             System.out.print("Enter shift for Monday: ");
//             shiftday1 = sc.next();
//             System.out.print("Enter shift for Tuesday: ");
//             shiftday2 = sc.next();
//             System.out.print("Enter shift for Wednesday: ");
//             shiftday3 = sc.next();
//             System.out.print("Enter shift for Thursday: ");
//             shiftday4 = sc.next();
//             System.out.print("Enter shift for Friday: ");
//             shiftday5 = sc.next();
//             System.out.print("Enter shift for Saturday: ");
//             shiftday6 = sc.next();
//             System.out.print("Enter shift for Sunday: ");
//             shiftday7 = sc.next();
//             
             staff = new Staff(name, staffID, duty);//create object for class Staff
             js = new JobSchedule(staff, count, shiftday1, shiftday2, shiftday3, shiftday4, shiftday5, shiftday6, shiftday7);//create object for class JobSchedule
             jobs[count] = js; //assign object to array
             count++;
        } //end input() method
        

} //end class TestJobSchedule
