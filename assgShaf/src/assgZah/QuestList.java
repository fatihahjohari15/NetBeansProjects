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

public class QuestList 
{
    static Scanner sc = new Scanner (System.in);
    public static void main (String []arg)
    {
        
        GenshinImpact[] arr = new GenshinImpact[100];
        String quest = null;
        int goldfee = 0;
        int opt;
        int process = 0;
        
        do{
        System.out.println();
        Option();   
        System.out.print("\nYour Option: "); 
        opt = sc.nextInt();
        
        if (opt == 3){
         System.out.println("Goodbye");
         System.exit(0);   
        }
        
        else{
         process = processSystem(arr, opt, process, quest, goldfee);   
        }
        }while (opt != 7);
        System.out.println("Goodbye");
        System.exit(0);  
        

    }
       public static void Option(){
       System.out.println("Option: \n"
                   +"1: Add Quest\n"
                   +"2: Search Quest\n"
                   +"3: Exit");
                   
   }
       
       public static int processSystem(GenshinImpact[] arr, int opt, int process, String quest, int goldfee){
       QuestBoard task;
           
        switch(opt){ 
             case 1: 
                 
             System.out.print("\nEnter Quest name = ");
             quest = sc.next()+ sc.nextLine();
             System.out.print("\nEnter Quest goldfee = ");
             goldfee = sc.nextInt();    
             
             GenshinImpact genshinimpact = new GenshinImpact(quest,goldfee);

             arr[process] = genshinimpact;
             task = new QuestBoard(arr);
             task.addQuest(genshinimpact);
             process++;
             
             break;
            
             case 2:   
             task = new QuestBoard(arr);    
             task.searchQuest(arr, quest, process);

             break;
                 
             case 3: 
             System.out.println("End of this program");
             System.exit(0); 
             break;    
            }
           return process;
       }
}