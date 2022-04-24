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
public class OrderingDetails2 {
    private int orderSet;
    private int idOrder;
    private int quantity;
    private double distanceArea, charge;
    private double totalPrice;
    
    public OrderingDetails2(int idOrder, int orderSet, int quantity, double distanceArea, double charge,double totalPrice){
        this.idOrder = idOrder;
        this.quantity = quantity;
        this.distanceArea = distanceArea;
        this.orderSet = orderSet;
        this.charge = charge;
        this.totalPrice = totalPrice;
    }
    
    public void setIdOrder(int idOrder){
        this.idOrder = idOrder;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setDistance(double distanceArea){
        this.distanceArea = distanceArea;
    }
    
    public void setOrderSet(int orderSet){
         this.orderSet = orderSet;
    }
    
    public void setCharge(double charge){
        this.charge = charge;
    }
    
            public int getIdOrder(){
                return idOrder;
            }
            public int getQuantity(){
                return quantity;
            }
            public double getDistance(){
                return distanceArea;
            }

            public int getOrderSet(){
                return orderSet;
            }

             public double getCharge(){
               return charge; 
            }
     
                 public double calculatePrice(double unitPrice){
                    switch (orderSet){
                        case 1 :
                        unitPrice = 5.50;
                        totalPrice = quantity * unitPrice;
                         break;
                        case 2 :
                        unitPrice = 6.50;
                        totalPrice = quantity * unitPrice;
                         break;
                        case 3 :
                        unitPrice = 8.50;
                        totalPrice = quantity * unitPrice;
                    }
                    return totalPrice;
                }
                 
                 
                public double calculateTotalServiceCharge(){
                    if(distanceArea < 10){
                        charge = totalPrice * 0.10; 
                     } else if ( distanceArea <= 20) {
                        charge =  totalPrice * 0.20; 
                     }
                    return charge;
                }
                
                public double totalAll(){
                    return totalPrice * charge;
                }
                
    @Override
    public String toString() {
        return "\nId Order = " + idOrder + "\nOrder set = " +orderSet + "\nQuantity = " + quantity + "\nDistance Area = " + distanceArea + "Price = " +totalPrice + "\nService Charge=" + charge + "\nTotal Price = " + totalAll() ;
    }
}
