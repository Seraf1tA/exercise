package constructors;

/*
by creating constructors I can use one var for multiple obcejts
who cant see each other variables

Constructor allow to initialize var as soon as object is created
*/
public class Constructors {

    public static void main(String[] args) {

        testClass tc = new testClass("putName"); // <- putting argument here  
        // insted of leaving it empty will initialize constructor and will pass a name in to girlName String
        testClass tc2 = new testClass("putName2");// <- second object with seperate variable

        tc.saying(); // passing object one string in to output
        tc2.saying();// passing object two string in to output 
    }

}
