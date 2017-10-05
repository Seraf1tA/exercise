package usingmethodsandparameters;

import java.util.Scanner;

public class UsingMethodsAndParameters {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in); // <- create scanner
        secondClass sc = new secondClass(); // <- import class
        
        System.out.println("Enter your name here: "); // ask for name
        String name = ip.nextLine(); // before next line must be variable what scanner was sighn for
        
        sc.simpleMessage(name);
        

    }
    
}
