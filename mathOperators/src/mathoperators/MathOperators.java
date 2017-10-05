package mathoperators;
import java.util.Scanner;

public class MathOperators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int girls, boys, people;
        girls = 12;
        boys = 5;
        //people = girls % boys; <- to find what ever was left
        //people = girls + boys;
        //people = girls - boys;
        people = girls / boys;
        
        double dgirls, dboys, dpeople;
        dgirls = 12;
        dboys = 5;
        dpeople = girls + boys;
        //dpeople = girls - boys;
        //dpeople = girls / boys;
        
        
        System.out.println(people);     
        System.out.println(dpeople);
    }
    
}
