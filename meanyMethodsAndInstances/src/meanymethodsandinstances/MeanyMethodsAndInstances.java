package meanymethodsandinstances;

import java.util.Scanner;

public class MeanyMethodsAndInstances {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // <- create scanner
        anotherClass ac = new anotherClass(); // <- import class
        System.out.println("Enter name of first gf: "); // <- print out first instruction ask for name
        String t = sc.nextLine(); // <- take var string 
        ac.setName(t); // <- change string to var "t" setName class
        ac.saying(); // <- print to console
        
    }
    
}
