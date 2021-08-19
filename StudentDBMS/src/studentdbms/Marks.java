
package studentdbms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Marks extends JFrame{
    JTextArea t1;
   
   Marks(String str, String semNum){
       setVisible(true);
       setSize(500,750);
       setLayout(new BorderLayout());
       
       t1 = new JTextArea(50,15);
       t1.setBackground(new Color(13, 20, 164));
       t1.setForeground(new Color(219, 33, 6));
       JScrollPane jsp = new JScrollPane(t1);
       t1.setFont(new Font("Senserif",Font.ITALIC,18));
       
       add(jsp,"Center");
       
       setLocation(450,100);
       mark(str, semNum);
   }
   
   
   public void mark(String s, String semID){
    try{
           conn c = new conn();
           boolean flag = true;
           ResultSet rs = c.st.executeQuery("select * from "+semID+" where rollno="+s);
           
           if(rs.next()){
               t1.setText("\tResult of Examination\n\nSubject\n");
               t1.append("\n\t"+rs.getString("subject1"));
               t1.append("\n\t"+rs.getString("subject2"));
               t1.append("\n\t"+rs.getString("subject3"));
               t1.append("\n\t"+rs.getString("subject4"));
               t1.append("\n\t"+rs.getString("subject5"));
               t1.append("\n\t"+rs.getString("subject6"));
               t1.append("\n\t"+rs.getString("subject7"));
               t1.append("\n\t"+rs.getString("subject8"));
               t1.append("\n-----------------------------------------");
               t1.append("\n");
               t1.append("\nMarks\n\n\t"+rs.getString("marks1"));
               t1.append("\n\t"+rs.getString("marks2"));
               t1.append("\n\t"+rs.getString("marks3"));
               t1.append("\n\t"+rs.getString("marks4"));
               t1.append("\n\t"+rs.getString("marks5"));
               t1.append("\n\t"+rs.getString("marks6"));
               t1.append("\n\t"+rs.getString("marks7"));
               t1.append("\n\t"+rs.getString("marks8"));
               t1.append("\n-----------------------------------------");
               t1.append("\n");
               flag = false;
           }
           
           ResultSet rs1 = c.st.executeQuery("select * from gpa where rollno='"+s+"'");
           
           if(rs1.next() && !flag){
               t1.append("\nSGPA       :         "+rs1.getString(semID));
               t1.append("\nCGPA       :         "+rs1.getString("cgpa")+"\n");
           }
           
           if(flag)
           {
               t1.append("\n\tNo records of this person\n\tis available.\n");
           }
         
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
}
