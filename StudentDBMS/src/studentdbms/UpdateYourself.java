
package studentdbms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class UpdateYourself implements ActionListener{
    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,lab,lab1,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t11,t12,t13,t14;
    JButton b,b1,b2; 
    String id_emp;
    String rollNo;
    
    UpdateYourself(String rollNumber){
        this.rollNo= rollNumber;
        
        f=new JFrame("Update Student Details");
        f.setSize(900,650);
        f.setLocation(450,150);
        f.setLayout(null);

        JLabel l1 = new JLabel("Your Roll number is : ");
        l1.setBounds(50,100,500,30);
        l1.setFont(new Font("serif",Font.ITALIC,20));
        l1.setForeground(Color.BLACK);
        f.add(l1);
        
        JLabel rl = new JLabel(this.rollNo);
        rl.setBounds(500, 100, 200, 30);
        l1.setFont(new Font("serif",Font.BOLD,24));
        rl.setBackground(Color.RED);
        rl.setForeground(Color.BLACK);
        f.add(rl); 
        
        b2 = new JButton("Update");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(720,100,100,30);
        f.add(b2);
        b2.addActionListener(this);

        
        id8 = new JLabel("Update Your Details:");
        id8.setBounds(50,10,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,40));
        id8.setForeground(Color.BLACK);
        f.add(id8);


        id1 = new JLabel("Name");
        id1.setBounds(50,170,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id1.setForeground(Color.BLACK);
        f.add(id1);

        t1=new JTextField();
        t1.setBounds(200,170,150,30);
        f.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,170,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id2.setForeground(Color.BLACK);
        f.add(id2);

        t2=new JTextField();
        t2.setBounds(600,170,150,30);
        f.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,220,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id3.setForeground(Color.BLACK);
        f.add(id3);

        t3=new JTextField();
        t3.setBounds(200,220,150,30);
        f.add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(400,220,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id4.setForeground(Color.BLACK);
        f.add(id4);

        t4=new JTextField();
        t4.setBounds(600,220,150,30);
        f.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(50,270,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id5.setForeground(Color.BLACK);
        f.add(id5);

        t5=new JTextField();
        t5.setBounds(200,270,150,30);
        f.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(400,270,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id6.setForeground(Color.BLACK);
        f.add(id6);

        t6=new JTextField();
        t6.setBounds(600,270,150,30);
        f.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,320,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id7.setForeground(Color.BLACK);
        f.add(id7);

        t7=new JTextField();
        t7.setBounds(200,320,150,30);
        f.add(t7);

        id9= new JLabel("Class X(%)");
        id9.setBounds(400,320,130,30);
        id9.setFont(new Font("serif",Font.BOLD,20));    
        id9.setForeground(Color.BLACK);
        f.add(id9);

        t8=new JTextField();
        t8.setBounds(600,320,150,30);
        f.add(t8);

        id10= new JLabel("Class XII(%)");
        id10.setBounds(50,370,130,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id10.setForeground(Color.BLACK);
        f.add(id10);

        t9=new JTextField();
        t9.setBounds(200,370,150,30);
        f.add(t9);

        id12= new JLabel("Roll No");
        id12.setBounds(50,420,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id12.setForeground(Color.BLACK);
        f.add(id12);

        t11=new JTextField();   
        t11.setBounds(200,420,150,30);
        f.add(t11);

        lab=new JLabel("Course");
        lab.setBounds(400,420,150,30);
	lab.setFont(new Font("serif",Font.BOLD,20));
        lab.setForeground(Color.BLACK);
        f.add(lab);
            
        t13=new JTextField();   
        t13.setBounds(600,420,150,30);
        f.add(t13);
        
        lab2=new JLabel("Branch");
        lab2.setBounds(50,470,150,30);
	lab2.setFont(new Font("serif",Font.BOLD,20));
        lab2.setForeground(Color.BLACK);
        f.add(lab2);
            
        t14=new JTextField();   
        t14.setBounds(200,470,150,30);
        f.add(t14);
        
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,520,150,40);
        
        f.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,520,150,40);
        
        f.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        f.getContentPane().setBackground(new Color(13, 20, 164));
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
     
        if(ae.getSource()==b){
            try{
                conn con = new conn();
                String str = "update student set name='"+t1.getText()+"',fathers_name='"+t2.getText()+"',age='"+t3.getText()+"', dob='"+t4.getText()+"',address='"+t5.getText()+"',phone='"+t6.getText()+"',email='"+t7.getText()+"',class_x='"+t8.getText()+"',class_xii='"+t9.getText()+"',course='"+t13.getText()+"',branch='"+t14.getText()+"' where rollno='"+this.rollNo+"'";
                con.st.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                f.setVisible(false);
              
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==b1){
            f.setVisible(false);

        }
        if(ae.getSource() == b2){
            try{
                conn con = new conn();
                String str = "select * from student where rollno = '"+this.rollNo+"'";
                ResultSet rs = con.st.executeQuery(str);

                if(rs.next()){
                    f.setVisible(true);
            
                    t1.setText(rs.getString("name"));
                    t2.setText(rs.getString("fathers_name"));
                    t3.setText(rs.getString("age"));
                    t4.setText(rs.getString("dob"));
                    t5.setText(rs.getString("address"));
                    t6.setText(rs.getString("phone"));
                    t7.setText(rs.getString("email"));
                    t8.setText(rs.getString("class_x"));
                    t9.setText(rs.getString("class_xii"));
                    t11.setText(rs.getString("rollno"));
                    t13.setText(rs.getString("course"));
                    t14.setText(rs.getString("branch"));
                }

                
            }catch(Exception ex){}
        
            f.setVisible(true);
            f.setSize(900,650);
            f.setLocation(450,250);
        }
    }

}