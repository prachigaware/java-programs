import java.awt.*;
import java.awt.event.*;
class FrameDemo extends Frame implements ActionListener
{
   Float a,b,c;
   int ch;
   TextField t1;
   Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bdiv,bequal,bmul;
   FrameDemo()
   {
     setVisible(true);
     setSize(500,500);
     setTitle("calculator");
     setLayout(new FlowLayout());
     b1=new Button("1");
     b2=new Button("2");
     b3=new Button("3");ig
     b4=new Button("4");
     b5=new Button("5");
    b6=new Button("6");
    b7=new Button("7");
    b8=new Button("8");
    b9=new Button("9");
    b0=new Button("0");
    bdot=new Button(".");
    badd=new Button("+");
    bsub=new Button("-");
     bdiv=new Button("/");
     bequal=new Button("=");
     t1=new TextField("15");
     Panel P1=new Panel();
     P1.setLayout(new GridLayout(4,4,10,10));
     P1.add(b1); 
     P1.add(b2); 
     P1.add(b3); 
      P1.add(b4); 
      P1.add(b5); 
      P1.add(b6); 
      
      P1.add(b7); 
      P1.add(b8); 
      P1.add(b9); 
      P1.add(b0);
       
      P1.add(bdot); 
     P1.add(badd); 
     
      P1.add(bsub); 
      P1.add(bdiv); 
      P1.add(bequal); 
      add(t1);
      add(P1);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
      b0.addActionListener(this);
      bdot.addActionListener(this);
      badd.addActionListener(this);
      bsub.addActionListener(this);
      bdiv.addActionListener(this);
      bequal.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource()==b1)
       t1.setText(t1.getText()+"1");
       if(ae.getSource()==b2)
       t1.setText(t1.getText()+"2");
       if(ae.getSource()==b3)
       t1.setText(t1.getText()+"3");
       if(ae.getSource()==b4)
       t1.setText(t1.getText()+"4");
       if(ae.getSource()==b5)
       t1.setText(t1.getText()+"5");
       if(ae.getSource()==b6)
       t1.setText(t1.getText()+"6");
       if(ae.getSource()==b7)
       t1.setText(t1.getText()+"7");
       if(ae.getSource()==b8)
       t1.setText(t1.getText()+"8");
       if(ae.getSource()==b9)
       t1.setText(t1.getText()+"9");
       
       if(ae.getSource()==b0)
       t1.setText(t1.getText()+"0");
       if(ae.getSource()==bdot)
       t1.setText(t1.getText()+".");
       if(ae.getSource()==badd)
       {
         ch=1;
         a=Float.parseFloat(t1.getText());
         t1.setText("");
         }
         if(ae.getSource()==bsub)
         {
           ch=2;
           a=Float.parseFloat(t1.getText());
           t1.setText("");
        }
        if(ae.getSource()==bmul)
        {
        ch=3;
        a=Float.parseFloat(t1.getText());
        t1.setText("");
        }
        if(ae.getSource()==bdiv)
        {
        ch=4;
        a=Float.parseFloat(t1.getText());
       t1.setText("");
       }
       if(ae.getSource()==bequal)
       {
       b=Float.parseFloat(t1.getText());
       switch(ch)
       {
         case 1:c=a+b;
                     break;
         case 2:c=a-b;
                     break;
         case 3:c=a*b;
                      break;
          case 4:c=a/b;
                     break;
       }
       t1.setText(""+c);
   }
   }
   public static void main(String arg[])
   {
     new FrameDemo();
   }
 }
        
        
