package jradiobutton;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JRadioButton;

public class Gui extends JFrame{
    
    
    // creating variables
    private JTextField tf;
    private Font pf;
    private Font bf;
    private Font itf;
    private Font bif;
    private JRadioButton pb;
    private JRadioButton bb;
    private JRadioButton ib;
    private JRadioButton bib;
    private ButtonGroup gr; // so buttons know what they doing
    
    // creating body for window
    public Gui(){
        
        super("Title");
        setLayout(new FlowLayout());
        
        tf = new JTextField("this is text filed", 25);
        add(tf);
        
        // creating buttons, adding them and grouping
        pb = new JRadioButton("plain", true);
        bb = new JRadioButton("bold", false);
        ib = new JRadioButton("italic", false);
        bib = new JRadioButton("bold and italic", false);
        add(pb);
        add(bb);
        add(ib);
        add(bib);
        
        gr = new ButtonGroup();
        gr.add(pb);
        gr.add(bb);
        gr.add(ib);
        gr.add(bib);
        
        // creating fonts and seting default
        pf = new Font("Serif", Font.PLAIN, 14);
        bf = new Font("Serif", Font.BOLD, 14);
        itf = new Font("Serif", Font.ITALIC, 14);
        bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        tf.setFont(pf);
        
        // adding item listener to buttons 
        // wait for event to happend, pass in font object to constructor
        pb.addItemListener(new HandlerClass(pf)); // when clicked code in handler class 
        bb.addItemListener(new HandlerClass(bf)); // pf will be used 
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));

    }
    // Handler class when button is clicked 
    private class HandlerClass implements ItemListener{
    
        private Font font;
        
        // The font object gets variable font
        public HandlerClass(Font f){
        
            font = f;
            
        }

        // sets the font to the font object that was passed in
        @Override
        public void itemStateChanged(ItemEvent e) {
            tf.setFont(font);
        }
        
        
    }
    
}
