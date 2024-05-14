package customer;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import jdbc.SqlInitiator;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener {
	    JLabel username,password; //defining globally
	    JTextField user,pass;
	    JButton login;
	    
		
		public Login() {
			setLayout(null);
			getContentPane().setBackground(Color.WHITE);
			
			username = new JLabel("Name: ");
			username.setBounds(20,5,230,180);
			username.setFont(new Font("Times New Roman",Font.BOLD,25));
			username.setForeground(Color.BLACK);
			username.setOpaque(false);
		    
			username.setHorizontalAlignment(SwingConstants.CENTER);
		    add(username);
		    
		    user = new JTextField("");
		    user.setBounds(210,75,230,40);
		    user.setFont(new Font("Times New Roman",Font.BOLD,25));
		    user.setForeground(Color.BLACK);
		    user.setOpaque(false);
		    
		    user.setHorizontalAlignment(SwingConstants.CENTER);
		    add(user);
		    
		    password = new JLabel("Password: ");
		    password.setBounds(20,105,230,180);
		    password.setFont(new Font("Times New Roman",Font.BOLD,25));
		    password.setForeground(Color.BLACK);
		    password.setOpaque(false);
		    
		    password.setHorizontalAlignment(SwingConstants.CENTER);
		    add(password);
		    
		    pass = new JPasswordField("");
		    pass.setBounds(210,175,230,40);
		    pass.setFont(new Font("Times New Roman",Font.BOLD,25));
		    pass.setForeground(Color.BLACK);
		    pass.setOpaque(false);
		    
		    pass.setHorizontalAlignment(SwingConstants.CENTER);
		    add(pass);
			
		    login = new JButton("Login");
	        login.setBounds(110, 280, 150, 40);
	        login.addActionListener(this);
	        login.setFont(new Font("Times New Roman",Font.BOLD,25));
	        login.setBackground(Color.BLACK);
	        login.setForeground(Color.WHITE);
	        add(login);
	        
	        
	        JLabel background = new JLabel(new ImageIcon("C:\\Users\\akhil\\eclipse-workspace\\Customer\\src\\icons\\login.jpg"));
	        background.setBounds(480,50,200,220);
	        add(background);
		    
			setBounds(580, 260, 770, 440);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
		public static void main (String a[]) {
			new Login();
		}

	
		public void actionPerformed(ActionEvent e) {

			user.getText();
			pass.getText();
			
			if(e.getSource() == login) {
				if(user.getText().equals("") && pass.getText().equals("")) {
					JOptionPane.showMessageDialog(this, "Please Enter name and Password");
				}else if(!(user.getText().equals("")) && pass.getText().equals("")) {
					JOptionPane.showMessageDialog(this, "Please Enter the Password");
				}else if(user.getText().equals("") && !(pass.getText().equals(""))) {
					JOptionPane.showMessageDialog(this, "Please Enter name");
				}else {
					String sqlQuery = "SELECT * FROM customer WHERE Name = ? AND Password = ?";
					try {
					ResultSet resultSet = SqlInitiator.getUserData(user.getText(),pass.getText(),sqlQuery);
			            if(resultSet.next()) {
			            	JOptionPane.showMessageDialog(this, "Welcome"+" " +user.getText()+"!");
			            	setVisible(false);
			            	new Accnt();
			            }else {
			            	JOptionPane.showMessageDialog(this, "LoginFailed");
			            }		
					}catch(Exception ex) {
						System.out.print(ex.getMessage());
					}
				}
			}
				
			}
		
		
}
