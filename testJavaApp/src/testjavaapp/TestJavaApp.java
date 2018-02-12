
package testjavaapp;

/**
 *
 * @author SeraF
 */
public class TestJavaApp {

  
   
   static String st; 
   
   public static void main(String[] args){
        
        setJavaProgrammingIsGreat("Java Programming is Great.");
        System.out.println(returnJavaProgrammingIsGreat());
       
   }
   
   public static void setJavaProgrammingIsGreat(String st1){
       st = st1;
   }
   
   
   public static String returnJavaProgrammingIsGreat(){
       
       return st;
      
   } 

}


