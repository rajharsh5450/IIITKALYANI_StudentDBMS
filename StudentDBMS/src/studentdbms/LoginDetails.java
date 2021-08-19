
package studentdbms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class LoginDetails extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2,b3;
    JTextField t2;
    String x[] = {"UserName","Password","ID","Status"};
    String y[][] = new String[20][4];
    int i=0, j=0;
    
    LoginDetails(){
        super("Login Details");
        setSize(1260,500);
        setLocation(200,200);
        setLayout(null);
        
        l1 = new JLabel("Enter id of user : ");
        l1.setBounds(50,360,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);
        
        t2 = new JTextField();
        t2.setBounds(400,360,200,30);
        add(t2);
        
        b1 = new JButton("Delete User");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(80, 420, 150 ,30);
        add(b1);
            
        b2 = new JButton("Add User");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(280, 420, 150 ,30);
        add(b2);
        
        b3 = new JButton("Update User");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(480, 420, 150 ,30);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        
        try{
            conn c1  = new conn();
            String s1 = "select * from login";
            ResultSet rs  = c1.st.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("username");
                y[i][j++]=rs.getString("password");
                y[i][j++]=rs.getString("id");
                y[i][j++]=rs.getString("status");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            t1.setBackground(Color.CYAN);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        t1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
               int row = t1.getSelectedRow();
               t2.setText(t1.getModel().getValueAt(row, 2).toString());
            }
        });
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330);
        add(sp);
        
        getContentPane().setBackground(Color.BLUE);
        setVisible(true); 
    }
    public void actionPerformed(ActionEvent ae){
        
        conn c1 = new conn();
    
        if(ae.getSource() == b1){
            try{
                String a;
                if(!(t2.getText().trim().equals("")))
                {
                    a= t2.getText();
                    String q = "delete from login where id= '"+a+"'";
                    c1.st.executeUpdate(q);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "*ID must be entered or click on the row of table to delete!");
                }
                setVisible(false);
                new LoginDetails();
            }catch(Exception e){}
    
        }else if(ae.getSource() == b2){
            setVisible(false);
            new User("", false);
           
        }else if(ae.getSource() == b3){
            String val;
            if(!(t2.getText().trim().equals("")))
            {
                val = t2.getText().trim();
                new User(val, true);
                setVisible(false);
            }
            
        }
    }
    
}
