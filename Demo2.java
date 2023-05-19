import java.awt.*;
import java.awt.event.*;

class Demo2 extends Frame implements ActionListener
{
  Button B1,B2,B3,B4;
  TextField T1,T2,T3;
  Label l1,l2,l3;
  Demo2()
    {
      setVisible(true);
      setSize(200,200);
      setBackground(Color.YELLOW);
      B1=new Button("ADD");
      B2=new Button("Sub");
      B3=new Button("Multiply");
      B4=new Button("Close");
      l1=new Label("Enter first number");
      l2=new Label("Enter Second number");
      l3=new Label("Result");
      T1=new TextField(10);
      T2=new TextField(10);
      T3=new TextField(10);
      setLayout(new FlowLayout());
      add(l1); add(T1); add(l2); add(T2); add(B1);add(B2);add(B3);
      add(l3);add(T3);add(B4);
      B1.addActionListener(this);
      B2.addActionListener(this);
      B3.addActionListener(this);
      B4.addActionListener(this);
    }
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==B1)
    {
      int x=Integer.parseInt(T1.getText());
      int y=Integer.parseInt(T2.getText());
      int z=x+y;
      T3.setText(" "+ z);
    }
    if(ae.getSource()==B2)
    {
      int x=Integer.parseInt(T1.getText());
      int y=Integer.parseInt(T2.getText());
      int z=x-y;
      T3.setText(" "+ z);
    }
    if(ae.getSource()==B3)
    {
      int x=Integer.parseInt(T1.getText());
      int y=Integer.parseInt(T2.getText());
      int z=x*y;
      T3.setText(" "+ z);
   }
    if(ae.getSource()==B4)
    {
      dispose();
    }
  }
  public static void main(String args[])
  {  
    Demo2 obj=new Demo2();
  }
}