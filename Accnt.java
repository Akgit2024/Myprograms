package customer;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import jdbc.SqlInitiator;

@SuppressWarnings("serial")
public class Accnt extends JFrame implements ActionListener {
	
	JLabel j1;
	ResultSet resultSet;
	JMenuBar Accntdetail;
	JMenuItem deposit,withdrawal,balance,exit;
	
	public Accnt() {
		setLayout(null);
		this.resultSet = SqlInitiator.resultSet;
		getContentPane().setBackground(Color.WHITE);
		
		j1 = new JLabel("ACCOUNT DETAILS");
	    j1.setBounds(70,0,500,120);
	    j1.setFont(new Font("Times New Roman",Font.BOLD,34));
	    j1.setForeground(new Color(35, 24, 112));
	    j1.setOpaque(false);
	    
	    j1.setHorizontalAlignment(SwingConstants.CENTER);
	    add(j1);
	    
	    JLabel background = new JLabel(new ImageIcon("C:\\Users\\akhil\\eclipse-workspace\\Customer\\src\\icons\\account.png"));
        background.setBounds(110, 30, 420, 600);
        add(background);
	    
	    JMenuBar Accntdetail = new JMenuBar();

        JMenu optionsMenu = new JMenu("Account Details");
	    
	    deposit = new JMenuItem("Amount Deposit");
	    deposit.addActionListener(this);
        optionsMenu.add(deposit);
        
        withdrawal = new JMenuItem("Amount Withdrawal");
        withdrawal.addActionListener(this);
        optionsMenu.add(withdrawal);
        
        balance = new JMenuItem("Check Balance");
        balance.addActionListener(this);
        optionsMenu.add(balance);
        
        exit = new JMenuItem("Exit");
        exit.addActionListener(this);
        optionsMenu.add(exit);
        
	    
	    try {
			System.out.println(resultSet.getString("Name"+""));
			System.out.println(resultSet.getInt(""+"Amount_deposit"));
			System.out.println(resultSet.getInt(""+"Amount_withdrawal"));
			System.out.println(resultSet.getInt(""+"Balance"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	    Accntdetail.add(optionsMenu);
	    setJMenuBar(Accntdetail);
	    
	    setBounds(600,200,660,610);
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	}
	
	public static void main (String a[]) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == deposit) {
			setVisible(false);
			new Deposit();
		}else if(e.getSource() == withdrawal) {
			setVisible (false);
			new Withdrawal();
			
		}else if(e.getSource() == balance) {
			try {
			Integer balance = SqlInitiator.resultSet.getInt("Balance");
			 JOptionPane.showMessageDialog(this, "Balance: "+balance+"");
			}catch(Exception ex) {
				
			}
		}else {
			setVisible(false);
			new Cust();
		}
	}

}
