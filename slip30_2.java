import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Division extends JFrame implements ActionListener
{
        JButton bt n1;
        JTextField t1,t2;
        JLabel l1,l2,Result;
         Division()
         {
             t1=new JTextField(10);
             t2=new JTextField(10);
            Result=new JLabel();
  	    l1=new JLabel("Enter First number");
	    l2=new JLabel("Enter Second number");
	    btn1=new JButton("Divide");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(btn1);
		add(Result);
		setLayout(new FlowLayout());
		btn1.addActionListener(this);
		setVisible(true);
		setSize(300,400);
	}
public void actionPerformed(ActionEvent ae)
{
        try
   {
	 int v1=Integer.parseInt(t1.getText());
	int v2=Integer.parseInt(t2.getText());
	int ans=v1/v2;
	Result.setText(ans+" ");
   }
    catch(NumberFormatException e)
  {
       System.out.println("Enter a valid number!");
   }
    catch(ArithmeticException o)
   {
	System.out.println("Divided by zero");
   }
}
public static void main(String args[])
  {
        Division ob1=new Division();
   }
}


/*
javac slip30_2.java
java Division
*/
