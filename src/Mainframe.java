import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Mainframe extends JFrame  implements ActionListener{
JButton add;

    Mainframe()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/main.jpg"));
        Image i2=i1.getImage().getScaledInstance(3000,1000,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        add(img);

        JMenuBar mb=new JMenuBar();

        JMenu home=new JMenu("Home");
        home.setForeground(Color.RED);
        mb.add(home);
        setJMenuBar(mb);

        JMenu student=new JMenu("Student Information");
        student.setForeground(Color.RED);
        mb.add(student);
        setJMenuBar(mb);


        JMenu aboutUs=new JMenu("About Us");
        aboutUs.setForeground(Color.RED);
        mb.add(aboutUs);
        setJMenuBar(mb);

        JMenu contact=new JMenu("Contact");
        contact.setForeground(Color.RED);
        mb.add(contact);
        setJMenuBar(mb);

        JMenu ex=new JMenu("Exit");
        ex.setForeground(Color.RED);
        mb.add(ex);
        ex.addActionListener(this);
        setJMenuBar(mb);

        JMenuItem newStudent=new JMenuItem("Add New Student ");
        newStudent.setBackground(Color.WHITE);
        student.add(newStudent);

        JMenuItem showStudent=new JMenuItem("View all Students");
        showStudent.setBackground(Color.WHITE);
        student.add(showStudent);

        JMenuItem removeStudent=new JMenuItem("Remove a Student");
        removeStudent.setBackground(Color.WHITE);
        student.add(removeStudent);

        JMenuItem updateStudent=new JMenuItem("Update Student Records");
        updateStudent.setBackground(Color.WHITE);
        student.add(updateStudent);


        setSize(5118,3412);
        setVisible(true);
    }
public void actionPerformed(ActionEvent e)
{
String msg=e.getActionCommand();
if(msg.equals("Exit"))
{
    setVisible(false);
}
}

    public  static  void main(String args[])
    {
        new Mainframe();

    }
}
