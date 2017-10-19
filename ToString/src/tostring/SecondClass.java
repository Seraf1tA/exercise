package tostring;

public class SecondClass {
    
    private String name;
    private ThirdClass birthday;
    
    public SecondClass(String theName, ThirdClass theDate){
    
        name = theName;
        birthday = theDate;
    }
    public String toString(){
    
        return String.format("My name is %s, my birthday is %s", name, birthday);
    
    }
    
    
    
}
