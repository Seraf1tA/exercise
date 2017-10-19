package tostring;
/*
Composition is refering to other objects in other classes as members 
so in second class there is thirdClass as private variable 
*/


public class ToString {

    public static void main(String[] args) {
    
        ThirdClass tc = new ThirdClass(4, 5, 6); //<- create a object 
                                                 // using paramethers 4,5,6
        SecondClass sc = new SecondClass("Krzysztof", tc);
    
        System.out.println(sc);
    }
    
}
