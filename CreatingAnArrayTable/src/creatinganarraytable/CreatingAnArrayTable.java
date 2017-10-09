package creatinganarraytable;

public class CreatingAnArrayTable {

    public static void main(String[] args) {

        System.out.println("Index\tValue");
        int are[] = {32,12,18,54,2};
        
        for(int counter=0; counter<are.length;counter++){ //<- name of array.length
            System.out.println(counter + "\t" + are[counter]);
        }
    }
    
}
