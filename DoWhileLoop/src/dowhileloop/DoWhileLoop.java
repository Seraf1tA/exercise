package dowhileloop;

public class DoWhileLoop {

    public static void main(String[] args) {
        
        int counter = 0;
        
        do{
            System.out.println(counter);
            counter++;
        }while(counter <= 10);

    }

}
/*
Do while loop execute body of loop befere it even start so it is granted to 
execute body at least once before it see if it should be done or not
*/
