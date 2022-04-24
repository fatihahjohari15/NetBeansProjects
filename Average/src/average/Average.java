/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

/**
 *
 * @author User-PC
 */
class Average{
	public static void main(String[] args){
        System.out.println("First average: "+average(4,8));
	System.out.println("Second average: "+average(4,8,12));
	System.out.println("Third average: "+average(4,8,12,16));
       }
 public static int average(int int1, int int2)
     {
       return (int1+int2)/2;
     }
public static int average ( int int1, int int2 , int int3 )
{
	return ( int1+int2+int3)/3;
}
	
public static int average(int int1, int int2,int int3, int int4)
     {
       return (int1+int2+int3+int4)/4;
     }

}//end class


