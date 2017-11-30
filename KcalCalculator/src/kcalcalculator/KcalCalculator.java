package kcalcalculator;

import java.util.Scanner;

public class KcalCalculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double weight, sum, intensity;
        int mnoznik = 24 ;
        System.out.println("Enter your wight: ");
        weight = sc.nextDouble();
        System.out.println("Enter intensity of your days from 1 to 1.5 ");
        intensity = sc.nextDouble();
        sum = weight * mnoznik * intensity;
        System.out.println("Your kcal is: " + sum);
    
    }
    
}


 

