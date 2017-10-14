package multipleconstructors;

public class MultipleConstructors {

    public static void main(String[] args) {
    
        SecondClass sc = new SecondClass();
        SecondClass sc1 = new SecondClass(5);
        SecondClass sc2 = new SecondClass(5,13);
        SecondClass sc3 = new SecondClass(5,13,43);
        
        System.out.printf("%s\n", sc.toMilitary());
        System.out.printf("%s\n", sc1.toMilitary());
        System.out.printf("%s\n", sc2.toMilitary());
        System.out.printf("%s\n", sc3.toMilitary());
        
    }
    
}
