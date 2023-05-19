import java.awt.*;
import javax.swing.*;

class BorderDemo extends JFrame {
    JButton b1, b2, b3, b4;
    
    BorderDemo()
    {
        setVisible(true);
        setSize(400, 400);
        
        b1 = new JButton("VIT AP");
        b2 = new JButton("VIT Vellore");
        b3 = new JButton("VIT Chennai");
        b4 = new JButton("VIT Bhopal");
        
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
    }
    public static void main(String[] args)
    {
        BorderDemo obj = new BorderDemo();
    }
}