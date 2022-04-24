/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe2task1;

/**
 *
 * @author User-PC
 */
public class TestChild {
    public static void main(String args[]){
        
    Parent p1 = new Parent();
    Parent p2 = new Parent(6);
    Child c = new Child();
    c.methodX();
    
    Parent p3 = new Child();
//    p1.pq = 9;
//    p2.xy = 8;
    
    p3.methodX();
//    p2 = c;
    
//    Child c1 = (Child)p3;
//    p2.methodX();
//    c.ab = true;
    }
}
