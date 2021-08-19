
package studentdbms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;


public class EnterMarks extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17;
    JButton b1;
    JComboBox cb1;

    EnterMarks()
    {
        setSize(500,600);
        setLocation(400,200);
        setLayout(null);

        l1 = new JLabel("Enter marks of Student");
        l1.setFont(new Font("serif", Font.BOLD, 30));
        l1.setBounds(50,0,500,80);
        add(l1);

        l2 = new JLabel("Enter Roll Number");
        l2.setBounds(50,70,200,40);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(180,80,200,20);
        add(t1);
        
        l5 = new JLabel("Choose Semester");
        l5.setBounds(50,100,200,40);
        add(l5);
        
        String[] sem = {"SEM1", "SEM2", "SEM3", "SEM4", "SEM5", "SEM6", "SEM7", "SEM8"};
        cb1 = new JComboBox(sem);
        cb1.setBackground(Color.WHITE);
        cb1.setBounds(180,110,200,20);
        add(cb1);

        l3 = new JLabel("Enter Subject");
        l3.setBounds(50,150,200,40);
        add(l3);

        l4 = new JLabel("Enter Marks");
        l4.setBounds(250,150,200,40);
        add(l4);

        t2 = new JTextField();
        t2.setBounds(50,200,200,20);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(250,200,200,20);
        add(t3);

        t4 = new JTextField();
        t4.setBounds(50,230,200,20);
        add(t4);

        t5 = new JTextField();
        t5.setBounds(250,230,200,20);
        add(t5);

        t6 = new JTextField();
        t6.setBounds(50,260,200,20);
        add(t6);

        t7 = new JTextField();
        t7.setBounds(250,260,200,20);
        add(t7);

        t8 = new JTextField();
        t8.setBounds(50,290,200,20);
        add(t8);

        t9 = new JTextField();
        t9.setBounds(250,290,200,20);
        add(t9);

        t10 = new JTextField();
        t10.setBounds(50,320,200,20);
        add(t10);

        t11 = new JTextField();
        t11.setBounds(250,320,200,20);
        add(t11);
        
        t12 = new JTextField();
        t12.setBounds(50,350,200,20);
        add(t12);

        t13 = new JTextField();
        t13.setBounds(250,350,200,20);
        add(t13);
        
        t14 = new JTextField();
        t14.setBounds(50,380,200,20);
        add(t14);

        t15 = new JTextField();
        t15.setBounds(250,380,200,20);
        add(t15);
        
        t16 = new JTextField();
        t16.setBounds(50,410,200,20);
        add(t16);

        t17 = new JTextField();
        t17.setBounds(250,410,200,20);
        add(t17);
        
        JLabel l7 = new JLabel("Write <Subject_Code>:<Credit> as subject name.");
        l7.setBounds(60, 440, 600, 25);
        add(l7);
        
        l6 = new JLabel("Use this for grades to marks: EX>> 10 | A >>9 | B >>8 | C >>7 | D >>6 | F >>4");
        l6.setBounds(50, 475, 650, 25);
        add(l6);
        
        b1 = new JButton("Submit");
        b1.setBounds(50,510,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b1.addActionListener(this);

        getContentPane().setBackground(Color.CYAN);
        setVisible(true);
    }
    
    Double calc_sgpa(ArrayList<Double> val, ArrayList<Double> cred)
    {
        Double sum = 0.0, tCred = 0.0;
        for(int i=0; i<val.size(); i++)
        {
            sum+= val.get(i)*cred.get(i);
            tCred+= cred.get(i);
        }
        sum = sum/tCred;
        return sum;
    }
    
    Double calc_cgpa(Double c, Double ct, Double s)
    {
        return ((c*ct)+s)/(ct+1);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== b1)
        {
            try {
                conn c1 = new conn();
                ResultSet check = c1.st.executeQuery("select rollno from gpa where rollno='"+t1.getText()+"'");
                if(check.next())
                {
                    String semVal = (String)cb1.getSelectedItem();
                    ArrayList<Double> mark = new ArrayList<>();
                    ArrayList<Double> credit = new ArrayList<>();
               
                    if(!(t3.getText().equals("")))
                    {
                        mark.add(Double.valueOf(t3.getText()));
                        credit.add(Double.valueOf(t2.getText().split("\\:")[1]));
                    }
                    if(!(t5.getText().equals("")))
                    {
                        mark.add(Double.valueOf(t5.getText()));
                        credit.add(Double.valueOf(t4.getText().split("\\:")[1]));
                    }
                    if(!(t7.getText().equals("")))
                    {
                        mark.add(Double.valueOf(t7.getText()));
                        credit.add(Double.valueOf(t6.getText().split("\\:")[1]));
                    }
                    if(!(t9.getText().equals("")))
                    {
                        mark.add(Double.valueOf(t9.getText()));
                        credit.add(Double.valueOf(t8.getText().split("\\:")[1]));
                    }
                    if(!(t11.getText().equals("")))
                    {
                        mark.add(Double.valueOf(t11.getText()));
                        credit.add(Double.valueOf(t10.getText().split("\\:")[1]));
                    }
                    if(!(t13.getText().equals("")))
                    {
                        mark.add(Double.valueOf(t13.getText()));
                        credit.add(Double.valueOf(t12.getText().split("\\:")[1]));
                    }
                    if(!(t15.getText().equals("")))
                    {
                        mark.add(Double.valueOf(t15.getText()));
                        credit.add(Double.valueOf(t14.getText().split("\\:")[1]));
                    }
                    if(!(t17.getText().equals("")))
                    {
                        mark.add(Double.valueOf(t17.getText()));
                        credit.add(Double.valueOf(t16.getText().split("\\:")[1]));
                    }
                
                    ResultSet rs = c1.st.executeQuery("select * from gpa where rollno='"+t1.getText()+"'");
                    if(rs.next())
                    {
                        Double sgpa, cgpa, count;
                        sgpa = calc_sgpa(mark, credit);
                        cgpa = Double.valueOf(rs.getString("cgpa"));
                    
                        count = Double.valueOf(rs.getString("count"));
                        cgpa = calc_cgpa(cgpa, count, sgpa);
                    
                        c1.st.executeUpdate("update gpa set "+semVal+"='"+String.format("%.2f", sgpa)+"', cgpa='"+String.format("%.2f", cgpa)+"', count='"+Double.toString(count+1)+"' where rollno='"+t1.getText()+"'");
                    }
                
                    String s1 = "insert into "+semVal+" values('"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+t8.getText()+"','"+t9.getText()+"','"+t10.getText()+"','"+t11.getText()+"','"+t12.getText()+"','"+t13.getText()+"','"+t14.getText()+"','"+t15.getText()+"','"+t16.getText()+"','"+t17.getText()+"','"+t1.getText()+"')";
                    c1.st.executeUpdate(s1);
                
                    JOptionPane.showMessageDialog(null,"Marks Inserted Successfully");
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Student with entered roll does not exist. Please create first.");
                    setVisible(false);
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Sorry, an error occured!");
                System.out.println(e);

            }
        }
    }

}
