/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author User-PC
 */
public class TestStudent {
    public static void main(String[] args) {
     
        String matricNo;
        double test1;
        double test2;
        Student [] std = new Student [3];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i< std.length; i++){
           System.out.print("Matric No:");
           matricNo = sc.next();
    
           System.out.print("Test 1:");
            test1 = sc.nextDouble();
    
            System.out.print("Test 2:");
            test2 = sc.nextDouble();
        
           Student stud = new Student(matricNo, test1, test2);//create object
           std[i]=stud;//assign object to array
           std[i].calculateAverage();
  }//end for 
//output
  System.out.println("*****************************\n" +
                           "      STUDENT INFORMATION\n" +
                           " *****************************\n" +
                           " Matric No 		AverageMark");
        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i].getStudentInfo());
        
    }

    }//end main
}//end class
