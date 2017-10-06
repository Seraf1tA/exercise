package constructors;

public class testClass {

    private String girlName; //<- private visible only to this class method

    public testClass(String name) { // <- insted of adding scanner and asking, constructor alow 
        // to initialize var by creating method with same name as class
        girlName = name;           // <- what ever i want to initialize in method in constructor

    }

    /* public void setName(String name){
    
        girlName = name;
    
    } */
    public String getName() {
        return girlName;
    }

    public void saying() {

        System.out.printf("Your first gf was %s\n", getName()); //<- %s ask for string in arg get name
        // and \n place what next in new line 

    }

}
