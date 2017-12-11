package jcombobox;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JComboBox;

public class Gui extends JFrame{

    private JComboBox box;
    private JLabel picture;
    
    private static String[] filename = {"a.jpg", "b.jpg"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};
    
    public Gui(){
    
        super("the title");
        setLayout(new FlowLayout());
        
        box = new JComboBox(filename);
        
        
    
    }
}
