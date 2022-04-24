/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

/**
 *
 * @author User-PC
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BusList {

    BusNode head, tail;

    public BusList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public boolean Exist(String bcode) {
        BusNode p = head;
        while (p != null) {
            if (bcode.equalsIgnoreCase(p.info.bcode)) {
                return true;
            }
            p = p.next;
        }
        return false;
    }

    public void addLast(Bus x) {
        BusNode q = new BusNode(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        if (Exist(q.info.bcode)) {
            System.out.println("Bcode " + q.info.bcode + " already exists!");
            return;
        } else {
            tail.next = q;
            tail = q;
        }
    }

    public void addFirst(StudentBook sBook) {
        Node newNode = new Node(sBook);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        if (Exist(q.info.bcode)) {
            System.out.println("Bcode " + q.info.bcode + " already exists!");
            return;
        } else {
            q.next = head;
            head = q;
        }
    }

    public void displayData() {
        System.out.printf("%-10s | %-20s |   %-10s |   %-10s |   %-10s | %-10s", "Code", "Bus Name",
                "Number of seat", "Num Booked", "Depart Time", "Arrival Time");
        System.out.println("\n================================================="
                + "=====================================================================");
        BusNode p = head;
        while (p != null) {
            System.out.println(p.info);
            p = p.next;
        }
    }

    public BusNode searchByCode(String x) {
        if (isEmpty()) {
            System.out.println("Error! This list is empty");
        } else {
            BusNode p = head;
            System.out.printf("%-10s | %-20s |   %-10s |   %-10s |   %-10s | %-10s", "Code", "Bus Name",
                    "Number of seat", "Num Booked", "Depart Time", "Arrival Time");
            System.out.println("\n================================================="
                    + "========================================================================");
            while (p != null) {
                if (p.info.bcode.equalsIgnoreCase(x)) {
                    System.out.println(p.info);
                    return (p);
                }
                p = p.next;
            }
        }
        return null;
    }

    public void deleteByCode(String x) {
        BusNode tmpNode = head;
        BusNode prevNode = null;
        while (tmpNode != null) {
            if (tmpNode.info.bcode.equalsIgnoreCase(x)) {
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

    public void sortByCode() {
        BusNode pi, pj;
        Bus x;
        pi = head;
        while (pi != null) {
            pj = pi.next;
            while (pj != null) {
                if (pj.info.bcode.compareToIgnoreCase(pi.info.bcode) < 0) {
                    x = pi.info;
                    pi.info = pj.info;
                    pj.info = x;
                }
                pj = pj.next;
            }
            pi = pi.next;
        }
    }

    public void addBeforePosK(int k, Bus x) {
        int i = 0;
        BusNode q = new BusNode(x);
        BusNode p = head;
        if (isEmpty()) {
            System.out.println("Error! This list is empty");
        }
        if (Exist(q.info.bcode)) {
            System.out.println("Bcode " + q.info.bcode + " already exists!");
            return;
        } else {
            while (p != null) {
                i++;
                p = p.next;
                if (i == k - 1) {
                    q.next = p.next;
                    p.next = q;
                }
            }
            return;
        }
    }

    public void deleteBeforeB_code(String code) {
        BusNode tmpNode = head;
        BusNode prevNode = null;

        while (tmpNode != null) {
            if (tmpNode.info.bcode.equalsIgnoreCase(code)) {
                if (tmpNode == head) {
                    System.out.println("This the first node, there is no node before it.");
                } else {
                    prevNode = tmpNode ;
                   // prevNode.next = prevNode;

                }
            } else {
                prevNode = tmpNode;
            }
            tmpNode = tmpNode.next;
        }

    }

       public void loadData() throws FileNotFoundException, IOException{
        System.out.print("Enter Filename : ");
        String filename = new Scanner(System.in).nextLine();
        RandomAccessFile raf = new RandomAccessFile(filename, "rw") ;
        String data = "";
         System.out.printf("%-10s | %-20s |%-10s |%-10s |%-10s | %-10s", "Code", "Bus Name", "Number of seat", "Num Booked", "Depart Time", "Arrival Time");
        System.out.println("\n================================================="
                + "=====================================================================");
        while ((data = raf.readLine()) != null)
        {
            System.out.println(data);
            try {
                    StringTokenizer st = new StringTokenizer(data,"|") ;
                    String bcode = st.nextToken().trim() ;
                    String bus_name = st.nextToken().trim() ;
                    String num_seat = st.nextToken();
                    String seat_booked = st.nextToken() ;
                    String depart_time = st.nextToken() ;
                    String arrival_time = st.nextToken() ;


                    Append(bcode, bus_name, num_seat, seat_booked, depart_time,arrival_time);
            } catch (Exception e) {
            }
        }
    }
    private void Append(String bcode, String bus_name,String num_seat, String seat_booked,String depart_time,String arrival_time){
        int q = Integer.parseInt(num_seat.trim()) ;
        int l = Integer.parseInt(seat_booked.trim()) ;
        double p = Double.parseDouble(depart_time.trim()) ;
        double y = Double.parseDouble(arrival_time.trim()) ;
        Bus bus = new Bus(bcode.trim(), bus_name.trim(), q, l, p,y);
        addFirst(bus);
    }

     public void saveToFile(String fname) throws Exception{
        File f = new File(fname);
        if(f.exists()) f.delete();
        RandomAccessFile g = new RandomAccessFile(fname,"rw");
        BusNode p = head;
        while(p!=null)
        {
            g.writeBytes(p.info.bcode + " | " + p.info.bus_name + " | " + p.info.num_seat +" | " + p.info.seat_booked + 
                    " | "+ p.info.depart_time + " | " + p.info.arrival_time + "\r\n");
            p=p.next;
        }
       g.close();
    }

}
