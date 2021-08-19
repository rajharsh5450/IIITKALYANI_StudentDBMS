
package studentdbms;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;


public class SignUp extends JFrame implements ActionListener{
    
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    JPasswordField p1;
    JButton b1, b2, b3;
    JComboBox cb1;
    
    SignUp()
    {
        super("SignUp Portal");
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
        add(cb1);
        
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
        
        b1= new JButton("Register");
        b1.setBounds(300, 250, 130, 35);
        b1.setFont(new Font("serif", Font.BOLD, 18));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
        
        b2 = new JButton("Cancel");
        b2.setBounds(100, 250, 130, 35);
        b2.setFont(new Font("serif", Font.BOLD, 18));
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);
        
        getContentPane().setBackground(new Color(102, 45, 149));
        setVisible(true);
        setSize(550, 360);
        setLocation(500, 300);
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
                    
                    if(utp.equals("Student"))
                    {
                        c1.st.executeUpdate("insert into student values('', '', '', '', '', '', '', '', '', '"+id+"', '', '')");
                        c1.st.executeUpdate("insert into gpa values('0', '0','0', '0','0', '0','0', '0', '0', '0', '"+id+"')");
                    }
                    JOptionPane.showMessageDialog(null, "User has been created! Now login!");
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "User already exist. Please login.");
                    new Login().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setVisible(false);
                }
            } catch (Exception e) {                
            }
        }
        else if(ae.getSource()== b2)
        {
            new Login().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(false);
        }
    }
}
