package kcalcalculator;

/*
test before using JFrame for gui
*/

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui extends JFrame{

    private JTextField tf1;
    private JTextField tf2;
    private JLabel l1;
    private JLabel l2;
    
    public Gui(){
    
        super("KCAL Calculator");
        setLayout(new FlowLayout());
        
        l1 = new JLabel("weight", 10);
        add(l1);
        
        tf1 = new JTextField("put weight", 10);
        add(tf1);
        
        l2 = new JLabel("intensity", 10);
        add(l2);
        
        tf2 = new JTextField("from 1 to 1.5", 10);
        add(tf2);
        
        
    }
    
}
