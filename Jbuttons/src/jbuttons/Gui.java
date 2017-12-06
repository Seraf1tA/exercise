package jbuttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame{
    
    private JButton reg;
    private JButton custom;
    
    public Gui(){
    
        super("JButon program title"); // super allow to access to super class
        setLayout(new FlowLayout());
        
        reg = new JButton("reg Button");
        add(reg);
        
        
        Icon a = new ImageIcon(getClass().getResource("a.jpg"));
        Icon b = new ImageIcon(getClass().getResource("b.jpg"));
        custom = new JButton("Custom", a);
        custom.setRolloverIcon(b);
        add(custom);
        
        HandlerClass handler = new HandlerClass();
        reg.addActionListener(handler);
        custom.addActionListener(handler);
        
    }
    
    private class HandlerClass implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }
        
    }
    
}
