package nestedelseifstatements;

public class NestedElseIfStatements {

    public static void main(String[] args) {
        
        int age = 45;
        
        if (age >= 60)
            System.out.println("You are a senior citizen");
        else if (age >= 50)
                System.out.println("you are in 50s");
        else if (age >= 40)
                System.out.println("you are in 40s");
        else
            System.out.println("You are young kid :)");
    }
    
}
/*
if is main test if it fails if go to else if

else if go between if and else statements
*/