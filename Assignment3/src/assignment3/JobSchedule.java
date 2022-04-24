package assignment3;

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
    String a = String.format("\n%s %23s \n", "Day         " ,"Shift      ");
    String b = String.format("\n%s %15s \n", "Monday      " ,shiftday1  );
    String c = String.format("\n%s %14s \n", "Tuesday     " ,shiftday2  );
    String d = String.format("\n%s %10s \n", "Wednesday   " ,shiftday3  );
    String e = String.format("\n%s %14s \n", "Thursday    " ,shiftday4  );
    String f = String.format("\n%s %18s \n", "Friday      " ,shiftday5  );
    String g = String.format("\n%s %15s \n", "Saturday    " ,shiftday6  );
    String h = String.format("\n%s %15s \n", "Sunday      " ,shiftday7  );
    return staff.printStaffDetails() + a + b + c + d +e + f + g + h;
} //end displaySchedule method

} //end class for JobSchedule

