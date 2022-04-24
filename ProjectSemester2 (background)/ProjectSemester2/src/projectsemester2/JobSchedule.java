/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsemester2;

/**
 *
 * @author User-PC
 */
public class JobSchedule{
    protected Staff staff;
    protected String shiftday1;
    protected String shiftday2;
    protected String shiftday3;
    protected String shiftday4;
    protected String shiftday5;
    protected String shiftday6;
    protected String shiftday7;
   
public JobSchedule(Staff staff, String shiftday1, String shiftday2, String shiftday3, String shiftday4, String shiftday5, String shiftday6, String shiftday7){
    
    this.staff = staff;
    this.shiftday1 = shiftday1;
    this.shiftday2 = shiftday2;
    this.shiftday3 = shiftday3;
    this.shiftday4 = shiftday4;
    this.shiftday5 = shiftday5;      
    this.shiftday6 = shiftday6;
    this.shiftday7 = shiftday7;
}
   
//start displaySchedule method
public String displaySchedule(){
    String displaySchedule = String.format("%-20s%-20s%-29s%-20s%-20s%-20s%-20s\n",shiftday1, shiftday2,shiftday3,shiftday4,shiftday5,shiftday6,shiftday7);
    return staff.printStaffDetails() + displaySchedule;
} //end displaySchedule method

} //end class for JobSchedule

//"%20s%25s%17s%17s%17s%17s%17s\n"
//"%-40s%-10s%$-10s%4$-10s%5$-10s%6$-10s%7$-10s%8$-10s%9$-10s%10$-10s%\n"