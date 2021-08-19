
package studentdbms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;


public class ExaminationDetails extends JFrame implements ActionListener{
    private JPanel contentPane;
    private JTable table;
    private JTextField search;
    private JButton b1;
    private JComboBox cb1;

   
    public void Book() {
        try {
            conn conection = new conn();
            String sql = "select * from student";
            PreparedStatement stmt = conection.con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            stmt.close();
            conection.con.close();
        } catch (Exception e) {}

    }

   public ExaminationDetails() {

        setBounds(250, 200, 930, 475);
        setBackground(Color.YELLOW);
        contentPane = new JPanel();
        contentPane.setBackground(Color.CYAN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(79, 133, 1080, 282);
        contentPane.add(scrollPane);

        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
               int row = table.getSelectedRow();
               search.setText(table.getModel().getValueAt(row, 9).toString());
            }
        });
       
        table.setBackground(new Color(240, 248, 255));
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        scrollPane.setViewportView(table);
        
        String[] sem = {"SEM1", "SEM2", "SEM3", "SEM4", "SEM5", "SEM6", "SEM7", "SEM8"};
        cb1 = new JComboBox(sem);
        cb1.setBackground(Color.WHITE);
        cb1.setBounds(565, 89, 120, 33);
        contentPane.add(cb1); 
        
        b1 = new JButton("Result");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(255, 20, 147), 2, true));
        b1.setForeground(new Color(199, 21, 133));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b1.setBounds(700, 89, 120, 33);
        contentPane.add(b1);

       
        JLabel l1 = new JLabel("Check Result");
        l1.setForeground(new Color(107, 142, 35));
        l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
        l1.setBounds(300, 15, 400, 47);
        contentPane.add(l1);

       
        search = new JTextField();
        search.setBackground(new Color(255, 240, 245));
        search.setBorder(new LineBorder(new Color(255, 105, 180), 2, true));
        search.setForeground(new Color(47, 79, 79));
        search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        search.setBounds(189, 89, 357, 33);
        contentPane.add(search);
        search.setColumns(10);

        JLabel l3 = new JLabel("Back");
        l3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
            }
        });
        l3.setForeground(Color.DARK_GRAY);
        l3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        l3.setBounds(97, 89, 72, 33);
        contentPane.add(l3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3, true), "Book-Details",
        TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
        panel.setBounds(67, 54, 1100, 368);
        contentPane.add(panel);
        panel.setBackground(Color.WHITE);
        Book();
        setSize(1200,500);
        setVisible(true);
    }
   
    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource() == b1){ 
                String semVal= (String)cb1.getSelectedItem();
                new Marks(search.getText(), semVal);
            };
        }
        catch(Exception e){}
    }
    
}
