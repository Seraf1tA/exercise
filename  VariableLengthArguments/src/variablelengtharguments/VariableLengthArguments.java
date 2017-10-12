package variablelengtharguments;
/*
Method for times when I dont know how manny arguments I will take
*/
public class VariableLengthArguments {

    public static void main(String[] args) {
        
        System.out.println(average(3,4,56576,87874,234,56,12,1,76)); // <-
        // calling class average and in paramethers pass variable of numbers
    }
    
    public static int average(int...numbers){ // type (int) elipse (...) and variable
        
        int total = 0;
        for( int x:numbers)
            total=+x;
        return total/numbers.length;
    }
}
