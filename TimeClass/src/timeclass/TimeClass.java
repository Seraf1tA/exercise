package timeclass;

public class TimeClass {

    public static void main(String[] args) {
        
        SecondClass sc = new SecondClass();
        System.out.println(sc.toMilitary());
        System.out.println(sc.toString());
        sc.setTime(13, 27, 6);
        System.out.println(sc.toMilitary());
        System.out.println(sc.toString());
        
        
    }
    
}
