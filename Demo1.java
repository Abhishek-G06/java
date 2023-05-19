import java.awt.*;
import java.awt.event.*;

class Demo1 extends Frame implements ActionListener
{
    Button B1, B2, B3, B4;
    TextField T1, T2;
    Demo1(){
        setVisible(true);
        setSize(200, 200);
        B1=new Button("RED");
        B2=new Button("BLUE");
        B3=new Button("GREEN");
        B4=new Button("CLOSE");
        T1=new TextField(20);
        
        setBackground(Color.BLUE);
        setLayout(new FlowLayout());
        add(B1);add(B3);add(B2);add(B4);add(T1);
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==B1){setBackground(Color.RED);}
        if(ae.getSource()==B2){setBackground(Color.BLUE);}
        if(ae.getSource()==B3){setBackground(Color.GREEN);}
        if(ae.getSource()==B4){dispose();}
    }
    public static void main(String args[])
    {  
        Demo1 obj=new Demo1();
    }
}