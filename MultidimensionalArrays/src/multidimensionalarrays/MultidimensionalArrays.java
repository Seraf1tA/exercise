package multidimensionalarrays;

/*
[] [] CREATE MULTI DIMENSIONAL ARREY 

*/

public class MultidimensionalArrays {

    public static void main(String[] args) {
    
        int fa[][]={{8,9,10,11},{12,13,14,15}};
        int sa[][]= {{30,31,32,33},{43},{4,5,6}};
        
        System.out.println("This is first arrey");
        display(fa);
        System.out.println("This is second arrey");
        display(sa);
    }
    public static void display(int x [][]){
    
        for(int row=0;row<x.length;row++){ // it takes row number
            for(int column=0;column<x[row].length;column++){ // takes column number
                System.out.print(x[row][column]+"\t");
            }
            System.out.println(); // whe it comes to end this make it print new line 
        }
    }
}
