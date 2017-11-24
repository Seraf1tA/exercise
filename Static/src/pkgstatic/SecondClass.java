package pkgstatic;

public class SecondClass {
    
    private String first;
    private String last;
    private static int members = 0;
    
    public SecondClass(String fn, String ln){
    
        first = fn;
        last = ln;
        members++;
        System.out.printf("Constructof for %s %s, members in da club: %d\n", first, last, members);
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public static int getMembers(){
        return members;
    }
}
