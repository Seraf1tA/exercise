package pkgfinal;

public class Final {

    public static void main(String[] args) {
    
        SecondClass sc = new SecondClass(10); // set x = 10
        
        for(int i = 0; i<5;i++){ // loops 5 times adding sum to NUMBER 
            sc.add();
            System.out.printf("%s", sc);
        }
    }
    
}
