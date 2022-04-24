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
public class Book {
private String title;
private int numofPages;

public Book(String title, int numofPages){
    this.title = title;
    this.numofPages = numofPages;
}

public String getTitle(){
    return title;
}

public int getnumofPages(){
    return numofPages;
}

public void set(){
    title = title;
    numofPages = numofPages;
}
}
