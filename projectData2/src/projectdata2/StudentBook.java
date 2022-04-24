package projectdata2;

/**
 *
 * @author User-PC
 */
public class StudentBook {
private String name;
private String id;
private String bookTitleb1;
private String borrowDateb1;
private String returnDateb1;
private String bookTitleb2;
private String borrowDateb2;
private String returnDateb2;
private String bookTitleb3;
private String borrowDateb3;
private String returnDateb3;

    public StudentBook(String name, String id, String bookTitleb1, String borrowDateb1, String returnDateb1, String bookTitleb2, String borrowDateb2, String returnDateb2, String bookTitleb3, String borrowDateb3, String returnDateb3) {
        
        this.name = name;
        this.id = id;
        this.bookTitleb1 = bookTitleb1;
        this.borrowDateb1 = borrowDateb1;
        this.returnDateb1 = returnDateb1;
        this.bookTitleb2 = bookTitleb2;
        this.borrowDateb2 = borrowDateb2;
        this.returnDateb2 = returnDateb2;
        this.bookTitleb3 = bookTitleb3;
        this.borrowDateb3 = borrowDateb3;
        this.returnDateb3 = returnDateb3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookTitleb1() {
        return bookTitleb1;
    }

    public void setBookTitleb1(String bookTitleb1) {
        this.bookTitleb1 = bookTitleb1;
    }

    public String getBorrowDateb1() {
        return borrowDateb1;
    }

    public void setBorrowDateb1(String borrowDateb1) {
        this.borrowDateb1 = borrowDateb1;
    }

    public String getReturnDateb1() {
        return returnDateb1;
    }

    public void setReturnDateb1(String returnDateb1) {
        this.returnDateb1 = returnDateb1;
    }

    public String getBookTitleb2() {
        return bookTitleb2;
    }

    public void setBookTitleb2(String bookTitleb2) {
        this.bookTitleb2 = bookTitleb2;
    }

    public String getBorrowDateb2() {
        return borrowDateb2;
    }

    public void setBorrowDateb2(String borrowDateb2) {
        this.borrowDateb2 = borrowDateb2;
    }

    public String getReturnDateb2() {
        return returnDateb2;
    }

    public void setReturnDateb2(String returnDateb2) {
        this.returnDateb2 = returnDateb2;
    }

    public String getBookTitleb3() {
        return bookTitleb3;
    }

    public void setBookTitleb3(String bookTitleb3) {
        this.bookTitleb3 = bookTitleb3;
    }

    public String getBorrowDateb3() {
        return borrowDateb3;
    }

    public void setBorrowDateb3(String borrowDateb3) {
        this.borrowDateb3 = borrowDateb3;
    }

    public String getReturnDateb3() {
        return returnDateb3;
    }

    public void setReturnDateb3(String returnDateb3) {
        this.returnDateb3 = returnDateb3;
    }

@Override
    public String toString(){
        String bookInfo = String.format("%-20s%-20s%-20s\n", "BOOK TITLE", "BORROW DATE", "RETURN DATE\n");
        String a = String.format("   "+"%-26s%-25s%-20s\n\n", bookTitleb1, borrowDateb1, returnDateb1);
        String b = String.format("   "+"%-26s%-25s%-20s\n\n", bookTitleb2, borrowDateb2, returnDateb2);
        String c = String.format("   "+"%-26s%-25s%-20s\n\n", bookTitleb3, borrowDateb3, returnDateb3);
        String d = a + b + c;
 
        return "\nName: "+name+ "\nStudent ID: " +id+ "\n\n" + bookInfo + d;
    }
}