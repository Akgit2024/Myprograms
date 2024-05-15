package customer;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

import jdbc.SqlInitiator;

public class Cust implements ActionListener{

	JFrame jf;
	JLabel j1;
	JLabel background;
	JMenuBar customer;
	JMenuItem login,signin,exit;
	
	public Cust () {
	jf = new JFrame("");
        jf.getContentPane().setBackground(Color.WHITE);
        jf.setBounds(600, 210, 730, 600);

        j1 = new JLabel("CUSTOMER");
        j1.setBounds(200, 10, 300, 120);
        j1.setFont(new Font("Times New Roman", Font.BOLD, 44));
        j1.setForeground(new Color(199, 43, 38));
        j1.setHorizontalAlignment(SwingConstants.CENTER);
        jf.add(j1);

        JLabel background = new JLabel(new ImageIcon("C:\\Users\\akhil\\eclipse-workspace\\Customer\\src\\icons\\Customer.png"));
        background.setBounds(0, 160, 420, 660);
        jf.add(background);

        JMenuBar menuBar = new JMenuBar();

        JMenu optionsMenu = new JMenu("Customer");

        login = new JMenuItem("Login");
        login.addActionListener(this);
        optionsMenu.add(login);

        signin = new JMenuItem("Sign-in");
        signin.addActionListener(this);
        optionsMenu.add(signin);

        exit = new JMenuItem("Exit");
        exit.addActionListener(this);
        optionsMenu.add(exit);

        menuBar.add(optionsMenu);

        jf.setJMenuBar(menuBar);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}
	
	public static void main(String a[]) {
		new Cust();
		new SqlInitiator().initDatabase();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login) {
			new Login();  //when an action performed on login button an event occurs
			jf.setVisible(false);
			
		}else if(e.getSource() == signin) {
			new Signin();
			jf.setVisible(false);
		}else{
			jf.setVisible(false); //to exit the page
			
		}
	
	}

}
