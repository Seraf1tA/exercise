package pkgstatic;
/*
Static is use if i whould like to use one variable in many classes 
so they will share it 
*/

public class Static {

    public static void main(String[] args) {
    
        SecondClass member1 = new SecondClass("putsi", "poo");
        SecondClass member2 = new SecondClass("putsi", "poo2");
        SecondClass member3 = new SecondClass("putsi", "poo3");
        SecondClass member4 = new SecondClass("putsi", "poo4");
        
        System.out.println();
        System.out.println(member1.getFirst());
        System.out.println(member1.getLast());
        System.out.println(member1.getMembers());
        
        System.out.println();
        System.out.println(member2.getFirst());
        System.out.println(member2.getLast());
        System.out.println(member2.getMembers());
        
        System.out.println();
        System.out.println();
        System.out.println(SecondClass.getMembers());
        // for static I can put class name and request static method without object
        
        
    }
    
}
