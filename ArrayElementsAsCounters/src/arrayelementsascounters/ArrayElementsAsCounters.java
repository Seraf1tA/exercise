package arrayelementsascounters;

/*
ra.nextInt(6) <- give 0 to 5 but thanks to +1 start from 1 and go to 6

++fre maki  it every roll was added to index how many times each number comes out
*/


import java.util.Random;

public class ArrayElementsAsCounters {

    public static void main(String[] args) {
        Random ra = new Random();
        int fre[] = new int[7]; // <-array equal to 7 items
        
        for(int roll=1;roll<1000000;roll++){
            ++fre[1+ra.nextInt(6)]; //<- shift start to 1 inted of 0
        }
            System.out.println("Face \f Frequency"); //<- head
            
            for(int face=1;face<fre.length;face++){
                System.out.println(face+ "\t" +fre[face]); //<- output dice number(index) and value
            }
    }
    
}
