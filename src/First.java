import javax.swing.*;
import java.awt.*;
public class First extends JFrame implements  Runnable{
   Thread t;
    First()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/campus.jpg"));
        Image i2=i1.getImage().getScaledInstance(768,512,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        add(img);
t=new Thread(this);
t.start();
        setVisible(true);
        int  x=1;
        for(int i=2;i<=400;i+=4,x+=1)
        {
        setSize(i+3*x,i+x/2);
        setLocation(500-((i+x)/2),400-(i/2));
        try
        {
            Thread.sleep(10);
        }catch(Exception e){}
        }
    }
    public void run()
    {
try
{
    Thread.sleep(7000);
    setVisible(false);
    //next frame
    new Login();
}
catch(Exception e)
{

}
    }
    public static  void main(String arg[])
    {
        new First();
    }
}
