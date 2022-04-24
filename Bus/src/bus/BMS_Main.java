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
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class BMS_Main {

    public static void main(String[] args) {
        int choice;
        String b, t;
        double m, n, p;
        int q, l, k;
        Bus bk;
        Scanner s = new Scanner(System.in);
        BusList d = new BusList();
        try {
            while (true) {
                System.out.println();
                System.out.println("1.      Load data from file\n"
                        + "2.      Input & add to the head\n"
                        + "3.      Display data\n"
                        + "4.      Save bus list to file\n"
                        + "5.      Search by bcode\n"
                        + "6.      Delete by bcode\n"
                        + "7.      Sort by bcode\n"
                        + "8.      Add before position  k\n"
                        + "9.      Delete the node before the node having bcode = xCode\n");
                System.out.println(" Your selection (1 -> 9):");
                choice = Integer.parseInt(s.nextLine());
                if (choice == 0) {
                    break;
                }
                switch (choice) {
                    case 1:
                        d.loadData();
                        break;
                    case 2:
                        System.out.print("Enter Bus code: ");
                        b = s.nextLine();
                        System.out.print("Enter Bus name: ");
                        t = s.nextLine();
                        System.out.print("Enter number of seats: ");
                        q = Integer.parseInt(s.nextLine());
                        System.out.print("Enter number of  booked seats : ");
                        l = Integer.parseInt(s.nextLine());
                        System.out.print("Enter departed time: ");
                        m = Double.parseDouble(s.nextLine());
                        System.out.print("Enter arrival time: ");
                        p = Double.parseDouble(s.nextLine());
                        if (l > q) {
                            System.out.println("UNSUCCESSFUL");
                            System.out.println("Number of seat booked cannot be bigger than number of seats.");
                        } else {
                            bk = new Bus(b, t, q, l, m, p);
                            d.addFirst(bk);
                        }


                        break;
                    case 3:
                        d.displayData();
                        break;
                    case 4:
                        System.out.print("Enter File Name : ");
                        String fname = new Scanner(System.in).nextLine();
                        d.saveToFile(fname);
                        break;
                    case 5:
                        System.out.print("Enter Bus code to be searched: ");
                        b = s.nextLine();
                        d.searchByCode(b);
                        break;
                    case 6:
                        System.out.print("Enter Bus code to be deleted: ");
                        b = s.nextLine();
                        d.deleteByCode(b);
                        break;
                    case 7:
                        d.sortByCode();
                        d.displayData();
                        break;
                    case 8:
                        int num;
                        System.out.println("Enter position");
                        num = Integer.parseInt(s.nextLine());

                        System.out.print("Enter Bus code: ");
                        b = s.nextLine();
                        System.out.print("Enter Bus name: ");
                        t = s.nextLine();
                        System.out.print("Enter number of seats: ");
                        q = Integer.parseInt(s.nextLine());
                        System.out.print("Enter number of  booked seats : ");
                        l = Integer.parseInt(s.nextLine());
                        System.out.print("Enter departed time: ");
                        m = Double.parseDouble(s.nextLine());
                        System.out.print("Enter arrival time: ");
                        p = Double.parseDouble(s.nextLine());
                        if (l > q) {
                            System.out.println("UNSUCCESSFUL");
                            System.out.println("Number of seat booked cannot be bigger than number of seats.");
                        } else {
                            bk = new Bus(b, t, q, l, m, p);
                            d.addBeforePosK(num, bk);
                        }


                        break;

                    case 9:
                        System.out.println("Delete the node before the node having bcode : ");
                        String cd = s.nextLine();
                        d.deleteBeforeB_code(cd);
                        break;
                    default:
                        System.out.println("Wrong selection try again");
                }
            }
        } catch (Exception e) {
            System.out.println("Wrong Selection or Input: " + e.toString());
        }
    }
}
