package customer;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import jdbc.SqlInitiator;

public class Withdrawal extends JFrame implements ActionListener{
	JTextField depo;
	JLabel d1;
	JButton d2;
	JMenuItem optionsMenu;
	
	public Withdrawal() {
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JMenuBar menuBar = new JMenuBar();
		optionsMenu = new JMenuItem("Back");
		optionsMenu.addActionListener(this);
		menuBar.add(optionsMenu);
		setJMenuBar(menuBar);
		
		d1 = new JLabel("Withdraw: ");
		d1.setBounds(60,100,250,30);
		d1.setFont(new Font("Times New Roman",Font.BOLD,25));
		d1.setForeground(Color.BLACK);
		d1.setOpaque(false);
		
		d1.setHorizontalAlignment(SwingConstants.CENTER);
		add(d1);
		
		depo = new JTextField("");
		depo.setBounds(330,100,250,30);
		depo.setFont(new Font("Times New Roman",Font.BOLD,25));
		depo.setForeground(Color.BLACK);
		depo.setOpaque(false);
	    
		depo.setHorizontalAlignment(SwingConstants.CENTER);
	    add(depo);
	    
	    d2 = new JButton("Withdraw");
	    d2.setBounds(210, 280, 150, 40);
	    d2.addActionListener(this);
	    d2.setFont(new Font("Times New Roman",Font.BOLD,25));
	    d2.setBackground(Color.BLACK);
	    d2.setForeground(Color.WHITE);
        add(d2);
	    
	    d2.setHorizontalAlignment(SwingConstants.CENTER);
	    add(d2);
		
		setBounds(600,200,660,410);
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == d2) {
			ResultSet resultSet = SqlInitiator.resultSet;
			try {
				Integer widrawal = resultSet.getInt("Amount_deposit") - Integer.parseInt(depo.getText());
				String sqlQuery = "UPDATE customer SET Balance = " + widrawal + ", Amount_withdrawal = " + Integer.parseInt(depo.getText()) + " WHERE name = '" + resultSet.getString("Name") + "'";
				SqlInitiator.updateDatabase(sqlQuery);
				 JOptionPane.showMessageDialog(this, "Amount withdrawn successfully !!");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(e.getSource() == optionsMenu) {
			setVisible(false);
			new Accnt();
		}
		
	}
}
	
