package logicaloperator;



public class LogicalOperator {

   
    public static void main(String[] args) {
    
        int boy, girl;
        boy = 18;
        girl = 40;
        
        if(boy > 10 && girl < 60){
            // <- condytional and both need to be correct
            // || <- or if one of them just have to be true
            // ?: Ternary (shorthand for if-then-else statement)
        
            System.out.println("You can enter");
        }else{
            System.out.println("You can not enter");
        }
    }
    
}
