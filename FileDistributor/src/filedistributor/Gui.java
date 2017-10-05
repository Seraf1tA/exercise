package filedistributor;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui extends JFrame{
        
    private final JButton b1;
    
    public Gui(){
    
        super("File Mover");
        b1 = new JButton("Move Files");
        add(b1);
               
        
    
    }

    
    
}
