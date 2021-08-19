
package studentdbms;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;


public class User extends JFrame implements ActionListener{
    
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3;
    JPasswordField p1;
    JButton b1, b2, b3;
    JComboBox cb1;
    
    User(String idVal, boolean updaate)
    {
        super("User's Credentials");
        setLayout(null);
    
        l1= new JLabel("Username*");
        l1.setFont(new Font("serif", Font.ITALIC, 24));
        l1.setBounds(80, 50, 130, 30);
        l1.setForeground(new Color(250, 21, 3));
        add(l1);
        
        l2= new JLabel("Password*");
        l2.setFont(new Font("serif", Font.ITALIC, 24));
        l2.setBounds(80, 100, 130, 30);
        l2.setForeground(new Color(250, 21, 3));
        add(l2);
        
        t1= new JTextField();
        t1.setBounds(220, 50, 220, 30);
        t1.setBackground(new Color(165, 182, 156));
        t1.setForeground(Color.BLACK);
        t1.setFont(new Font("serif", Font.ITALIC, 20));
        add(t1);
        
        p1= new JPasswordField();
        p1.setBounds(220, 100, 220, 30);
        p1.setBackground(new Color(165, 182, 156));
        p1.setForeground(Color.BLACK);
        p1.setFont(new Font("serif", Font.ITALIC, 20));
        add(p1);
        
        l3= new JLabel("User Type");
        l3.setFont(new Font("serif", Font.ITALIC, 24));
        l3.setBounds(80, 150, 130, 30);
        l3.setForeground(new Color(250, 21, 3));
        add(l3);
        
        String[] userType= {"Student", "Teacher"};
        cb1= new JComboBox(userType);
        cb1.setBounds(220, 150, 220, 30);
        cb1.setBackground(new Color(165, 182, 156));
        cb1.setForeground(Color.BLACK);
        cb1.setFont(new Font("serif", Font.ITALIC, 20));
        
        t3 = new JTextField();
        t3.setBounds(220, 150, 220, 30);
        t3.setBackground(new Color(165, 182, 156));
        t3.setForeground(Color.BLACK);
        t3.setFont(new Font("serif", Font.ITALIC, 20));
        
        l4= new JLabel("User ID*");
        l4.setBounds(80, 200, 130, 30);
        l4.setFont(new Font("serif", Font.ITALIC, 24));
        l4.setForeground(new Color(250, 21, 3));
        add(l4);
        
        t2= new JTextField();
        t2.setBounds(220, 200, 220, 30);
        t2.setBackground(new Color(165, 182, 156));
        t2.setForeground(Color.BLACK);
        t2.setFont(new Font("serif", Font.ITALIC, 20));
        add(t2);
        
               
        b1 = new JButton("Register");
        b1.setBounds(300, 260, 130, 30);
        b1.setFont(new Font("serif", Font.BOLD, 18));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b3 = new JButton("Update");
        b3.setBounds(300, 260, 130, 30);
        b3.setFont(new Font("serif", Font.BOLD, 18));
        b3.addActionListener(this);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        if(updaate)
        {
            add(t3);
            add(b3);
            try {
                conn c1 = new conn();
                ResultSet rs = c1.st.executeQuery("select * from login where id='"+idVal.trim()+"'");
                if(rs.next())
                {
                    t1.setText(rs.getString("username"));
                    p1.setText(rs.getString("password"));
                    t2.setText(idVal.trim());
                    t3.setText(rs.getString("status"));
                }
            } catch (Exception e) {
            }
        }
        else
        {
            add(cb1);
            add(b1);
        }
        
        b2 = new JButton("Cancel");
        b2.setBounds(100, 260, 130, 30);
        b2.setFont(new Font("serif", Font.BOLD, 18));
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);
        
        getContentPane().setBackground(new Color(65, 29, 95));
        setSize(550, 350);
        setLocation(500, 300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== b1)
        {
            try {
                conn c1 = new conn();
                String un = t1.getText();
                String psd = p1.getText();
                String utp = (String)cb1.getSelectedItem();
                String id = t2.getText().trim();
                ResultSet uCheck = c1.st.executeQuery("select id from login where id='"+id+"'");
                if(!(uCheck.next()))
                {
                    String q = "insert into login values('"+un+"','"+psd+"','"+id+"','"+utp+"')";
                    c1.st.executeUpdate(q);
                    JOptionPane.showMessageDialog(null, "User created.");
                    new LoginDetails();
                    setVisible(false);
                    if(utp.equals("Student"))
                    {
                        c1.st.executeUpdate("insert into student values('', '', '', '', '', '', '', '', '', '"+id+"', '', '')");
                        c1.st.executeUpdate("insert into gpa values('0', '0','0', '0','0', '0','0', '0', '0', '0', '"+id+"')");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "User already exist.");
                    new LoginDetails();
                    setVisible(false);
                }
            } catch (Exception e) {                
            }
        }
        else if(ae.getSource()== b2)
        {
            new LoginDetails();
            setVisible(false);
        }
        else if(ae.getSource()== b3)
        {
            try {
                conn c1 = new conn();
                c1.st.executeUpdate("update login set username='"+t1.getText()+"', password='"+p1.getText()+"', id='"+t2.getText()+"', status='"+t3.getText()+"' where id='"+t2.getText()+"'");
                JOptionPane.showMessageDialog(null, "User details updated!");
                new LoginDetails();
                setVisible(false); 
            } catch (Exception e) {
            }
        }
    }
    
}
