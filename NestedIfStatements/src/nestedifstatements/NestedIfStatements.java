package nestedifstatements;

public class NestedIfStatements {

    public static void main(String[] args) {

        int age = 60;

        if (age < 50) {
            System.out.println("You are young");
        } else {
            System.out.println("You are old");
            if (age > 75) {
                System.out.println("You are really old!");
            } else {
                System.out.println("dont worry you arent really that old");
            }
        }

    }
}
/*
Nested if statements allow to make decision after decision 
by puting if statement in another 
and I can place how many I want, alowing for multiple decision
*/    
