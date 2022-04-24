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
// Dog.java
//
// A class that holds a dog's name and can make it speak.
//
// ****************************************************************
public class Dog
{
protected String name;
private int breedWeight;

// ------------------------------------------------------------
// Constructor -- store name
// ------------------------------------------------------------
public Dog(String name, int breedWeight)
{
this.name = name;
this.breedWeight = breedWeight;
}
// ------------------------------------------------------------
// Returns the dog's name
// ------------------------------------------------------------
public String getName()
{
return name;
}
// ------------------------------------------------------------
// Returns a string with the dog's comments
// ------------------------------------------------------------

public int getAvgBreedWeight(){
return breedWeight;
}
public String speak()
{
return "Woof";
}
}

