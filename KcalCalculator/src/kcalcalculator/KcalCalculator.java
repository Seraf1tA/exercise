package kcalcalculator;

import java.util.Scanner;

public class KcalCalculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double waga, wynik, wysilek;
        int mnoznik = 24 ;
        System.out.println("Enter your wight: ");
        waga = sc.nextDouble();
        System.out.println("Enter intensity of your days from 1 to 1.5 ");
        wysilek = sc.nextDouble();
        wynik = waga * mnoznik * wysilek;
        System.out.println("Your kcal is: " + wynik);
    
    }
    
}


 

