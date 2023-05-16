package todolist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    JButton sign, add;
    
    Home() {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("ToDo LIST");
        heading.setBounds(220, 100, 400, 40);
        heading.setFont(new Font("DEBANSHU", Font.BOLD, 35));
        heading.setForeground(Color.BLACK);
        image.add(heading);
        
        add = new JButton("Login");
        add.setBounds(150, 200, 150, 40);
        add.setBackground(Color.GRAY);
        add.setForeground(Color.WHITE);

        add.addActionListener(this);
        image.add(add);
        
        sign = new JButton("SingUp");
        sign.setBounds(320, 200, 150, 40);
        sign.setBackground(Color.GRAY);
        sign.setForeground(Color.WHITE);

        sign.addActionListener(this);
        image.add(sign);
        
         
        
        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new Login();
        } else if (ae.getSource() == sign) {
            setVisible(false);
            new SignUp();
        } else {
        	System.out.println("Debanshu is waiting for you...");
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}