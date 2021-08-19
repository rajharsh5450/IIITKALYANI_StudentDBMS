
package studentdbms;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;



public class Login extends JFrame implements ActionListener{
    
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    JPasswordField p1;
    JButton b1, b2;
    
    Login()
    {
        super("Login Portal");
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
        
        l4= new JLabel("User ID*");
        l4.setBounds(80, 150, 130, 30);
        l4.setFont(new Font("serif", Font.ITALIC, 24));
        l4.setForeground(new Color(250, 21, 3));
        add(l4);
        
        t2= new JTextField();
        t2.setBounds(220, 150, 220, 30);
        t2.setBackground(new Color(165, 182, 156));
        t2.setForeground(Color.BLACK);
        t2.setFont(new Font("serif", Font.ITALIC, 20));
        add(t2);
        
        
        b1= new JButton("Login");
        b1.setBounds(80, 210, 100, 30);
        b1.setFont(new Font("serif", Font.BOLD, 18));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
        
        b2 = new JButton("Cancel");
        b2.setBounds(200, 210, 100, 30);
        b2.setFont(new Font("serif", Font.BOLD, 18));
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);
        
        l3= new JLabel("Click me to Create account.");
        l3.setBounds(310, 210, 170, 20);
        l3.setFont(new Font("serif", Font.ITALIC, 15));
        l3.setForeground(new Color(177, 181, 174));
        add(l3);
        l3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new SignUp().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
            }
        });
        
        getContentPane().setBackground(new Color(46, 53, 124));
        setVisible(true);
        setSize(550, 300);
        setLocation(500, 300);
  
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== b1){
            try{
                conn c1 = new conn();
                String u = t1.getText();
                String v = p1.getText();
                String id = t2.getText().trim();
            
                String qry = "select * from login where username='"+u+"' and password='"+v+"' and id='"+id+"'";
                ResultSet rs = c1.st.executeQuery(qry);
                if(rs.next())
                {
                    if(rs.getString("status").equals("Admin"))
                    {
                        Project adm = new Project();
                        adm.setVisible(true);
                        adm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        setVisible(false); 
                    }
                    else if(rs.getString("status").equals("Teacher"))
                    {
                        TeacherProject thp = new TeacherProject();
                        thp.setVisible(true);
                        thp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        setVisible(false);
                    }
                    else if(rs.getString("status").equals("Student"))
                    {
                        StudentProject stp = new StudentProject(id);
                        stp.setVisible(true);
                        stp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        setVisible(false);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid login");
                    setVisible(false);
                    System.exit(0); 
                }
            
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()== b2)
        {
            System.exit(0);
        }
    }
    
}
