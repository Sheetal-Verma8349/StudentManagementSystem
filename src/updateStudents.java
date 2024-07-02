import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.*;


public class updateStudents extends JFrame implements ActionListener {
    JTextField tfcourse,addresstf,phonetf,emailtf;
    JLabel rollNolb,labelrollno;
    JButton update,cancel;
    Choice crollno;
    JLabel courselb;
    updateStudents()
    {
        //setSize(900,650);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);


        //heading
        JLabel heading=new JLabel("Update Student Details");
        heading.setBounds(310,10,500,50);
        heading.setFont(new Font("serif",Font.BOLD,35));
        add(heading);

        //search by roll Number
        JLabel rn=new JLabel("Select roll number");
        rn.setBounds(50,100,200,20);
        rn.setFont(new Font("serif",Font.BOLD,20));
        add(rn);

        crollno=new Choice();
        crollno.setBounds(250,100,220,20);
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



        //namelabel
        JLabel namelb=new JLabel("Name");
        namelb.setBounds(50,150,100,30);
        namelb.setFont(new Font("serif",Font.BOLD,20));
        add(namelb);

       JLabel labelname=new JLabel();
       labelname.setBounds(200,150,150,30);
       labelname.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(labelname);
        //father name
        JLabel fatherNamelb=new JLabel("Father's Name");
        fatherNamelb.setBounds(400,150,200,30);
        fatherNamelb.setFont(new Font("serif",Font.BOLD,20));
        add(fatherNamelb);

        JLabel labelfname=new JLabel();
        labelfname.setBounds(600,150,150,30);
        labelfname.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelfname);

//roll NUmber
        JLabel rollnolb=new JLabel("Roll Number");
        rollnolb.setBounds(50,200,200,30);
        rollnolb.setFont(new Font("serif",Font.BOLD,20));
        add(rollnolb);

        labelrollno =new JLabel();
        labelrollno.setBounds(200,200,200,30);
        labelrollno.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelrollno);


        JLabel doblb=new JLabel("Date of Birth");
        doblb.setBounds(400,200,200,30);
        doblb.setFont(new Font("serif",Font.BOLD,20));
        add(doblb);
        JLabel labeldob=new JLabel();
        labeldob.setBounds(600,200,150,30);
        labeldob.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labeldob);

        //address
        JLabel addresslb=new JLabel("Address");
        addresslb.setBounds(50,250,200,30);
        addresslb.setFont(new Font("serif",Font.BOLD,20));
        add(addresslb);

        addresstf=new JTextField();
        addresstf.setBounds(200,250,150,30);
        add(addresstf);

        //phone
        JLabel phonelb=new JLabel("Mobile");
        phonelb.setBounds(400,250,200,30);
        phonelb.setFont(new Font("serif",Font.BOLD,20));
        add(phonelb);

        phonetf=new JTextField();
        phonetf.setBounds(600,250,150,30);
        add(phonetf);

        //email
        JLabel emaillb=new JLabel("Email Id");
        emaillb.setBounds(50,300,200,30);
        emaillb.setFont(new Font("serif",Font.BOLD,20));
        add(emaillb);

        emailtf=new JTextField();
        emailtf.setBounds(200,300,150,30);
        add(emailtf);

        //10
        JLabel tenthlb=new JLabel("Class X %");
        tenthlb.setBounds(400,300,200,30);
        tenthlb.setFont(new Font("serif",Font.BOLD,20));
        add(tenthlb);

        JLabel labelx=new JLabel();
        labelx.setBounds(600,300,150,30);
        labelx.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelx);

        //12
        JLabel xiilb=new JLabel("Class XII %");
        xiilb.setBounds(50,350,200,30);
        xiilb.setFont(new Font("serif",Font.BOLD,20));
        add(xiilb);

        JLabel labelxii=new JLabel();
        labelxii.setBounds(200,350,150,30);
        labelxii.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelxii);

        //course
        courselb=new JLabel("Course");
        courselb.setBounds(400,350,200,30);
        courselb.setFont(new Font("serif",Font.BOLD,20));
        add(courselb);


        tfcourse=new JTextField();
        tfcourse.setBounds(600,350,150,30);
        add(tfcourse);


        try
        {
            Conn c=new Conn();
            String query="select * from Student where RollNo='"+crollno.getSelectedItem()+"'";
         ResultSet rs=c.s.executeQuery(query);
         while(rs.next())
         {
             labelname.setText(rs.getString("Name"));
             labelfname.setText(rs.getString("FatherName"));
             labelrollno.setText(rs.getString("RollNo"));
             labeldob.setText(rs.getString("DOB"));
             addresstf.setText(rs.getString("Address"));
             phonetf.setText(rs.getString("Phone"));
             emailtf.setText(rs.getString("Email"));
             labelx.setText(rs.getString("X"));
             labelxii.setText(rs.getString("XII"));
             tfcourse.setText(rs.getString("Course"));
         }

        }catch(Exception e)
        {
         e.printStackTrace();
        }
        crollno.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                try
                {
                    Conn c=new Conn();
                    String query="select * from Student where RollNo='"+crollno.getSelectedItem()+"'";
                    ResultSet rs=c.s.executeQuery(query);
                    while(rs.next())
                    {
                        labelname.setText(rs.getString("Name"));
                        labelfname.setText(rs.getString("FatherName"));
                        labelrollno.setText(rs.getString("RollNo"));
                        labeldob.setText(rs.getString("DOB"));
                        addresstf.setText(rs.getString("Address"));
                        phonetf.setText(rs.getString("Phone"));
                        emailtf.setText(rs.getString("Email"));
                        labelx.setText(rs.getString("X"));
                        labelxii.setText(rs.getString("XII"));
                        tfcourse.setText(rs.getString("Course"));
                    }

                }catch(Exception ee)
                {
                    ee.printStackTrace();
                }



            }
        });

        //buttonsSubmit
        update=new JButton("Update");
        update.setBounds(250,450,120,30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setFont(new Font("Tahoma",Font.BOLD,15));
       update.addActionListener(this);
        add(update);

        //buttonsCancel
        cancel=new JButton("Cancel");
        cancel.setBounds(450,450,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Tahoma",Font.BOLD,15));
        cancel.addActionListener(this);
        add(cancel);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==update)
        {
        String rollNo=labelrollno.getText();
        String address=addresstf.getText();
        String phone=phonetf.getText();
        String email=emailtf.getText();
        String course=tfcourse.getText();
        try
        {
            String query="update Student set Address='"+address+"',Phone='"+phone+"',Email='"+email+"',Course='"+course+"' where RollNo='"+rollNo+"'";
       Conn  c=new Conn();
       c.s.executeUpdate(query);
       JOptionPane.showMessageDialog(null,"Students details Updated successfully");
        }catch(Exception eee) {
            eee.printStackTrace();
        }}
        else if(ae.getSource()==cancel)
            {
                setVisible(false);
                new Home();
            }

    }

    public static  void main(String arg[])
    {
        new updateStudents();
    }
}
