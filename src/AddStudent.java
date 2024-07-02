import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class AddStudent extends JFrame implements ActionListener {
    JTextField nametf,fnametf,addresstf,phonetf,emailtf,tenthtf,xiitf,rollnotf;
    JLabel rollNolb;
    JDateChooser dob;
    JComboBox cbcourse;
    JButton submit,cancel;
    Random ran=new Random();
    long first4=Math.abs((ran.nextLong() %9000L)+1000);
    AddStudent()
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

        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("images/student3.jpeg"));
        Image i8=i7.getImage().getScaledInstance(520,300,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel img2=new JLabel(i9);
        img2.setBounds(1000,500,520,300);
        add(img2);

        ImageIcon ii7=new ImageIcon(ClassLoader.getSystemResource("images/student43.jpg"));
        Image ii8=ii7.getImage().getScaledInstance(520,300,Image.SCALE_DEFAULT);
        ImageIcon ii9=new ImageIcon(ii8);
        JLabel img22=new JLabel(ii9);
        img22.setBounds(1000,200,520,300);
        add(img22);

       //heading
       JLabel heading=new JLabel("New Student Detail");
       heading.setBounds(310,30,500,50);
       heading.setFont(new Font("serif",Font.BOLD,30));
       add(heading);

       //namelabel
        JLabel namelb=new JLabel("Name");
        namelb.setBounds(50,150,100,30);
        namelb.setFont(new Font("serif",Font.BOLD,20));
        add(namelb);

        nametf=new JTextField();
        nametf.setBounds(200,150,150,30);
        add(nametf);

        //father name
        JLabel fatherNamelb=new JLabel("Father's Name");
        fatherNamelb.setBounds(400,150,200,30);
        fatherNamelb.setFont(new Font("serif",Font.BOLD,20));
        add(fatherNamelb);

        fnametf=new JTextField();
        fnametf.setBounds(600,150,150,30);
        add(fnametf);

        /*//roll
        rollNolb=new JLabel("Roll Number");
        rollNolb.setBounds(50,200,200,30);
        rollNolb.setFont(new Font("serif",Font.BOLD,20));
        add(rollNolb);
            JLabel lbrollNo=new JLabel("15345"+first4);
        lbrollNo.setBounds(200,200,200,30);
        lbrollNo.setFont(new Font("serif",Font.BOLD,20));
        add(lbrollNo);
        */

        JLabel rollnolb=new JLabel("Roll Number");
        rollnolb.setBounds(50,200,200,30);
        rollnolb.setFont(new Font("serif",Font.BOLD,20));
        add(rollnolb);

        rollnotf=new JTextField();
        rollnotf.setBounds(200,200,150,30);
        add(rollnotf);



        JLabel doblb=new JLabel("Date of Birth");
        doblb.setBounds(400,200,200,30);
        doblb.setFont(new Font("serif",Font.BOLD,20));
        add(doblb);
        dob=new JDateChooser();
        dob.setBounds(600,200,150,30);
        add(dob);

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

        tenthtf=new JTextField();
        tenthtf.setBounds(600,300,150,30);
        add(tenthtf);

        //12
        JLabel xiilb=new JLabel("Class XII %");
        xiilb.setBounds(50,350,200,30);
        xiilb.setFont(new Font("serif",Font.BOLD,20));
        add(xiilb);

        xiitf=new JTextField();
        xiitf.setBounds(200,350,150,30);
        add(xiitf);

        //course
        JLabel courselb=new JLabel("Course");
        courselb.setBounds(400,350,200,30);
        courselb.setFont(new Font("serif",Font.BOLD,20));
        add(courselb);

        String course[]={"B.Tech","MCA","Bsc","Msc","MBA","M.com","BA"};
        cbcourse=new JComboBox(course);
        cbcourse.setBounds(600,350,150,30);
       cbcourse.setBackground(Color.WHITE);
        add(cbcourse);


        //buttonsSubmit
        submit=new JButton("Submit");
        submit.setBounds(250,450,120,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Tahoma",Font.BOLD,15));
        submit.addActionListener(this);
        add(submit);

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
if(ae.getSource()==submit)
{
String name=nametf.getText();
String fname=fnametf.getText();
String rollNo=rollnotf.getText();
String  dob1=((JTextField) dob.getDateEditor().getUiComponent()).getText();
String address=addresstf.getText();
String phone=phonetf.getText();
String email=emailtf.getText();
String x=tenthtf.getText();
String xii=xiitf.getText();
String course=(String)cbcourse.getSelectedItem();
try
{
String query="insert into Student values('"+name+"','"+fname+"','"+rollNo+"','"+dob1+"','"+address+"','"+phone+"','"+email+"','"+x+"','"+xii+"','"+course+"')";
Conn c=new Conn();
c.s.executeUpdate(query);
JOptionPane.showMessageDialog(null,"Student details added Succefully");
setVisible(false);
new Home();
}catch(Exception e)
{
    e.printStackTrace();
}
}
else if(ae.getSource()==cancel){
    setVisible(false);
    new Home();
}
    }
    public static  void main(String arg[])
    {
        new AddStudent();
    }
}
