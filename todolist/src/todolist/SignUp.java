package todolist;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SignUp extends JFrame implements ActionListener {
	JTextField tfusername, tfpassword,tfemail;
	JButton sign;
	SignUp(){
		getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 30);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 30);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 30);
        add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(150, 70, 150, 30);
        add(tfpassword);
        
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(40, 120, 100, 30);
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(150, 120, 150, 30);
        add(tfemail);
        
         sign = new JButton("SingUp");
       sign.setBounds(150, 170, 150, 30);
        sign.setBackground(Color.BLACK);
        sign.setForeground(Color.WHITE);
        sign.addActionListener(this);
        add(sign);
        
        //ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        //Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        //ImageIcon i3 = new ImageIcon(i2);
       // JLabel image = new JLabel(i3);
        //image.setBounds(350, 0, 200, 200);
       // add(image);
        
        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
    }
    
	
 


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==sign) {
			String username = tfusername.getText();
            String password1 = tfpassword.getText();
            String email=tfemail.getText();
            
            try {
                Conn conn = new Conn();
                String query = "insert into signup values('"+username+"', '"+password1+"', '"+email+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Login();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else {
            setVisible(false);
            JOptionPane.showMessageDialog(null, "Thanks for using My ToDo List");
        }

		}
		
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
   new SignUp();
}
}