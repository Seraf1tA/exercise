package inheritance;

/*
only public methods can be inherited 

if I want to override i need to do it again 

extends is key word for inheritance
*/


public class Inheritance {

    public static void main(String[] args) {
        
        SecondClass sc = new SecondClass();
        ThirdClass tc = new ThirdClass();
        
        sc.eat();
        tc.eat();

    }
    
}
