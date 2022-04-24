/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceExe;

/**
 *
 * @author User-PC
 */
// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest
{
public static void main(String[] args)
{
Dog dog = new Dog("Spike", 80);
Labrador labrador = new Labrador("Bob", "Black", 75);
Yorkshire yorkshire = new Yorkshire("Teddy", 3);

System.out.println(dog.getName() + " says " + dog.speak());
System.out.println(labrador.getName() + " says " + labrador.speak());
System.out.println(yorkshire.getName() + " says " + yorkshire.speak());


System.out.println(labrador.getName() + " average breed weight is " +labrador.getAvgBreedWeight());
System.out.println(yorkshire.getName() + " average breed weight is " +yorkshire.getAvgBreedWeight());
}
}

