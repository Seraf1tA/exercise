package meanymethodsandinstances;

public class anotherClass {

    private String girlName; //<- private visible only to this class method
    public void setName(String name){
    
        girlName = name;
    
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
    
        System.out.printf("Your first gf was %s", getName()); //<- put string in args
    
    }
    
}
