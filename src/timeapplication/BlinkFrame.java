
package timeapplication;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class BlinkFrame {
    
    static JFrame bf;
    static ImageIcon ii;
    static JLabel jl;
    
    static void startTimer(){
        
        
        
        bf = new JFrame();
        jl = new JLabel("I'm blinking yeeeey!", SwingConstants.CENTER);
        jl.setFont(new java.awt.Font("Dialog", 1, 14));
        
        jl.setForeground(Color.BLACK);
        bf.setSize(300, 200);
        bf.setLocation(600, 200);
        bf.getContentPane().setBackground(Color.white);
        bf.setTitle("Color blinking frame");
        bf.add(jl);
        bf.setVisible(true);
        
        
    }
}
