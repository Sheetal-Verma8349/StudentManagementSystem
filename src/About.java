import javax.swing.*;
import java.awt.*;

public class About extends JFrame{

    About()
    {
        setSize(1920,1080);
        setLocation(0,0);
        getContentPane().setBackground(Color.gray);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/aboutus.png"));
        Image i2=i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        img.setBounds(1100,20,400,400);
        add(img);

        JLabel heading=new JLabel("<html>Student<br/> Management System</html>");
        heading.setBounds(70,30,350,200);
        heading.setFont(new Font("Tahoma",Font.BOLD,50));
        add(heading);

        JLabel name=new JLabel("Developed By : SHEETAL VERMA");
        name.setBounds(68,250,550,40);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("serif",Font.ITALIC,30));
        add(name);

        JLabel email=new JLabel("Email : sheetalverma12344@gmail.com");
        email.setBounds(68,285,550,40);
        email.setForeground(Color.WHITE);
        email.setFont(new Font("serif",Font.ITALIC,30));
        add(email);

        JLabel phone=new JLabel("Contact :1234567898");
        phone.setBounds(65,320,550,40);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("serif",Font.ITALIC,25));
        add(phone);





        setLayout(null);
        setVisible(true);
    }
    public static void main(String arg[])
    {
        new About();
    }
}
