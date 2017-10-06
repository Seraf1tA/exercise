package simpleaveragingprogram;

import java.util.Scanner;

public class SimpleAveragingProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0; // <- hold sum of all grades
        int grade;     // <- allow to import numbers seperatly
        int average;   // <- hold total of grade divaded by total 
        int counter = 0; // counter var with starts from 0 and then go to 10 in while loop

        while (counter < 10) {
            grade = sc.nextInt(); // grade = next int I put in console temporarily because it change with next int i place in console
            total = total + grade; //<- take grade and add to total for extracting average later
            counter++; //<- increment counter so it can go to loop and not make it infinate
        }
        average = total/10;
        System.out.println("Your average is: " +average);
    }

}
