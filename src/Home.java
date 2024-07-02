import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame implements ActionListener {
    JButton Add,Update,show,delete,exit;

    Home()
    {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);


        //Heading
        JLabel heading1=new JLabel("Student");
        heading1.setBounds(1200,10,8500,100);
        //heading1.setForeground(Color.white);
        heading1.setFont(new Font("serif",Font.ITALIC,65));
        add(heading1);

        //Heading
        JLabel heading2=new JLabel("Management System");
        heading2.setBounds(1090,70,8500,100);
        //heading2.setForeground(Color.white);
        heading2.setFont(new Font("serif",Font.ITALIC,50));
        add(heading2);

        JMenuBar mb=new JMenuBar();

        JMenu home=new JMenu("Home");
        home.setForeground(Color.BLACK);
        home.setFont(new Font("Arial",Font.BOLD,18));
        home.setSize(400,400);
        mb.add(home);

        JMenu AboutUs=new JMenu("AboutUs");
        AboutUs.setForeground(Color.BLACK);
        AboutUs.setFont(new Font("Arial",Font.BOLD,18));
        AboutUs.setSize(400,400);
        mb.add(AboutUs);

        JMenuItem ab=new JMenuItem("AboutUs");
        ab.setBackground(Color.CYAN);
        ab.setForeground(Color.BLACK);
        ab.addActionListener(this);
        AboutUs.add(ab);

        JMenu contact=new JMenu("Contact");
        contact.setForeground(Color.BLACK);
        contact.setFont(new Font("Arial",Font.BOLD,18));
        contact.setSize(400,400);
        mb.add(contact);
        setJMenuBar(mb);

        //Add button
        Add=new JButton("ADD STUDENT");
        Add.setBounds(130,300,250,100);
        Add.setBackground(Color.BLACK);
        Add.setForeground(Color.WHITE);
        Add.setFont(new Font("SansSerif",Font.BOLD,25));
        Add.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
        Add.addActionListener(this);
        add(Add);

        //update button
        Update=new JButton("UPDATE STUDENT");
        Update.setBounds(380,300,250,100);
        Update.setBackground(Color.BLACK);
        Update.setForeground(Color.WHITE);
        Update.setFont(new Font("Arial",Font.BOLD,25));
        Update.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
        Update.addActionListener(this);
        add(Update);

        //delete button
        delete=new JButton("DELETE RECORD");
        delete.setBounds(630,300,250,100);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.setFont(new Font("Arial",Font.BOLD,25));
        delete.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
        delete.addActionListener(this);
        add(delete);

        //Show button
        show=new JButton("SHOW RECORDS");
        show.setBounds(880,300,250,100);
        show.setBackground(Color.BLACK);
        show.setForeground(Color.WHITE);
        show.setFont(new Font("Arial",Font.BOLD,25));
        show.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
        show.addActionListener(this);
        add(show);

        //exit button
        exit=new JButton("EXIT");
        exit.setBounds(1130,300,250,100);
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        exit.setFont(new Font("Arial",Font.BOLD,25));
        exit.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
        exit.addActionListener(this);
        add(exit);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/images.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,450,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        img.setBounds(0,410,500,450);
        add(img);

        ImageIcon i6=new ImageIcon(ClassLoader.getSystemResource("images/student2.jpg"));
        Image i4=i6.getImage().getScaledInstance(500,450,Image.SCALE_DEFAULT);
        ImageIcon i5=new ImageIcon(i4);
        JLabel img1=new JLabel(i5);
        img1.setBounds(500,410,500,450);
        add(img1);

        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("images/student3.jpeg"));
        Image i8=i7.getImage().getScaledInstance(500,450,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel img2=new JLabel(i9);
        img2.setBounds(1000,410,510,450);
        add(img2);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String msg= ae.getActionCommand();
        if(msg.equals("AboutUs"))
        {
            new About();
        }
        if(ae.getSource()==Add)
        {
        new AddStudent();
        setVisible(false);
        }
        else if(ae.getSource()==exit)
        {
            setVisible(false);
        }
        else if(ae.getSource()==Update)
        {
            new updateStudents();
            setVisible(false);
        }
        else if(ae.getSource()==show)
        {
            new StudentDetails();
            setVisible(false);
        }
        else if(ae.getSource()==delete)
        {
            new Delete();
            setVisible(false);
        }
    }
    public static void main(String ags[])
    {
        new Home();
    }
}
