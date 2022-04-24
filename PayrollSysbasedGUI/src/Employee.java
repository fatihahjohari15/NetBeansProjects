public class Employee {
    
    private String employeeID;
    private double hourWork, hourlyRate, OT_rate;
    private boolean memberUnionStatus;


 public Employee (String ID, double hWork, double hRate, double OtRate, boolean mStatus){
        
    employeeID = ID;
    hourWork = hWork;
    hourlyRate = hRate;
    OT_rate = OtRate;
    memberUnionStatus = mStatus;
}

  public double computeGrossPay(){
 // TODO add your handling code here:        
    
    double grossPay = 0;
    if (hourWork <= 40.00)
        grossPay = hourWork*hourlyRate;
    
    else
        grossPay = (hourWork - 40.0)*hourlyRate*OT_rate+(40*hourlyRate);
    
    return grossPay;
      
}

  public double computeNetPay(){
 // TODO add your handling code here:   
     
    double netPay = 0;
    double grossPay = computeGrossPay();
    if (memberUnionStatus && grossPay >= 100.0)
        netPay = grossPay - 25;
    
    else if (!memberUnionStatus && grossPay < 100.0)
        netPay = grossPay;

    return netPay;
}

    @Override
  public String toString(){
   return "Employee ID is " + employeeID + "\nHours Worked are " +  hourWork + "\nHourly Rate is RM" + hourlyRate + "\nThe overtime rate is " + OT_rate + " for hours worked over 40.0\nThe unions dues are RM25.00 for gross pay over RM100.00"+ "\nGross pay is RM" + computeGrossPay() + "\nNet pay is RM" + computeNetPay();
 }


}
