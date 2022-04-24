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
// *****************************************************************
// Yorkshire.java
//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//
// *****************************************************************
public class Yorkshire extends Dog
{
  
public Yorkshire(String name, int breedWeight)
{
super(name, breedWeight);
}
// -------------------------------------------------------------
// Small bark -- overrides speak method in Dog
// -------------------------------------------------------------

    /**
     *
     * @return
     */
    @Override
public String speak()
{
return "woof";
}
}

