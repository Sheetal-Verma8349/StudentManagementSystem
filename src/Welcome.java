import javax.swing.*;
import java.awt.*;
public class Welcome extends JFrame implements Runnable{

    Thread t;

    Welcome()
    {
        //Frame
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);
        setVisible(true);

        //Heading
        JLabel heading1=new JLabel("WELCOME TO");
        heading1.setBounds(620,60,8500,100);
        //heading1.setForeground(Color.white);
        heading1.setFont(new Font("serif",Font.BOLD,40));
        add(heading1);

        //Heading
        JLabel heading2=new JLabel("Student Management System");
        heading2.setBounds(420,140,8500,100);
        //heading2.setForeground(Color.white);
        heading2.setFont(new Font("serif",Font.BOLD,65));
        add(heading2);

        t=new Thread(this);
        t.start();

    }
public void run()
{
    try
    {
        Thread.sleep(7000);
        //setVisible(false);
        //next frame
        new Login();
    }
    catch(Exception e)
    {

    }
}







    public static  void main(String args[])
    {
        new Welcome();
    }
}
