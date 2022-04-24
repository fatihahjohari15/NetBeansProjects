/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatastructure;

/**
 *
 * @author User-PC
 */
public class Student {
protected String name;
protected String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
@Override
    public String toString(){
        return "Name: "+name+ "\nStudent ID: " +id+ "\n\n";
    }
}
