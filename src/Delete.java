
import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
public class Delete extends JFrame implements ActionListener {
    Choice crollno;
    JTable table;
    JButton delete,Cancel;
    Delete()
    {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);

        delete=new JButton("Delete");
        delete.setBounds(1000,200,90,30);
        delete.addActionListener(this);
        add(delete);

        Cancel=new JButton("Cancel");
        Cancel.setBounds(1100,200,90,30);
        Cancel.addActionListener(this);
        add(Cancel);

        //heading
        JLabel heading=new JLabel("Delete Student Details");
        heading.setBounds(500,20,500,50);
        heading.setFont(new Font("serif",Font.BOLD,40));
        add(heading);

        JLabel head=new JLabel("Delete by Roll Number");
        head.setBounds(360,190,200,60);
        head.setFont(new Font("serif",Font.ITALIC,20));
        add(head);
        crollno=new Choice();
        crollno.setBounds(560,210,250,60);
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
        jsp.setBounds(350,250,900,400);
        add(jsp);

        setVisible(true);




    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==delete)
        {
            String query="delete from Student where RollNo='"+crollno.getSelectedItem()+"'";
            try
            {
                Conn c=new Conn();
                int row=c.s.executeUpdate(query);
                if(row>0) {
                    JOptionPane.showMessageDialog(null, "Students details deleted successfully");
                }
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
        new Delete();
    }
}
