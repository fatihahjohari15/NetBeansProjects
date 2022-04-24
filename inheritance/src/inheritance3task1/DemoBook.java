/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance3task1;

/**
 *
 * @author User-PC
 */
public class DemoBook {
   public static void main(String[] args){
    
   Book book = new Book("Life Without Limits", 288);
   Textbook textbook = new Textbook("Programming", 672, "Poornachandra Sarang");
   
   
   System.out.println("Book Title: "+book.getTitle()+", Number of Pages: "+book.getnumofPages());
   System.out.println("Textbook Title: "+textbook.getTitle()+ ", Number of Pages: "+textbook.getnumofPages()+", Textbook Name Author: "+textbook.getAuthorName());
    
       
} 
}
