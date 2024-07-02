import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
public class StudentDetails extends JFrame implements ActionListener {
    Choice crollno;
    JTable table;
    JButton Search,Print,Cancel;
    StudentDetails()
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/student.jpg"));
        Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        img.setBounds(1230,0,300,250);
        add(img);

        ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("images/i1.jpg"));
        Image i6=i5.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i4=new ImageIcon(i6);
        JLabel img1=new JLabel(i4);
        img1.setBounds(1230,250,300,250);
        add(img1);

        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("images/i2.jpg"));
        Image i8=i7.getImage().getScaledInstance(300,280,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel img3=new JLabel(i9);
        img3.setBounds(1230,500,300,280);
        add(img3);

        ImageIcon i77=new ImageIcon(ClassLoader.getSystemResource("images/i2.jpg"));
        Image i88=i77.getImage().getScaledInstance(280,280,Image.SCALE_DEFAULT);
        ImageIcon i99=new ImageIcon(i88);
        JLabel img33=new JLabel(i99);
        img33.setBounds(0,0,280,280);
        add(img33);

        ImageIcon i55=new ImageIcon(ClassLoader.getSystemResource("images/i1.jpg"));
        Image i66=i55.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i44=new ImageIcon(i66);
        JLabel img11=new JLabel(i44);
        img11.setBounds(0,270,280,250);
        add(img11);

        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("images/student.jpg"));
        Image i22=i11.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i33=new ImageIcon(i22);
        JLabel img43=new JLabel(i33);
        img43.setBounds(0,530,280,250);
        add(img43);

        //heading
        JLabel head=new JLabel("STUDENTS  DETAILS");
        head.setBounds(570,40,500,50);
        head.setFont(new Font("serif",Font.BOLD,40));
        add(head);

        JLabel heading=new JLabel("Search by Roll Number");
        heading.setBounds(600,170,190,20);
        heading.setFont(new Font("serif",Font.BOLD,18));
        add(heading);
        crollno=new Choice();
        crollno.setBounds(800,170,150,20);
        add(crollno);

        try
        {
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from Student");
            while(rs.next())
            {
                crollno.add(rs.getString("RollNo"));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        table=new JTable();

        try
        {
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from Student");
          table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(300,220,900,500);
        add(jsp);

        Search=new JButton("Search");
        Search.setBounds(300,170,80,20);
        Search.addActionListener(this);
        add(Search);

        Print=new JButton("Print");
        Print.setBounds(380,170,80,20);
        Print.addActionListener(this);
        add(Print);

        Cancel=new JButton("Cancel");
        Cancel.setBounds(460,170,80,20);
        Cancel.addActionListener(this);
        add(Cancel);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
    if(ae.getSource()==Search)
    {
    String query="select * from Student where RollNo='"+crollno.getSelectedItem()+"'";
    try
    {
        Conn c=new Conn();
        ResultSet rs=c.s.executeQuery(query);
        table.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(Exception e)
    {
        e.printStackTrace();
    }


    }else if(ae.getSource()==Print)
    {
        try
        {
       table.print();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }else if(ae.getSource()==Cancel)
    {
        setVisible(false);
        new Home();

    }

    }
    public static void main(String args[])
        {
        new StudentDetails();
    }
}
