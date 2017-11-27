package gui2.jframe;

import javax.swing.*;

public class Gui2JFrame {

    public static void main(String[] args) {

        SecondClass sc = new SecondClass(); // add window from second class 
        sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set up exit on close 
        sc.setSize(275, 180); // set how big it has to be 
        sc.setVisible(true); // make it visible 
    }
    
}
