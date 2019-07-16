
package timeapplication;

import java.awt.Color;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {

    public static void main(String[] args) {
       
        MyFrame frame = new MyFrame();
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(340, 200);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.WHITE);
        
        
        
        
    }
    
}
