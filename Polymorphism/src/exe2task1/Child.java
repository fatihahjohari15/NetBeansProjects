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
public class Child extends Parent {
    boolean ab;
    
Child(){
    ab = true;
}
    @Override
    public void methodX(){
    super.methodX();
    System.out.println("In Child: methodX()");
    xy = 5;
    }
    public void methodY(boolean b){
        ab = b;
    }
    
    public void methodZ(){
        System.out.println(ab);
    }
}
