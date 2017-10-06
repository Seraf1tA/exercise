package compoundinterestprogram;

public class CompoundInterestProgram {

    public static void main(String[] args) {

        double amount;
        double principal = 10.000; //<- start amount
        double rate = .01;

        for (int day = 1; day <= 20; day++) {
            amount = principal * Math.pow(1 + rate, day);
            System.out.println(day + "  "+ amount);
        }

    }

}
/*
Formula A = P(1 + R) ^ n
    
A = amount
P = principle
(1+R) times 1 + rate
^n to power or years 

*** SITE DEFINITION ***

The formula for annual compound interest, including principal sum, is:
A = P (1 + r/n) (nt)

Where:

A = the future value of the investment/loan, including interest
P = the principal investment amount (the initial deposit or loan amount)
r = the annual interest rate (decimal)
n = the number of times that interest is compounded per year
t = the number of years the money is invested or borrowed for

Note that this formula gives you the future value of an investment or loan, which is compound interest plus the principal. Should you wish to calculate the compound interest only, you need this:

Total compounded interest = P (1 + r/n) (nt) - P 
 */
