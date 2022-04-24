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
public class Textbook extends Book{
private String authorName;

public Textbook(String title, int numofPages, String authorName){
    super(title, numofPages);
    this.authorName = authorName;
}

public String getAuthorName(){
    return authorName;
}

public void setAuthorName(){
    authorName = authorName;
}
}