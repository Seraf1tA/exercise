package eventhandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SecondClass extends JFrame { // create window and components

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;
    
    public SecondClass(){ // edit and add to window 
    
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
        
        thehandler handler = new thehandler(); // create object for handler 
        item1.addActionListener(handler); // this add action listener method need object 
        item2.addActionListener(handler); // so earlier ocject for handling need to be 
        item3.addActionListener(handler); // created
        passwordField.addActionListener(handler);
        
    }
    
    private class thehandler implements ActionListener{ 
    // class with is needed for handling stuff and it need to implement action listener
    // this class take only one method 
        
        public void actionPerformed(ActionEvent event){ // this is straight use after called
        
            String string = "";
            
            // if item is used ise what wver was place in this case string 
            if(event.getSource()==item1)
                string = String.format("field 1: %s", event.getActionCommand());
            else if(event.getSource()==item2)
                string = String.format("field 2: %s", event.getActionCommand());
            else if(event.getSource()==item3)
                string = String.format("field 3: %s", event.getActionCommand());
            else if(event.getSource()==passwordField)
                string = String.format("password field is : %s", event.getActionCommand());
            
            JOptionPane.showMessageDialog(null, string);
        }
    
    }
    
    
}
