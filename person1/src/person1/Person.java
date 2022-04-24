/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person1;

/**
 *
 * @author User-PC
 */
public class Person {

  private String name;
  private int age;
  private char gender;
  
    public Person(String newName, int newAge, char newGender)
    {
        name = newName;
        age = newAge;
        gender = newGender;
            
    }

    public void setName(String newName) {
         name = newName;
        
    }

    public void setAge(int newAge) {
       age = newAge;
        
    }

    public void setGender(char newGender) {
        gender = newGender;
        
    }
    
    public String getName(){
		return name;
	} 
	
	public int getAge()
	{
		return age;
	}
	
	public char getGender()
	{
		return gender;
	}

    
}