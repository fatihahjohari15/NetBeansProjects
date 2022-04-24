/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person1;

import java.util.Scanner;

/**
 *
 * @author User-PC
 */
public class TestPerson {
   public static void main(String[] arg){	
	 Scanner read = new Scanner(System.in);
	 String name=null;
         int age = 0;
	 char gender = 0;
         
	 System.out.println("Enter number of person: ");
	 int num = read.nextInt();
         PersonList people = new PersonList(num);
         System.out.println("\n");
     
         for (int i= 0; i< num; i++) {
		System.out.print("\nEnter name = ");
		name = read.next();
		System.out.print("Enter age = ");
		age = read.nextInt();
		System.out.print("Enter gender = ");
		gender = read.next().toCharArray()[0];
		people.addRecord(name,age,gender);
              
            
	}
	
        System.out.println ("Enter rhe  name you want  to search : ");
        name = read.next();
        System.out.println("\n");
        people.searchRecord(name);
        
        System.out.println(" Enter the name you want to Delete : ");
        name = read.next();
        System.out.println("\n");
        people.deleteRecord(name );
       
   }
   


} // end TestPerson