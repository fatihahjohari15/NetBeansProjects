/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleQQ;

/**
 *
 * @author User-PC
 */
public class moneyConverter {
double amount;
double my_rm;
double us_dollar;
double jpn_yen;
double result;

    public moneyConverter(double amount, double my_rm, double us_dollar, double jpn_yen) {
        this.amount = amount;
        this.my_rm = my_rm;
        this.us_dollar = us_dollar;
        this.jpn_yen = jpn_yen;
    }

    public double getAmount() {
        return amount;
    }

    public double getMy_rm() {
        my_rm = 4.16044 ;
        return my_rm;
    }

    public double getUs_dollar() {
        us_dollar = 0.24041247;
        return us_dollar;
    }

    public double getJpn_yen() {
        jpn_yen = 26.589468;
        return jpn_yen;
    }
  
}
