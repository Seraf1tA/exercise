package filemenager;

import java.awt.Color;
import java.awt.dnd.DropTarget;
import java.util.jar.Attributes.Name;
import javax.sound.midi.Patch;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author seraf1ta
 */
public class Gui extends JFrame{
    
    private JPanel panel;
    //private static Patch[] filePatch = {};
    //private static Name[] fileName = {};
    private JButton button;
    DropTarget dt = null;

     
    public Gui(){
        
        super("File Menager");
        setLayout(null);
        
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        //od lewej, od gory, dlugosc, wysokosc
        panel.setBounds(10, 10, 220, 220);
        panel.setDropTarget(dt);
        add(panel);
        
        button = new JButton("move");
        button.setBounds(10, 250, 100, 50);
        add(button);
        
                        
    }
    
     
    
}
