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
public class Book {
    protected Student s;
    protected String bookTitleb1;
    protected String bookTitleb2;
    protected String bookTitleb3;
    protected String borrowDateb1;
    protected String borrowDateb2;
    protected String borrowDateb3;
    protected String returnDateb1;
    protected String returnDateb2;
    protected String returnDateb3;

    public Book(Student s, String bookTitleb1, String bookTitleb2, String bookTitleb3, String borrowDateb1, String borrowDateb2, String borrowDateb3, String returnDateb1, String returnDateb2, String returnDateb3) {
        this.s = s;
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

    public Student getS() {
        return s;
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

    @Override
    public String toString(){
        String bookInfo = String.format("%-20s%-20s%-20s", "BOOK TITLE", "BORROW DATE", "RETURN DATE\n");
        String a = String.format("%-20s%-20s%-20s\n", bookTitleb1, bookTitleb2, bookTitleb3);
        String b = String.format("%-20s%-20s%-20s\n", borrowDateb1, borrowDateb2, borrowDateb3);
        String c = String.format("%-20s%-20s%-20s\n", returnDateb1, returnDateb2, returnDateb3);
        String allDetails = s.toString() + bookInfo + a + b + c;
        return allDetails;
    }
}