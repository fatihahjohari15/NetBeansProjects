/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance3task2;

/**
 *
 * @author User-PC
 */
public class TestStaffUUMInheritance {
    public static void main(String[] args){
        
        StaffUUM staff = new StaffUUM();
        Malaysian malaysian = new Malaysian();
        International international = new International();
        
        staff.setName("Sharifah");
        staff.setStaffID("1199");
        staff.setSchool("SOC");
        staff.setSalary(3000.00);
        
        malaysian.setName("Syed");
        malaysian.setStaffID("1169");
        malaysian.setSchool("SBM");
        malaysian.setSalary(6000.00);
        malaysian.setIcNum("830818-02-5261");
        malaysian.setResidentialStatus("Citizen");
        
        international.setName("Jason");
        international.setStaffID("2290");   
        international.setSchool("SMMTC");
        international.setSalary(1000.00);
        international.setPassportNum("G8990298");
        international.setOriginCountry("United Kingdom");
        
        System.out.println("UUM STAFF\n");
        System.out.println("UUM Staff name is "+staff.getName());
        System.out.println("UUM Staff Staff ID is "+staff.getStaffID());
        System.out.println("UUM Staff School is "+staff.getSchool());
        System.out.printf("UUM Staff salary is RM %.2f",staff.getSalary());
        System.out.println("\n\nMALAYSIAN UUM STAFF\n");
        System.out.println("Malaysian UUM Staff name is "+malaysian.getName());
        System.out.println("Malaysian UUM Staff Staff ID is "+malaysian.getStaffID());
        System.out.println("Malaysian UUM Staff School is "+malaysian.getSchool());
        System.out.printf("Malaysian UUM Staff salary is RM %.2f",malaysian.getSalary());  
        System.out.println("\nMalaysian UUM Staff IC number is "+malaysian.getIcNum());
        System.out.println("Malaysian UUM Staff residential status is "+malaysian.getResidentialStatus()+"\n");
        System.out.println("INTERNATIONAL UUM STAFF\n");
        System.out.println("International UUM Staff name is "+international.getName());
        System.out.println("International UUM Staff Staff ID is "+international.getStaffID());
        System.out.println("International UUM Staff School is "+international.getSchool());
        System.out.printf("International UUM Staff salary is RM %.2f",international.getSalary());
        System.out.println("\nInternational UUM Staff passport number is "+international.getPassportNum());
        System.out.println("International UUM Staff origin country is "+international.getOriginCountry());
        
    }
    
}
