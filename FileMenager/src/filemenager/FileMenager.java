/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemenager;

import javax.swing.JFrame;

/**
 *
 * @author seraf1ta
 */
public class FileMenager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gui window = new Gui();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize (500, 400);
        window.setVisible(true);
    }
    
}
