package enumeration;

import java.util.EnumSet;

/*
when creating enums java already bulding arrey 
name of it is class.values()
*/

public class Enumeration {

    public static void main(String[] args) {
        
        for(SecondClass fruits: SecondClass.values())
            System.out.printf("%s\t%s\t%s\n", fruits, fruits.getDesc(), fruits.getYear());
        
        
            System.out.println("\nAnd now range of constance!!!!!!!!!!!\n");
            
            
            for(SecondClass fruits: EnumSet.range(SecondClass.strawbery, SecondClass.mandarine))
                System.out.printf("%s\t%s\t%s\n", fruits, fruits.getDesc(), fruits.getYear());
    }
}
