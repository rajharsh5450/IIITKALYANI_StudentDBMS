
package studentdbms;
import java.awt.*;
import javax.swing.*;


public class StudentDBMS {
    
    public static void main(String[] args) {
        Frame f= new Frame();
        f.setVisible(true);
        int i, x=1;
        for (i = 2; i < 600; i+=4, x+=1) {
            f.setLocation((700- ((x+i)/2)), (350-(i/2)));
            f.setSize(i+3*x, i+x/2);
            
            try {
                Thread.sleep(10);
            } catch (Exception e) {}
        }
        
    }
}


class Frame extends JFrame implements Runnable
{
    Thread t1;
    Frame()
    {
        super("Student Database Management");
        setLayout(null);
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/iiitk.png"));
        Image i3 = ic.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        l1.setBounds(150, 200, 300, 300);
        add(l1);
        
        JLabel l2 = new JLabel("STUDENT   DATABASE   MANAGEMENT ");
        l2.setFont(new Font("serif", Font.ITALIC, 26));
        l2.setBounds(500, 300, 500, 50);
        l2.setForeground(Color.RED);
        add(l2);
        
        JLabel l3 = new JLabel("                     SYSTEM      ");
        l3.setFont(new Font("serif", Font.ITALIC, 26));
        l3.setBounds(500, 400, 500, 50);
        l3.setForeground(Color.RED);
        add(l3);
        
        getContentPane().setBackground(new Color(46, 53, 124));
        
        t1= new Thread(this);
        t1.start();
    }
    
    public void run()
    {
        try {
            Thread.sleep(5000);
            this.setVisible(false);
            Login lg = new Login();
            lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}