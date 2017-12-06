package simplepolymorphicprogram;

public class SimplePolymorphicProgram {

    public static void main(String[] args) {
        
        Animal[] thelist = new Animal[2];
        Dog d = new Dog();
        Fish f = new Fish();
        
        thelist[0]=d;
        thelist[1]=f;
        
        for(Animal x:thelist){ // this loops trough arrey 
            x.noise();
        }

    }
    
}
