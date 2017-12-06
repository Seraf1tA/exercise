package jcheckboxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Gui extends JFrame{
    
    private JTextField tf;
    private JCheckBox bb;
    private JCheckBox ib;
    
    public Gui(){
        
        super("title");
        setLayout(new FlowLayout());
        
        tf = new JTextField("This is sentence", 20);
        tf.setFont(new Font("Serif", Font.PLAIN, 14));
        add(tf);
        
        bb = new JCheckBox("bold");
        ib = new JCheckBox("italic");
        add(bb);
        add(ib);
        
        HandlerClass handler = new HandlerClass();
        bb.addItemListener(handler);
        ib.addItemListener(handler);
        
    }
    
    private class HandlerClass implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            Font font = null;
            
            if(bb.isSelected() && ib.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if(bb.isSelected())
                font = new Font("Serif", Font.BOLD, 14);
            else if(ib.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            else
                font = new Font("Serif", Font.PLAIN, 14);
        
            tf.setFont(font);
        }
    }
    
}
