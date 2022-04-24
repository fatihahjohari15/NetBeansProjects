/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_STIA2024;

import java.util.Comparator;

/**
 *
 * @author nurainunamaninamohamed
 */
public class BillingSystem{
    String billDate, accountNo, invoiceNo, userName, userAddress, meterNo;
    double overdueAmt, oldMeter, newMeter, totalUsage, totalCharge, totalBill;

    public BillingSystem(double overdueAmt, double oldMeter, double newMeter) {
        this.overdueAmt = overdueAmt;
        this.oldMeter = oldMeter;
        this.newMeter = newMeter;
    }

    public BillingSystem(String billDate, String accountNo, String invoiceNo, String userName, String userAddress, double overdueAmt, String meterNo, double oldMeter, double newMeter, double totalUsage, double totalCharge, double totalBill) {

            this.billDate = billDate;
            this.accountNo = accountNo;
            this.invoiceNo = invoiceNo;
            this.userName = userName;
            this.userAddress = userAddress;
            this.overdueAmt = overdueAmt;
            this.meterNo = meterNo;
            this.oldMeter = oldMeter;
            this.newMeter = newMeter;
            this.totalUsage = totalUsage;
            this.totalCharge = totalCharge;
            this.totalBill = totalBill;
    }

    public BillingSystem() {
    }
    
    // getter
    public String getBillDate() {
        return billDate;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getMeterNo() {    
        return meterNo;
    }

    public double getOverdueAmt() {
        return overdueAmt;
    }

    public double getOldMeter() {
        return oldMeter;
    }

    public double getNewMeter() {
        return newMeter;
    }

    public double getTotalUsage() {
        return totalUsage;
    }

    public double getTotalCharge() {
        return totalCharge;
    }
    
    public double getTotalBill() {
        return totalBill;
    }

    //setter
    public void setTotalUsage(double totalUsage) {
        this.totalUsage = totalUsage;
    }

    public void setTotalCharge(double totalCharge) {
        this.totalCharge = totalCharge;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
    
    
    // method
    public double calculateTotalUsage() {
        setTotalUsage(getNewMeter() - getOldMeter());
        return getTotalUsage();
    }

    public double calculateTotalCharge(){

        if (getTotalUsage() > 0 && getTotalUsage() <=200){
            setTotalCharge(getTotalUsage() * 0.218);
            setTotalCharge((getTotalCharge() * 0.016) + getTotalCharge());
        }

        else if (getTotalUsage() > 200 && getTotalUsage() <=300){
            setTotalCharge(200 * 0.218);
            setTotalCharge(getTotalCharge() + ((getTotalUsage() - 200) * 0.334));
        }

        else if (getTotalUsage() > 300 && getTotalUsage() <= 600){
            setTotalCharge((200 * 0.218) + (100 * 0.334));
            setTotalCharge(getTotalCharge() + ((getTotalUsage() - 300) * 0.516));
        }

        else if (getTotalUsage() > 600 && getTotalUsage() <= 900){
            setTotalCharge((200 * 0.218) + (100 * 0.334) + (300 * 0.516));
            setTotalCharge(getTotalCharge() + ((getTotalUsage() - 600) * 0.546));
        }

        else if (getTotalUsage() > 900) {
            setTotalCharge((200 * 0.218) + (100 * 0.334) + (300 * 0.516) + (300 * 0.546));
            setTotalCharge(getTotalCharge() + ((getTotalUsage() - 300) * 0.571));
        }
        return getTotalCharge();
    }

    public double calculateTotalBill() {
        setTotalBill(getOverdueAmt() + getTotalCharge());
        return getTotalBill();
    }
    
    @Override
    public String toString(){
        String d = "";
        d += "\nTarikh Bil: " + getBillDate();
        d += "\nNombor Akaun: " + getAccountNo();
        d += "\nNo Invois Cukai: " + getInvoiceNo();
        d += "\nNama Pengguna: " + getUserName();
        d += "\nAlamat Pengguna: " + getUserAddress();
        d += String.format("\nTunggakan: RM "  + "%.2f" , getOverdueAmt());
        d += "\nNo Meter: "  + getMeterNo();
        d += String.format("\nBacaan Meter Terdahulu: " + "%.0f" , getOldMeter());
        d += String.format("\nBacaan Meter Sekarang: " + "%.0f" , getNewMeter());
        d += String.format("\nJumlah Unit Kegunaan: " + "%.0f" , getTotalUsage());
        d += String.format("\nCaj Semasa: RM " + "%.2f" , getTotalCharge());
        d += String.format("\nJumlah Bayaran: RM " + "%.2f" , getTotalBill());

        return d;
    }
}

// DISPLAY PANEL
class AccNoCompare implements Comparator<BillingSystem>
{
    @Override
    public int compare(BillingSystem b1, BillingSystem b2)
    {
        return b1.accountNo.compareTo(b2.accountNo);
    }
}
