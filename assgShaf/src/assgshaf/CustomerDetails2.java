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
public class CustomerDetails2 {
    private String name;
    private String address;
    private int number;
    
    public CustomerDetails2(String name, String address, int number){
       this.name = name;
       this.address = address;
       this.number = number;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setNum(int number){
        this.number = number;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getNum(){
        return number;
    }
    
    @Override
    public String toString() {
        return "CustomerDetails{" + "name=" + name + ", address=" + address + ", number=" + number + '}';
    }
}
