/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatastructure;

/**
 *
 * @author User-PC
 */
public class Node {
    Student std;
    Book book;
    Node next;

    public Node(Student std, Book book, Node next) {
        this.std = std;
        this.book = book;
        this.next = next;
    }

    public Node(Student std, Book book) {
        this.std = std;
        this.book = book;
        this.next = null;
    }  
}
