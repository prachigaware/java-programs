import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class InvalidPasswordException extends Exception
{}
class Userpassword extends JFrame implements ActionListener
{
    JLabel name,pass;
    JTextField nameText;
    JPasswordField passText;
    JButton login,end;
    static int cnt=0;
   Userpassword()
   {
        name=new JLabel("name:");
        pass=new JLabel("password:");
        nameText=new JTextField(20);
        passText=new JPasswordField(20);
        login=new JButton("end");
        login.addActionListener(this);
        end.addActionListener(this);
        setLayout(new GridLayout(3,2));
        add(name);
        add(nameText);
        add(pass);
        add(passText);
        add(login);
        add(end);
        setTitle("login check");
        setSize(300, 300);
        setDefaultCloseOperatio(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
     }
            public void ActionPerformed(ActionEvent e)
            {
                if(e.getSource()==end)
                {
                   System.exit(0);
                }
              if(e.getSource()==login)
              {
                try
                {
                  String user=nameText.getText();
                  String pass=new String(passText.getPassword());
                  if(user.compareTo(pass)==0)
                  {
                     JOptionPane.showMessageDialog(null,"login succ","Login",JOptionPane.INFORMATION_MESSAGE);
                     System.exit(0);
                   }
                   else
                   {
                   throw new InvalidPasswordException();
            }
       }
       catch(Exception e1)
       {
         cnt++;
         JOptionPane.showMessageDialog(null,"Login failed","Login",JOptionPane.ERROR_MESSAGE);
         nameText.setText("");
         passText.setText("");
         nameText.requestFocus();
         if(cnt==3)
         {
           JOptionPane.showMessageDialog(null,"3 Attempts Over","Login",JOptionPane.ERROR_MESSAGE);
           System.exit(0);
      }
    }
  }
 }
 
 public static void main(String args[])
 {
   new Userpassword();
  }
 }
   
        
