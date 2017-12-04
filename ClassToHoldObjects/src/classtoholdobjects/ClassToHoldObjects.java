package classtoholdobjects;

public class ClassToHoldObjects {

    public static void main(String[] args) {
        
        /* DogList dl = new DogList();
        Dog d = new Dog();
        dl.add(d); */
    
        AnimalList al = new AnimalList(); // creating object so i can use methods from animal class
        Dog d = new Dog(); // creating dog object
        Fish f = new Fish(); // vreating fish object
        al.add(d);// adding them to arrey of animal list
        al.add(f);
        
        
    
    }
    
}
