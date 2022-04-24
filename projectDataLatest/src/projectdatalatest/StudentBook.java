/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatalatest;

/**
 *
 * @author User-PC
 */
public class StudentBook {
protected String name;
protected String id;
protected String bookTitleb1;
protected String bookTitleb2;
protected String bookTitleb3;
protected String borrowDateb1;
protected String borrowDateb2;
protected String borrowDateb3;
protected String returnDateb1;
protected String returnDateb2;
protected String returnDateb3;

public StudentBook(){
    name = null;
    id = null;
    bookTitleb1 = null;
    bookTitleb2 = null;
    bookTitleb3 = null;
    borrowDateb1 = null;
    borrowDateb2 = null;
    borrowDateb3 = null;
    returnDateb1 = null;
    returnDateb2 = null;
    returnDateb3 = null;
}

    public StudentBook(String name, String id, String bookTitleb1, String bookTitleb2, String bookTitleb3, String borrowDateb1, String borrowDateb2, String borrowDateb3, String returnDateb1, String returnDateb2, String returnDateb3) {
        this.name = name;
        this.id = id;
        this.bookTitleb1 = bookTitleb1;
        this.bookTitleb2 = bookTitleb2;
        this.bookTitleb3 = bookTitleb3;
        this.borrowDateb1 = borrowDateb1;
        this.borrowDateb2 = borrowDateb2;
        this.borrowDateb3 = borrowDateb3;
        this.returnDateb1 = returnDateb1;
        this.returnDateb2 = returnDateb2;
        this.returnDateb3 = returnDateb3;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getBookTitleb1() {
        return bookTitleb1;
    }

    public String getBookTitleb2() {
        return bookTitleb2;
    }

    public String getBookTitleb3() {
        return bookTitleb3;
    }

    public String getBorrowDateb1() {
        return borrowDateb1;
    }

    public String getBorrowDateb2() {
        return borrowDateb2;
    }

    public String getBorrowDateb3() {
        return borrowDateb3;
    }

    public String getReturnDateb1() {
        return returnDateb1;
    }

    public String getReturnDateb2() {
        return returnDateb2;
    }

    public String getReturnDateb3() {
        return returnDateb3;
    }

    public String displayAll(){
        String bookInfo = String.format("%-20s%-20s%-20s", "BOOK TITLE", "BORROW DATE", "RETURN DATE\n");
        String a = String.format("%-20s%-20s%-20s\n", bookTitleb1, bookTitleb2, bookTitleb3);
        String b = String.format("%-20s%-20s%-20s\n", borrowDateb1, borrowDateb2, borrowDateb3);
        String c = String.format("%-20s%-20s%-20s\n", returnDateb1, returnDateb2, returnDateb3);
 
        return "\nName: "+name+ "\nStudent ID: " +id+ "\n\n" + bookInfo + a + b + c;
    }
}
