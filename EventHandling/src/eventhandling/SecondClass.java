package eventhandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SecondClass extends JFrame {

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;
    
    public SecondClass(){
    
        super("Title");
        setLayout(new FlowLayout());
        
        item1 = new JTextField(10); // 10 is lenght
        add(item1);
        
        item2 = new JTextField("enter txt here");
        add(item2);
        
        item3 = new JTextField("uneditbale");
        item3.setEditable(false);
        add(item3);
        
        passwordField = new JPasswordField("my pass");
        add(passwordField);
        
        thehandler handler = new thehandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
        
    }
    
    private class thehandler implements ActionListener{ // this class take only one method 
        
        public void actionPerformed(ActiveEvent event){
        
            String string = "";
            
            if(event.getSource()==item1)
                string = String.format("field 1: %s", event.getActionCommand());
            else if(event.getSource()==item2)
                string = String.format("field 2: %s", event.getActionCommand());
            else if(event.getSource()==item3)
                string = String.format("field 3: %s", event.getActionCommand());
            else if(event.getSource()==passwordField)
                string = String.format("password field is : %s", event.getActionCommand());
        }
    
    }
    
    
}
