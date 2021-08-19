
package studentdbms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class StudentProject extends JFrame implements ActionListener{
    private String rollNo;
    StudentProject(String rollNumber)
    {
        super("Student Database Management System");
        getContentPane().setBackground(Color.BLACK);
        setSize(1850,1000);
        
        this.rollNo = rollNumber;
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/iiitk.png"));
        Image i3 = ic.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        l1.setBounds(400, 300, 300, 300);
        add(l1);
        
        JLabel l2 = new JLabel("STUDENT");
        l2.setFont(new Font("serif", Font.ITALIC, 40));
        l2.setBounds(900, 400, 500, 50);
        l2.setForeground(Color.RED);
        add(l2);
        
        JMenuBar mb  = new JMenuBar();
        
        
        JMenu exam = new JMenu("Examination Details");
        JMenuItem c1 = new JMenuItem("Sem1");
        JMenuItem c2 = new JMenuItem("Sem2");
        JMenuItem c3 = new JMenuItem("Sem3");
        JMenuItem c4 = new JMenuItem("Sem4");
        JMenuItem c5 = new JMenuItem("Sem5");
        JMenuItem c6 = new JMenuItem("Sem6");
        JMenuItem c7 = new JMenuItem("Sem7");
        JMenuItem c8 = new JMenuItem("Sem8");
       
        exam.setForeground(Color.BLUE);
        
        c1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon30 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon16.png"));
        Image image31 = icon30.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c1.setIcon(new ImageIcon(image31));
        c1.setMnemonic('B');
        c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        c1.setBackground(Color.WHITE);
        exam.add(c1);
        c1.addActionListener(this);
        
        c2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon31 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon16.png"));
        Image image32 = icon31.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c2.setIcon(new ImageIcon(image32));
        c2.setMnemonic('P');
        c2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        c2.setBackground(Color.WHITE);
        exam.add(c2);
        c2.addActionListener(this);
        
        c3.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon32 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon16.png"));
        Image image33 = icon32.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c3.setIcon(new ImageIcon(image33));
        c3.setMnemonic('F');
        c3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
        c3.setBackground(Color.WHITE);
        exam.add(c3);
        c3.addActionListener(this);
        
        c4.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon33 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon16.png"));
        Image image34 = icon33.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c4.setIcon(new ImageIcon(image34));
        c4.setMnemonic('G');
        c4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        c4.setBackground(Color.WHITE);
        exam.add(c4);
        c4.addActionListener(this);
        
        c5.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon34 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon16.png"));
        Image image35 = icon34.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c5.setIcon(new ImageIcon(image35));
        c5.setMnemonic('H');
        c5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
        c5.setBackground(Color.WHITE);
        exam.add(c5);
        c5.addActionListener(this);
        
        c6.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon35 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon16.png"));
        Image image36 = icon35.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c6.setIcon(new ImageIcon(image36));
        c6.setMnemonic('I');
        c6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        c6.setBackground(Color.WHITE);
        exam.add(c6);
        c6.addActionListener(this);
        
        c7.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon36 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon16.png"));
        Image image37 = icon36.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c7.setIcon(new ImageIcon(image37));
        c7.setMnemonic('J');
        c7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, ActionEvent.CTRL_MASK));
        c7.setBackground(Color.WHITE);
        exam.add(c7);
        c7.addActionListener(this);
        
        c8.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon37 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon16.png"));
        Image image38 = icon37.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c8.setIcon(new ImageIcon(image38));
        c8.setMnemonic('K');
        c8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, ActionEvent.CTRL_MASK));
        c8.setBackground(Color.WHITE);
        exam.add(c8);
        c8.addActionListener(this);
        
        
        JMenu report = new JMenu("Update Details");
        JMenuItem r1 = new JMenuItem("Update Student");
        report.setForeground(Color.RED);
        
        r1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon5.png"));
        Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('Q');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);
        
        r1.addActionListener(this);  
        
        
        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web Browser");
        utility.setForeground(Color.RED); 
        
        ut1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon18 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon9.png"));
        Image image19 = icon18.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image19));
        ut1.setMnemonic('N');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);
        
        ut2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon20 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon10.png"));
        Image image21 = icon20.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image21));
        ut2.setMnemonic('C');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);
        
        ut3.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon11.png"));
        Image image10 = icon10.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('W');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);
        
        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);
        
        JMenu about = new JMenu("About");
        JMenuItem aboutus = new JMenuItem("About Us");
        JMenuItem routine = new JMenuItem("About Classes");
        about.setForeground(Color.BLUE);
        
        aboutus.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon21 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon13.jpg"));
        Image image22 = icon21.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        aboutus.setIcon(new ImageIcon(image22));
        aboutus.setMnemonic('A');
        aboutus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        aboutus.setBackground(Color.WHITE);
        about.add(aboutus);
        aboutus.addActionListener(this);
        
        routine.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon22 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon13.jpg"));
        Image image23 = icon22.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        routine.setIcon(new ImageIcon(image23));
        routine.setMnemonic('R');
        routine.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        routine.setBackground(Color.WHITE);
        about.add(routine);
        routine.addActionListener(this);

        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        JMenuItem logout = new JMenuItem("Log Out");
        exit.setForeground(Color.RED);
        

        ex.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon12.png"));
        Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('X');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE); 
        ex.addActionListener(this);
        
        logout.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon12 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon12.png"));
        Image image12 = icon12.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        logout.setIcon(new ImageIcon(image12));
        logout.setMnemonic('X');
        logout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
        logout.setBackground(Color.WHITE);
        logout.addActionListener(this);
        
        report.add(r1);
        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);
        exit.add(logout);
        exit.add(ex);
         
        mb.add(exam);
        mb.add(report);
        mb.add(utility);
        mb.add(about);
        mb.add(exit);
        
        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(null);
        setVisible(false);
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("Update Student")){
            new UpdateYourself(this.rollNo);
            
        }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){ }
        
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){ }
        
        }else if(msg.equals("Web Browser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
            }catch(Exception e){ }
        
        }else if(msg.equals("Exit")){
            System.exit(0);
        
        }else if(msg.equals("Log Out")){
            new Login().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(false);
            
        }else if(msg.equals("About Us")){
            new AboutUs();
        
        }else if(msg.equals("About Classes")){
            new Routine();
            
        }else if(msg.equals("Sem1")){
            new Marks(this.rollNo, "SEM1");
        
        }else if(msg.equals("Sem2")){
            new Marks(this.rollNo, "SEM2");
        
        }else if(msg.equals("Sem3")){
            new Marks(this.rollNo, "SEM3");
        
        }else if(msg.equals("Sem4")){
            new Marks(this.rollNo, "SEM4");
        
        }else if(msg.equals("Sem5")){
            new Marks(this.rollNo, "SEM5");
        
        }else if(msg.equals("Sem6")){
            new Marks(this.rollNo, "SEM6");
        
        }else if(msg.equals("Sem7")){
            new Marks(this.rollNo, "SEM7");
        
        }else if(msg.equals("Sem8")){
            new Marks(this.rollNo, "SEM8");
        }
    }
    
}
