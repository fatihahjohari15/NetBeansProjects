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
import java.util.Scanner;

public class QuestBoard {
    private GenshinImpact genshinimpact;
    private int counter;
    
    Scanner sc = new Scanner (System.in);
    
    public QuestBoard(GenshinImpact[] arr){
        
    }
    
    public void addQuest(GenshinImpact genshinimpact){

         genshinimpact.getQuest();
         genshinimpact.getGoldFee();   

    }
    
    public void searchQuest (GenshinImpact[] arr, String quest, int process){
      String searchQuest;
    
      if (process == 0)
      System.out.println("Sorry the quest list is empty");
      
      
      else{ 
      
      System.out.print("Enter quest task to search: ");
      searchQuest = sc.next();

      if (searchQuest.equalsIgnoreCase(quest)){
      System.out.println(searchQuest+ " is at index "+process+" in the list");
      }
      else
         System.out.println("Sorry your search quest is not found");  

      
  
      }

    }
}