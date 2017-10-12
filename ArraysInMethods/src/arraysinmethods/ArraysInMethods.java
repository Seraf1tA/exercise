package arraysinmethods;



public class ArraysInMethods {

    public static void main(String[] args) {
    
        int ar[] = {3,4,5,6,7};
        change(ar); // <- if class is in safe file same main class just call no 
                    // need for creating object 
        
        for(int y:ar){
            System.out.println(y);
        }
    }
    /*
    method witch take 2 parameter type of int and 
    a single arrey with variable x 
    */
    public static void change(int x[]){
    
        for(int counter=0;counter<x.length;counter++){
        x[counter]+=5; //<- go trough all index and add 5 to each 
        }
        
    }
            
}
