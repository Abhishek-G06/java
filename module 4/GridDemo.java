import java.awt.*;
import javax.swing.*;

class GridDemo extends JFrame {
    JButton b1, b2, b3, b4;
    
    GridDemo()
    {
        setVisible(true);
        setSize(400, 400);
        
        b1 = new JButton("VIT AP");
        b2 = new JButton("VIT Vellore");
        b3 = new JButton("VIT Chennai");
        b4 = new JButton("VIT Bhopal");

        setLayout(new GridLayout(2,2));
        
        add(b1); add(b2); add(b3); add(b4); 
    }
    public static void main(String[] args)
    {
        GridDemo obj = new GridDemo();
    }
}