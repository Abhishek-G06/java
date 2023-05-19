import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener;
//import java.awt.event.ItemListener;

class main1 extends Frame implements ItemListener, ActionListener{
    Button b1;
    Checkbox c1,c2;
    Label l1,l2,l3;
    TextField t1,t2,t3;

    main1()
    {
        setVisible(true);
        setSize(400, 400);
        setBackground(Color.WHITE);

        //Button
        b1 = new Button("Close");
        
        //CheckBoxes
        c1 = new Checkbox("Add");
        c2 = new Checkbox("Multiply");
        
        //Labels
        l1=new Label("Enter first number");
        l2=new Label("Enter Second number");
        l3=new Label("Result");
        
        //TextFields
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        
        setLayout(new FlowLayout());
        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(c1);add(c2);
        add(b1);

        //adding ActionListener
        c1.addItemListener(this);
        c2.addItemListener(this);
        b1.addActionListener(this);
        
        
    }
    public void ItemStateChanged(ActionEvent ae)
    {
        if(c1.getState() && ae.getSource()==c1)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a+b;
            t3.setText(" "+ c);
        }
        if(c2.getState() && ae.getSource()==c2)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a*b;
            t3.setText(" "+ c);
        }
        

    
    }  
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1)
        {
            dispose();}
    } 
    
    public static void main(String args[])
    {  
        main1 obj=new main1();
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itemStateChanged'");
    }
}