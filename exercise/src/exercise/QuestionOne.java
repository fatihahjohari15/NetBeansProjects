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
class QuestionOne {
    	int count;
	
        
        public QuestionOne(){
               System.out.println(count);
        count = 1;
        }        
                
	public void increment() {
		count = count + 1;
	}
	public int getCount() {
		return count;
	}
}

