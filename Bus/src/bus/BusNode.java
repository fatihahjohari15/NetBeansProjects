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
public class BusNode {
        Bus info;
        BusNode next;

    public BusNode(Bus info, BusNode next) {
        this.info = info;
        this.next = next;
    }
    public BusNode(Bus info) {
        this.info = info;
        this.next = null;
    }
}
