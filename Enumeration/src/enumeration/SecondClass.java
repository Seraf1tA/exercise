package enumeration;
/*
each constance is an object and will have it own set of variables in entire 
enumeration
*/
public enum SecondClass {
    
    //constance is like variable that never change
    
    potato("nice", "1"), 
    strawbery("mmmmm", "23"),
    banana("yup", "32"),
    mandarine("uuu", "23"),
    kiwi("ewefd", "324");
    
    // private final because string will never change 
    // and every variable will use both strings
    
    private final String desc;
    private final String year; // 2 variables to represent 2 arguments 

    private SecondClass(String descryption, String birthday) {
  
        desc = descryption;
        year = birthday;
    
    }
    
    public String getDesc(){
        return desc;
    }
    
    public String getYear(){
        return year;
    }
    
    

}
