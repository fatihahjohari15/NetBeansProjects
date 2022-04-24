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
public class Bus {
    public String bcode;
    public String bus_name ;
    public int num_seat; 
    public int seat_booked ;
    public double depart_time ;
    public double arrival_time ;

    public Bus() {
    }

    public Bus(String bcode, String bus_name, int num_seat, int seat_booked, double depart_time, double arrival_time) {
        this.bcode = bcode;
        this.bus_name = bus_name;
        this.num_seat = num_seat;
        this.seat_booked = seat_booked;
        this.depart_time = depart_time;
        this.arrival_time = arrival_time;
    }

     @Override
    public String toString() {
        return String.format("%-10s | %-20s | %-10d | %-10d | %-10.1f | %-10.1f",
                bcode,bus_name,num_seat,seat_booked,depart_time,arrival_time); 
    }
}
