package meanymethodsandinstances;

import java.util.Scanner;

public class MeanyMethodsAndInstances {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        anotherClass ac = new anotherClass();
        System.out.println("Enter name of first gf: ");
        String t = sc.nextLine();
        ac.setName(t);
        ac.saying();
        
    }
    
}
