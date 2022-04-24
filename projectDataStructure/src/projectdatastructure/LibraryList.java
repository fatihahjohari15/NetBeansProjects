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
public class LibraryList {
    Node head, tail;
    
    public LibraryList() {
        head = tail = null;
    }

     public boolean isEmpty() {
        return (head == null);
    }

    public boolean Exist(String name) {
        Node p = head;
        while (p != null) {
            if (name.equalsIgnoreCase(p.std.name)) {
                return true;
            }
            p = p.next;
        }
        return false;
    }

    public void addLast(Student x, Book y) {
        Node q = new Node(x, y);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        if (Exist(q.std.name)) {
            System.out.println("Student " + q.std.name + " already exists!");
            return;
        } else {
            tail.next = q;
            tail = q;
        }
    }

    public void addFirst(Student x, Book y) {
       Node q = new Node(x,y);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        if (Exist(q.std.name)) {
            System.out.println("Student " + q.std.name + " already exists!");
            return;
        } else {
            q.next = head;
            head = q;
        }
    }

    public String displayData() {
        Node p = head;
        String s = "";
        while (p != null) {
            s = p.book.toString();
            p = p.next;
            
        }
        return s;
    }

    public Node searchByName(String searchName) {
        if (isEmpty()) {
            System.out.println("Error! This list is empty");
        } else {
            Node p = head;
            System.out.printf("%-10s | %-20s |   %-10s |   %-10s |   %-10s | %-10s", "Code", "Bus Name",
                    "Number of seat", "Num Booked", "Depart Time", "Arrival Time");
            System.out.println("\n================================================="
                    + "========================================================================");
            while (p != null) {
                if (p.std.name.equalsIgnoreCase(searchName)) {
                    System.out.println(p.book);
                    return (p);
                }
                p = p.next;
            }
        }
        return null;
    }

    public void deleteByName(String nameDelete) {
        Node tmpNode = head;
        Node prevNode = null;
        while (tmpNode != null) {
            if (tmpNode.std.name.equalsIgnoreCase(nameDelete)) {
                if (tmpNode == head) {
                    head = head.next; 
                } else { // fixed indenting/newline
                    prevNode.next = tmpNode.next;
                }
            } else {
                // only advance the prevNode when there's no match.
                prevNode = tmpNode;
            }
            tmpNode = tmpNode.next;
        }
    }
    
    public void updateByName(String nameUpdate){
        

    
  }
}
