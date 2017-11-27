package pkgfinal;

public class SecondClass {

    private int sum;
    private final int NUMBER; 
    // final before int means i can't modify this no 
    // matter what
    
    public SecondClass(int x){
        NUMBER = x;
    }
    public void add(){
    
        sum += NUMBER;
    }
    public String toString(){
        return String.format("sum = %d\n", sum);
    }
    
}
