/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author User-PC
 */
public class Q1Main {
	public static void main (String []arg) {
		QuestionOne q1;
		q1 = new QuestionOne();
             
           System.out.println(q1.count);          
		q1.increment();
           System.out.println(q1.count);
		q1.increment();
		System.out.println(q1.getCount());
	}


}
