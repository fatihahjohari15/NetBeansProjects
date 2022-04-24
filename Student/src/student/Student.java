/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
/**
 *
 * @author User-PC
 */
public class Student {
      
    private String matricNo;
    private double test1;
    private double test2;
    private double averageMark;

    public Student(String matric, double ts1, double ts2){
        
        matricNo = matric;
        test1 = ts1;
        test2 = ts2;
        
    }
    
    public String getStudentInfo(){
           
    return  "    "+matricNo +" 		     "+averageMark;
    
    }
    
    public void calculateAverage(){
        
        averageMark = (test1 + test2)/2;
    }
}
