/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgshaf;

/**
 *
 * @author User-PC
 */
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ListOrder {
    
    private ArrayList<CustomerDetails2> cust = new ArrayList<CustomerDetails2>();
    private ArrayList<OrderingDetails2> list = new ArrayList<OrderingDetails2>();

    public ListOrder() {
    }

    public ListOrder(ArrayList<CustomerDetails2> cust, ArrayList<OrderingDetails2> list, int orderRemove) {
        this.cust = cust;
        this.list = list;

    }

    public ArrayList<OrderingDetails2> getDetailsOrder() {
        return list;
    }

    public ArrayList<CustomerDetails2> getDetailsCust() {
        return cust;
    }

    public void setDetailsOrder(ArrayList<OrderingDetails2> list) {
        this.list = list;
    }

    public void setDetailsCust(ArrayList<CustomerDetails2> cust) {
        this.cust = cust;
    }

    public void displayCustomer(CustomerDetails2 customer) {
        System.out.println("-------CUSTOMER DETAILS-------");
        System.out.println(customer.toString());
    }

    public void displayOrder() {
        System.out.println("-------YOUR ORDER LIST-------");

    }

}