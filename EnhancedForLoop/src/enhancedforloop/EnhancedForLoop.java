package enhancedforloop;

/*
Inted of taking options Enhanced for Loop take only 2
first type of data and identifier here
int and x, x will store items from arrey while he loops that arrey

*/

public class EnhancedForLoop {

    public static void main(String[] args) {
        
        int ar[] =  {3,4,5,6,7};
        int total = 0;
        
        for(int x: ar){ //<- type and identifier and name of arrey to inform
                        //  program what arrey we talk about if we have more
            
            total += x; //<- add sum of total from arrey
                        
        }
        System.out.println(total);
    }
    
}
