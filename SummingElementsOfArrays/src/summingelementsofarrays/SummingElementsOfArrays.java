package summingelementsofarrays;

public class SummingElementsOfArrays {

    public static void main(String[] args) {
            
        int ar[] = {21, 16, 86, 21, 3};
        int sum = 0;
        
        for(int counter = 0; counter<ar.length; counter++){
            sum+=ar[counter];
        }
        System.out.println("The sum ot these numbers is: " + sum);
    }
    
}
