/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprogramming2;

/**
 *
 * @author User-PC
 */
public class JobSchedule{
    protected Staff staff;
    protected String[] day;
    protected String[] shiftday;

    public JobSchedule(Staff staff, String[] day, String[] shiftday) {
        this.staff = staff;
        this.day = day;
        this.shiftday = shiftday;
    }
    
//start displaySchedule method
public String displaySchedule(){
    
    String displaySchedule = String.format("%20s%25s%17s%17s%17s%17s%17s\n",shiftday[0], shiftday[1],shiftday[2],shiftday[3],shiftday[4],shiftday[5],shiftday[6]);
    return staff.toString() + displaySchedule;
} //end displaySchedule method

} //end class for JobSchedule


