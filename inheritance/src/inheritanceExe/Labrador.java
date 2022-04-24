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
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever. Overrides Dog speak method and includes
// information about avg weight for this breed.
//
// ****************************************************************
public class Labrador extends Dog
{
private String color; //black, yellow, or chocolate?

public Labrador(String name, String color, int breedWeight)
{
    super(name, breedWeight);
    this.color = color;
    
}
// ------------------------------------------------------------
// Big bark -- overrides speak method in Dog
// ------------------------------------------------------------
@Override
public String speak()
{
return "WOOF";
}

}
