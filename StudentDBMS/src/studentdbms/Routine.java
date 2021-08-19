/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdbms;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Routine extends JFrame{

    Routine() {
        super("Routine");
        setSize(1200, 800);
        setLocation(100, 40);
        setLayout(new FlowLayout());
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("studentdbms/icons/routine.png"));
        Image i3 = ic.getImage().getScaledInstance(1200, 800,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);
        
        getContentPane().setBackground(Color.GRAY);
        setVisible(true);
    }
    
    
}
