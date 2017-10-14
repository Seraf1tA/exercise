package publicprivateandthis;

public class PublicPrivateAndThis {

    public static void main(String[] args) {
    
        SecondClass sc = new SecondClass();
        System.out.println(sc.toMilitary());
        System.out.println(sc.toString());
        sc.setTime(0, 0, 0);
        System.out.println(sc.toMilitary());
        System.out.println(sc.toString());
        
        
        
    }
    
}
