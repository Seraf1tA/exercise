package gui1;

import javax.swing.JOptionPane;

public class Gui1 {

    public static void main(String[] args) {

        // show input only do strings 
        String fn = JOptionPane.showInputDialog("Enter first number");
        String sn = JOptionPane.showInputDialog("Enter second number");
        
        int num1 = Integer.parseInt(fn); // take number and convert it to intiger
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "The answer is " +sum, "the title", JOptionPane.PLAIN_MESSAGE);
        // null is for position on screen, snswer + snum, title is for window title, last is for icons 
    }
    
    
}
