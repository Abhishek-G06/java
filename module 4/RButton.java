import javax.swing.*;

class RButton extends JFrame {
    JRadioButton r1, r2;
    ButtonGroup bg;
   
    RButton()
    {
        setVisible(true);
        setSize(400, 400);
        
        r1 = new JRadioButton("Male");
        r1.setBounds(200, 200, 400, 400);
        r2 = new JRadioButton("Female");
        r2.setBounds(200, 300, 400, 400);
        bg = new ButtonGroup();
        
        setLayout(null);
        
        bg.add(r1);
        bg.add(r2);
        
        add(r1);
        add(r2);
    }
    public static void main(String[] args)
    {
        RButton obj = new RButton();
    }
}
