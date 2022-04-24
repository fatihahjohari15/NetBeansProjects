/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest1;

/**
 *
 * @author User-PC
 */
//Nurul Fatihah Binti Johari (280904)
public class Shoes {
private String brand;
private int size;
private String colour;
private double price;

public Shoes(String brand, int size, String colour, double price){
    this.brand = brand;
    this.size = size;
    this.colour = colour;
    this.price = price;
}

public double getPrice(){
    return price;
}

@Override
public String toString(){
    String s = String.format("%-6s   %-6s   %-6d  %-6.2f", brand, colour, size, price);
    return s;
}

}