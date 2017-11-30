package PolymorphicArguementsAbstractAndConcrete;

/*
Abstract class can't be use for creating objects but can be use for polimorphism
and inheritence
comcrete is class form with objects can be made
subclasses need to implement or overwrite method from abstract class
*/

public class PolymorphicArguementsAbstractAndConcrete {

    public static void main(String[] args) {
        
        FifthClass fc = new FifthClass();
      //FourthClass foc = new FourthClass();
        FourthClass forc = new SecondClass();
        
      //fc.exam(foc);
        fc.exam(forc);

    }
    
}
