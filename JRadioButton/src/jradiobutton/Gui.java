package jradiobutton;

import java.awt.*;
import javax.swing.*;

public class Gui extends JFrame{
    
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
    
    public Gui(){
        
        super("Title");
        setLayout(new FlowLayout());
        
        tf = new JTextField("this is text filed", 25);
        add(tf);
        
        pb = new JRadioButton();
        bb = new JRadioButton("bold", false);
        ib = new JRadioButton("italic", false);
        bib = new JRadioButton("bold and italic", false);
        add(pb);
        add(bb);
        add(ib);
        add(bib);
        
        
        
    
    
    }
    
}
