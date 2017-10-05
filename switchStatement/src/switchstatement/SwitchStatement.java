package switchstatement;


public class SwitchStatement {

    
    public static void main(String[] args) {
      
        int age;
        age = 3;
        
        switch (age){
            case 1:
                System.out.println("You can crawl");
                break;
            case 2:
                System.out.println("You can talk");
                break;
            case 3:
                System.out.println("You can get in trouble");
                break;
            default: //<- if everything else fail do this
                System.out.println("I dont know how old you are");
        }
    
    }
    
}
