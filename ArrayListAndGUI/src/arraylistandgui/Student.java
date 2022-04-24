/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistandgui;

/**
 *
 * @author User-PC
 */
public class Student {
String name;
String matricNo;
String semester;
double carryMarks;
double finalExam;
double totalMarks;
String grade;

public Student(String name, String matricNo, String semester, double carryMarks, double finalExam, String grade){
   this.name = name;
   this.matricNo = matricNo;
   this.semester = semester;
   this.carryMarks = carryMarks;
   this.finalExam = finalExam;
   this.grade = grade;
  
}

public String getName(){
    return name;
}

public String getSemester(){
    return semester;
}

public String getMatricNo(){
    return matricNo;
}

public double getTotalMarks(){
    return totalMarks;
}

public double getCarryMarks(){
    return carryMarks;
}

public double getFinalExam(){
    return finalExam;
}

public void computeGrade(){
    
     totalMarks = carryMarks + finalExam;

        if (totalMarks >= 90){
            grade = "A+";
        }
        else if (totalMarks >= 80 && totalMarks <= 89){
            grade = "A";
        }
        else if (totalMarks >= 70 && totalMarks <= 79){
            grade = "A-";
        }
        else if (totalMarks >= 66 && totalMarks <= 69){
            grade = "B+";
        }
         else if (totalMarks >= 60 && totalMarks <= 65){
            grade = "B";
        }
        else if (totalMarks >= 56 && totalMarks <= 59){
            grade = "B-";
        }
         else if (totalMarks >= 50 && totalMarks <= 55){
            grade = "C+";
        }
        else if (totalMarks >= 46 && totalMarks <= 49){
            grade = "C";
        }
         else if (totalMarks >= 40 && totalMarks <= 45){
            grade = "D+";
        }
        else if (totalMarks >= 35 && totalMarks <= 39){
            grade = "D";
        }
        else{
            grade = "F";
        }
        
}

public String getGrade(){
    return grade;
}

@Override
public String toString(){
    String s = String.format("%-40s%-20s%-25s%-12s%-10s\n", name, matricNo, semester, totalMarks, grade);
    return s;
}
}