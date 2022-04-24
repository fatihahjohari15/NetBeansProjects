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
import java.util.Scanner;

class PersonList{
	private Person [] person;
	private int counter;
        
        Scanner read = new Scanner (System.in);

	public PersonList(int size){
		person = new Person[size];
		counter = 0;
	}
	public void addRecord(String name, int age, char gender) {
		person[counter] = new Person(name,age,gender);
		counter++;
	}

    
    public void searchRecord( String name)
    {
        
    int i = 0;
    
    while (person [i] != null && ! person[i].getName().equals(name)){
        i++;
    }
    
    if ( person [i] == null)
    
    {
        System.out.println(name + "no  name  in array");
    }else 
    {
        System.out.println(name + " at index "+i);
    }    
                    
     }
      
    public void deleteRecord(String name)
    {
       
       int i = 0;
    
    while (person [i] != null && ! person[i].getName().equals(name)){
        i++;
    }
    
    if ( person [i] == null)
    
    {
        System.out.println(name + "no name data  in array");
    }else 
    {
        System.out.println("DAta has been Deleted");
    }    
         
   }//method deleteData
            

                 
        
    
    public void displayRecord()
        {
            for (int i= 0; i< counter; i++){
	  System.out.println("\nName ="+person[i].getName());
	  System.out.println("Age = "+person[i].getAge());
	  System.out.println("Gender = "+person[i].getGender());
            }
        }
	
       
    }