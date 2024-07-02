import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton login,cancel;
    JTextField usernameText;
    JPasswordField passwordText;
    Login()
    {
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);

        //username
        JLabel usernameLabel=new JLabel("Username");
        usernameLabel.setForeground(Color.white);
        add(usernameLabel);
        usernameLabel.setBounds(40,80,100,20);
        usernameText=new JTextField();
        usernameText.setBounds(150,80,150,20);
        add(usernameText);

        //password
        JLabel passwordLabel=new JLabel("Password");
        passwordLabel.setForeground(Color.white);
        add(passwordLabel);
        passwordLabel.setBounds(40,120,100,20);
        passwordText=new JPasswordField();
        passwordText.setBounds(150,120,150,20);
        add(passwordText);

        //buttonsLogin
        login=new JButton("Login");
        login.setBounds(40,160,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setFont(new Font("Tahoma",Font.BOLD,15));
        login.addActionListener(this);
        add(login);

        //buttonsCancel
        cancel=new JButton("Cancel");
        cancel.setBounds(180,160,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Tahoma",Font.BOLD,15));
        cancel.addActionListener(this);
        add(cancel);

        //image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/login.jpg"));
        Image i2=i1.getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        img.setBounds(170,10,50,50);
        add(img);


    setSize(400,300);
    setVisible(true);
    setLocation(600,300);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==login)
        {
        String username=usernameText.getText();
        String password=passwordText.getText();
        String query="select * from login where username='"+username+"'and password='"+password+"'";
        try
        {
           Conn c=new Conn();
           ResultSet rs=c.s.executeQuery(query);
            if(rs.next() ){
          setVisible(false);
          new Home();

            }
            else {
            JOptionPane.showMessageDialog(null,"Invalid username or password");
            setVisible(false);
            new Login();
            }
        }catch(Exception e)
        {
           e.printStackTrace();
        }
        }
        else if(ae.getSource()==cancel)
        {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String ags[])
    {
       new Login();
    }
}
