package tostring;

public class ThirdClass {
    
    private int month;
    private int day;
    private int year;
    
    public ThirdClass(int m, int d, int y){
    
        month = m;
        day = d;
        year = y;
        
        System.out.printf("The constructor for this is %s\n", this);
        
    }
    
    public String toString(){ // have to be named toString so "this" reference can find it
        return String.format("%d/%d/%d", month, day, year); 
    }
    
}
