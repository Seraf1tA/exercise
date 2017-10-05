package basiccalculator;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double fnum, snum, tnum, answer;
        
        System.out.println("Enter first num: ");
        fnum = scan.nextDouble();
        System.out.println("Enter second num: ");
        snum = scan.nextDouble();
        System.out.println("Enter third num: ");
        tnum = scan.nextDouble();
        answer = fnum + snum + tnum;
        System.out.println("Your answer is " + answer);        
        
    }
    
}
