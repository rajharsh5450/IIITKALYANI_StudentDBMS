
package studentdbms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Score extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTable t1;
    JButton b1;
    JComboBox cb1;
    String x[] = {"Sem1(sgpa)","Sem2(sgpa)","Sem3(sgpa)","Sem4(sgpa)","Sem5(sgpa)","Sem6(sgpa)","Sem7(sgpa)","Sem8(sgpa)", "CGPA","Roll No"};
    String y[][] = new String[50][10];
    int i=0, j=0;
    Score(String sortVal){
        super("Grade Point Details");
        setSize(1260,600);
        setLocation(150,150);
        setLayout(null);
        setVisible(true);
        
        l1 = new JLabel("Sort by : ");
        l1.setBounds(50,500,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        l1.setForeground(Color.BLACK);
        add(l1);
        
        String[] sem = {"SEM1", "SEM2", "SEM3", "SEM4", "SEM5", "SEM6", "SEM7", "SEM8", "cgpa", "rollno"};
        cb1 = new JComboBox(sem);
        cb1.setBackground(Color.CYAN);
        cb1.setForeground(Color.RED);
        cb1.setBounds(400,500,200,30);
        add(cb1);
        
        b1 = new JButton("Sort");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 500, 100 ,30);
        add(b1);
                   
        b1.addActionListener(this);
        
        try{
            conn c1  = new conn();
            String s1 = "select * from gpa order by "+sortVal+" DESC";
            ResultSet rs  = c1.st.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("SEM1");
                y[i][j++]=rs.getString("SEM2");
                y[i][j++]=rs.getString("SEM3");
                y[i][j++]=rs.getString("SEM4");
                y[i][j++]=rs.getString("SEM5");
                y[i][j++]=rs.getString("SEM6");
                y[i][j++]=rs.getString("SEM7");
                y[i][j++]=rs.getString("SEM8");
                y[i][j++]=rs.getString("cgpa");
                y[i][j++]=rs.getString("rollno");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            t1.setBackground(Color.CYAN);
            t1.setForeground(Color.RED);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,400);
        add(sp);
        
        getContentPane().setBackground(new Color(13, 20, 164));
        
    }
    public void actionPerformed(ActionEvent ae){
           
        if(ae.getSource() == b1){
                String a = (String)cb1.getSelectedItem();
                this.setVisible(false);
                new Score(a);
                
        }
    }
    
}
