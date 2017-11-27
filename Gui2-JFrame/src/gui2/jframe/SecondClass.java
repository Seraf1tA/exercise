package gui2.jframe;

import java.awt.*;
import javax.swing.*;

public class SecondClass extends JFrame{ // give all basic windows features
    
    private JLabel item1;
    
    public SecondClass(){
    
        super("The title bar"); // super is for naming title bar 
        setLayout(new FlowLayout()); // setting leyout
        
        item1 = new JLabel("this is a sentece");
        item1.setToolTipText("This is gona show up on hover");
        add(item1); // at end item need to be added to window other wise it whould be invisible 
        
                
    
    }
    
}
