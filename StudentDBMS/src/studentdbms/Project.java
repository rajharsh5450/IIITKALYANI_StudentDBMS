
package studentdbms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Project extends JFrame implements ActionListener{
    Project()
    {
        super("Student Database Management System");
        getContentPane().setBackground(Color.BLACK);
        setSize(1850,1000);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/iiitk.png"));
        Image i3 = ic.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        l1.setBounds(400, 300, 300, 300);
        add(l1);
        
        JLabel l2 = new JLabel("ADMIN");
        l2.setFont(new Font("serif", Font.ITALIC, 40));
        l2.setBounds(900, 400, 500, 50);
        l2.setForeground(Color.RED);
        add(l2);
        
        JMenuBar mb  = new JMenuBar();
        
        JMenu master = new JMenu("Master");
        JMenuItem m1 = new JMenuItem("New Student Admission");
        master.setForeground(Color.BLUE);
            
        m1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image2));
        m1.setMnemonic('S');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
    
        m1.addActionListener(this);
        

        JMenu user = new JMenu("Details");
        JMenuItem u1 = new JMenuItem("Student Details");
        JMenuItem u2 = new JMenuItem("UserLogin Details");
        user.setForeground(Color.RED);
        
        u1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon3.png"));
        Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('D');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        u1.addActionListener(this);    
                
        u2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon3.png"));
        Image image5 = icon5.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image5));
        u2.setMnemonic('L');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);
        u2.addActionListener(this);

        
        JMenu exam = new JMenu("Examination");
        JMenuItem c1 = new JMenuItem("Examination Details");
        JMenuItem c2 = new JMenuItem("Enter Marks");
        JMenuItem c3 = new JMenuItem("Grade Details");
        exam.setForeground(Color.BLUE);
        
        c1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon30 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon16.png"));
        Image image31 = icon30.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c1.setIcon(new ImageIcon(image31));
        c1.setMnemonic('E');
        c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        c1.setBackground(Color.WHITE);
        exam.add(c1);
        
        c2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon32 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon17.png"));
        Image image33 = icon32.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c2.setIcon(new ImageIcon(image33));
        c2.setMnemonic('M');
        c2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        c2.setBackground(Color.WHITE);
        exam.add(c2);
        
        c3.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon33 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon17.png"));
        Image image34 = icon33.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c3.setIcon(new ImageIcon(image34));
        c3.setMnemonic('M');
        c3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
        c3.setBackground(Color.WHITE);
        exam.add(c3);
        
        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        
        JMenu report = new JMenu("Update Details");
        JMenuItem r1 = new JMenuItem("Update Students");
        report.setForeground(Color.RED);
        
        r1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/icon5.png"));
        Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('U');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
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
        
        master.add(m1);
        user.add(u1);
        user.add(u2);
        report.add(r1);
        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);
        exit.add(logout);
        exit.add(ex);
         
        mb.add(master);
        mb.add(user);
        mb.add(exam);
        mb.add(report);
        mb.add(utility);
        mb.add(about);
        mb.add(exit);
        
        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("New Student Admission")){
            new AddStudent();
            
        }else if(msg.equals("Student Details")){
            new StudentDetails();
            
        }else if(msg.equals("UserLogin Details"))
        {
            new LoginDetails();
            
        }else if(msg.equals("Update Students")){
            new UpdateStudent();  
        
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
            
        }else if(msg.equals("Examination Details")){
            new ExaminationDetails();
        
        }else if(msg.equals("Enter Marks")){
            new EnterMarks();
            
        }else if(msg.equals("Grade Details")){
            new Score("rollno");
        }
    }
    
}
