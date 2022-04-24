/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgZah;

/**
 *
 * @author User-PC
 */
public class GenshinImpact 
{
    protected String quest;
    private int goldfee;  
    
    
    public GenshinImpact ( String newQuest, int newGoldFee )
    {
         quest = newQuest;
        goldfee = newGoldFee;
    }
    
   public void setQuest(String newQuest)
   {
       quest = newQuest;
   }
   
   public void setGoldFee (int newGoldFee)
   {
       goldfee = newGoldFee;
       
   }
    
   public String getQuest(){
                 return quest;
   }
   
   public int getGoldFee(){
              return goldfee;
   }
    
}
