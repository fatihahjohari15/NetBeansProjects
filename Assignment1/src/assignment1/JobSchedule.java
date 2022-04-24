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
public class JobSchedule {
   
    //variable declaration
   Staff staff;
   protected String shiftday1;
   protected String shiftday2;
   protected String shiftday3;
   protected String shiftday4;
   protected String shiftday5;
   protected String shiftday6;
   protected String shiftday7;
   protected int count;
   
   Scanner sc = new Scanner(System.in);

public JobSchedule(Staff staff, int count, String shiftday1, String shiftday2, String shiftday3, String shiftday4, String shiftday5, String shiftday6, String shiftday7){ //constructor
    
    this.staff = staff;
    this.count = count;
    this.shiftday1 = shiftday1;
    this.shiftday2 = shiftday2;
    this.shiftday3 = shiftday3;
    this.shiftday4 = shiftday4;
    this.shiftday5 = shiftday5;      
    this.shiftday6 = shiftday6;
    this.shiftday7 = shiftday7;
}

//start displayShift method
public String displayShift(){
    String a = String.format("\n%s %23s \n", "Day         " ,"Shift      ");
    String b = String.format("\n%s %14s \n", "Monday      " ,shiftday1  );
    String c = String.format("\n%s %14s \n", "Tuesday     " ,shiftday2  );
    String d = String.format("\n%s %14s \n", "Wednesday   " ,shiftday3  );
    String e = String.format("\n%s %14s \n", "Thursday    " ,shiftday4  );
    String f = String.format("\n%s %14s \n", "Friday      " ,shiftday5  );
    String g = String.format("\n%s %14s \n", "Saturday    " ,shiftday6  );
    String h = String.format("\n%s %14s \n", "Sunday      " ,shiftday7  );
    return staff.printStaffDetails() + a + b + c + d +e + f + g + h;
} //end displayShift method

//start addShift method
public void addShift(JobSchedule[] jobs){

          if (count < jobs.length){
                 //prompt user to enter shift for each day from Monday till Sunday
             System.out.print("Enter shift for Monday: ");
             shiftday1 = sc.next() + sc.nextLine();
             System.out.print("Enter shift for Tuesday: ");
             shiftday2 = sc.next() + sc.nextLine();
             System.out.print("Enter shift for Wednesday: ");
             shiftday3 = sc.next() + sc.nextLine();
             System.out.print("Enter shift for Thursday: ");
             shiftday4 = sc.next() + sc.nextLine();
             System.out.print("Enter shift for Friday: ");
             shiftday5 = sc.next() + sc.nextLine();
             System.out.print("Enter shift for Saturday: ");
             shiftday6 = sc.next() + sc.nextLine();
             System.out.print("Enter shift for Sunday: ");
             shiftday7 = sc.next() + sc.nextLine();
             count++;
             }
          else{
               System.out.println("Error. Sorry, list is FULL! cannot add shift!"); //display when list is full
             } 
          
} //end addShift method

//start editShift method
public void editShift(JobSchedule[] jobs){
     String editName;
        boolean edit = false;
        
        if (count == 0){
            System.out.println("The staff list is empty."); //display when list is empty
        }
        
        else{
        //prompt user to enter staff name that they want to edit
        System.out.print("Enter staff name to be edited : ");   
        editName = sc.next() + sc.nextLine();   
        
        for (int i = 0; i < count; i++){
            if (editName.equalsIgnoreCase(jobs[i].staff.getName())){
                 //Enter new name, staff id, duty and shift for Monday till Sunday to be edited
                System.out.print("Enter new name : ");
                String nameEdited = sc.next() + sc.nextLine();
                jobs[i].staff.name = nameEdited;
                System.out.print("Enter new staff ID : ");
                String staffIDEdited = sc.next() + sc.nextLine();
                jobs[i].staff.staffID = staffIDEdited;
                System.out.print("Enter new duty : ");
                String dutyEdited = sc.next() + sc.nextLine();
                jobs[i].staff.duty = dutyEdited;
                System.out.print("Enter a new shift for Monday : ");
                String shiftday1Edited = sc.next() + sc.nextLine();
                jobs[i].shiftday1 = shiftday1Edited;
                System.out.print("Enter a new shift for Tuesday : ");
                String shiftday2Edited = sc.next() + sc.nextLine();
                jobs[i].shiftday2 = shiftday2Edited;    
                System.out.print("Enter a new shift for Wednesday : ");
                String shiftday3Edited = sc.next() + sc.nextLine();
                jobs[i].shiftday3 = shiftday3Edited;
                System.out.print("Enter a new shift for Thursday: ");
                String shiftday4Edited = sc.next() + sc.nextLine();
                jobs[i].shiftday4 = shiftday4Edited;
                System.out.print("Enter a new shift for Friday: ");
                String shiftday5Edited = sc.next() + sc.nextLine();
                jobs[i].shiftday5 = shiftday5Edited;
                System.out.print("Enter a new shift for Saturday : ");
                String shiftday6Edited = sc.next() + sc.nextLine();
                jobs[i].shiftday6 = shiftday6Edited;
                System.out.print("Enter a new shift for Sunday : ");
                String shiftday7Edited = sc.next() + sc.nextLine();
                jobs[i].shiftday7 = shiftday7Edited;    
                edit = true;
                System.out.println(jobs[i].displayShift());
                System.out.println("The data has been edited successfully."); 
            }
        }
        if (edit == false){
            System.out.println("Staff name is not found!"); //display when the name searched to be edited didn't exist
        }
        }
        
    
} //end editShift method
//start deleteShift method
public void deleteShift(JobSchedule[] jobs){
    String nameDeleted;
        boolean delete = false;
        
        if (count == 0){
            System.out.println("The staff list is empty."); //display when list is empty
        }
        
        else{
        //prompt user to enter staff name that they want to delete
        System.out.print("Enter staff name to be deleted : ");    
        nameDeleted = sc.next() + sc.nextLine();
        for (int i = 0; i < count; i++){
            if (nameDeleted.equalsIgnoreCase(jobs[i].staff.getName())){ //compare whether the search name entered to delete is match with the name stored in array
                
        for (int j = i; j < count-1; j++ )
                jobs[j] = jobs[j+1];
                --count;
                 System.out.println("The name and all the data has been deleted successfully."); 
                 delete = true;
            }
        }
        if (delete == false)
                 System.out.println("Staff name is not found!"); //display when the name searched to be deleted didn't exist
        }   
            
} //end deleteShift method
//start searchShift method 
public void searchShift(JobSchedule[] jobs){
 String searchName;
    boolean search = false;
    
    if (count == 0){
         System.out.println("The staff list is empty."); //display when list is empty
    }
    
    else{
    System.out.print("Enter staff name to be search : ");      
    searchName = sc.next() + sc.nextLine(); //prompt user to enter staff name they want to search
     
    for(int i = 0; i < count; i++){
            if (searchName.equalsIgnoreCase(jobs[i].staff.getName())){ //compare searchName with name in the data stored in the array
            search = true;
            System.out.println(jobs[i].displayShift()); //display staff's data that has been searched  
            }
    }
            if (search == false){
              System.out.println("Staff name is not found!"); //display when there are no name stored in the array that matching with the search name
            }  
    }  

} //end searchShift method
   
//start displaySchedule method
public void displaySchedule(JobSchedule[] jobs){
    
     if (count == 0){
             System.out.println("The staff list is empty."); //display when list is empty
        }
        
        else{
        for(int i = 0; i < count; i++)
        {   
             System.out.println(jobs[i].displayShift()); //print all the staff name and their schedule that stored in the array
        } //end for loop
        }

} //end displaySchedule method

} //end class for JobSchedule
