
package studentdbms;
import java.awt.*;
import javax.swing.*;


public class AboutUs extends JFrame{
    private JPanel contentPane;

        public AboutUs() {
            
            super("About Us");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 600);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/building.png"));
            Image i2 = i1.getImage().getScaledInstance(250, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(400, 40, 250, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Student");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(140, 40, 200, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("DB Mangement");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("v1.0");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : Aman Pratap Singh And");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 190, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("                       Harsh Raj");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l7.setBounds(70, 240, 600, 35);
            contentPane.add(l7);
            
            JLabel l8 = new JLabel("Roll Number - 19013 And 19032");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Contact : 440_bt19@iiitkalyani.ac.in And ");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l9.setBounds(70, 340, 600, 34);
            contentPane.add(l9);

            JLabel l10 = new JLabel("                459_bt19@iiitkalyani.ac.in ");
            l10.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l10.setBounds(70, 390, 600, 34);
            contentPane.add(l10);

            JLabel l11 = new JLabel("Education - Persuing B.Tech (CSE)");
            l11.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l11.setBounds(70, 440, 600, 34);
            contentPane.add(l11);


            JLabel l12 = new JLabel("Phone - +91 123456");
            l12.setForeground(new Color(47, 79, 79));
            l12.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l12.setBounds(70, 490, 600, 34);
            contentPane.add(l12);  
            contentPane.setBackground(Color.WHITE);
            setVisible(true);
	}

}
