/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance3task3;

/**
 *
 * @author User-PC
 */
public class TestStaffUUMInheritance2 {
    public static void main(String[] args){
        
        StaffUUM staff = new StaffUUM("Sharifah", "1199", "SOC", 3000.00);
        Malaysian malaysian = new Malaysian("Syed", "1169", "SBM", 6000.00, "830818-02-5261", "Citizen");
        International international = new International("Jason", "2290", "SMMTC", 10000.00, "G8990298", "United Kingdom");
        
        System.out.println("UUM STAFF\n");
        System.out.println("UUM Staff name is "+staff.getName());
        System.out.println("UUM Staff Staff ID is "+staff.getStaffID());
        System.out.println("UUM Staff School is "+staff.getSchool());
        System.out.printf("UUM Staff salary is RM %.2f",staff.getSalary());
        System.out.printf("\nUUM Staff allowance is RM %.2f",staff.calculateAllowance(20));
        System.out.println("\n\nMALAYSIAN UUM STAFF\n");
        System.out.println("Malaysian UUM Staff name is "+malaysian.getName());
        System.out.println("Malaysian UUM Staff Staff ID is "+malaysian.getStaffID());
        System.out.println("Malaysian UUM Staff School is "+malaysian.getSchool());
        System.out.printf("Malaysian UUM Staff salary is RM %.2f",malaysian.getSalary());  
        System.out.printf("\nMalaysian UUM Staff allowance is RM %.2f",malaysian.calculateAllowance(28));
        System.out.println("\nMalaysian UUM Staff IC number is "+malaysian.getIcNum());
        System.out.println("Malaysian UUM Staff residential status is "+malaysian.getResidentialStatus()+"\n");
        System.out.println("INTERNATIONAL UUM STAFF\n");
        System.out.println("International UUM Staff name is "+international.getName());
        System.out.println("International UUM Staff Staff ID is "+international.getStaffID());
        System.out.println("International UUM Staff School is "+international.getSchool());
        System.out.printf("International UUM Staff salary is RM %.2f",international.getSalary());
        System.out.printf("\nInternational UUM Staff allowance is RM %.2f",international.calculateAllowance(8));
        System.out.println("\nInternational UUM Staff passport number is "+international.getPassportNum());
        System.out.println("International UUM Staff origin country is "+international.getOriginCountry());
        
    }
    
}