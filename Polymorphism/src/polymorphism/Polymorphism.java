package polymorphism;

public class Polymorphism {

    public static void main(String[] args) {

        FourthClass sa[] = new FourthClass[2]; // this reference variable need to be a superclass 
        sa[0] = new SecondClass(); // one that they inherit from 
        sa[1] = new ThirdClass();
        
        for(int x=0;x<2;++x){
            sa[x].study();
        }
        
    }
    
}
