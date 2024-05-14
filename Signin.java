package customer;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import jdbc.SqlInitiator;

public class Signin extends JFrame implements ActionListener {
	JLabel custname,dob,mobile,username,password,j1,withdraw,id,bal;
	JTextField name,date,mob,use,pass,with,i,b;
	JButton signin;
	
	public Signin() {
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		j1 = new JLabel("NEW CUSTOMER SIGN-IN");
	    j1.setBounds(70,0,500,120);
	    j1.setFont(new Font("Times New Roman",Font.BOLD,34));
	    j1.setForeground(new Color(25, 87, 35));
	    j1.setOpaque(false);
	    
	    j1.setHorizontalAlignment(SwingConstants.CENTER);
	    add(j1);
		
		custname = new JLabel("Name : ");
		custname.setBounds(50,65,230,180);
		custname.setFont(new Font("Times New Roman",Font.BOLD,22));
		custname.setForeground(Color.BLACK);
		custname.setOpaque(false);
	    
		custname.setHorizontalAlignment(SwingConstants.CENTER);
	    add(custname);
	    
	    name = new JTextField("");
	    name.setBounds(230,140,250,30);
	    name.setFont(new Font("Times New Roman",Font.BOLD,25));
	    name.setForeground(Color.BLACK);
	    name.setOpaque(false);
	    
	    name.setHorizontalAlignment(SwingConstants.CENTER);
	    add(name);
	    
	    dob = new JLabel("Age : ");
	    dob.setBounds(50,135,230,180);
	    dob.setFont(new Font("Times New Roman",Font.BOLD,22));
	    dob.setForeground(Color.BLACK);
	    dob.setOpaque(false);
	    
	    dob.setHorizontalAlignment(SwingConstants.CENTER);
	    add(dob);
	    
	    date = new JTextField("");
	    date.setBounds(230,210,250,30);
	    date.setFont(new Font("Times New Roman",Font.BOLD,25));
	    date.setForeground(Color.BLACK);
	    date.setOpaque(false);
	    
	    date.setHorizontalAlignment(SwingConstants.CENTER);
	    add(date);
	    
	    mobile = new JLabel("Mobile : ");
	    mobile.setBounds(50,205,230,180);
	    mobile.setFont(new Font("Times New Roman",Font.BOLD,22));
	    mobile.setForeground(Color.BLACK);
	    mobile.setOpaque(false);
	    
	    mobile.setHorizontalAlignment(SwingConstants.CENTER);
	    add(mobile);
	    
	    mob = new JTextField("");
	    mob.setBounds(230,280,250,30);
	    mob.setFont(new Font("Times New Roman",Font.BOLD,25));
	    mob.setForeground(Color.BLACK);
	    mob.setOpaque(false);
	    
	    mob.setHorizontalAlignment(SwingConstants.CENTER);
	    add(mob);
	    
	    username = new JLabel("Amount : ");
	    username.setBounds(50,275,230,180);
	    username.setFont(new Font("Times New Roman",Font.BOLD,22));
	    username.setForeground(Color.BLACK);
	    username.setOpaque(false);
	    
	    username.setHorizontalAlignment(SwingConstants.CENTER);
	    add(username);
	    
	    
	    use = new JTextField("");
	    use.setBounds(230,350,250,30);
	    use.setFont(new Font("Times New Roman",Font.BOLD,25));
	    use.setForeground(Color.BLACK);
	    use.setOpaque(false);
	    
	    use.setHorizontalAlignment(SwingConstants.CENTER);
	    add(use);
	    
	    withdraw = new JLabel("Withdrawal : ");
	    withdraw.setBounds(50,345,230,180);
	    withdraw.setFont(new Font("Times New Roman",Font.BOLD,22));
	    withdraw.setForeground(Color.BLACK);
	    withdraw.setOpaque(false);
	    
	    withdraw.setHorizontalAlignment(SwingConstants.CENTER);
	    add(withdraw);
	    
	    with = new JTextField("");
	    with.setBounds(230,420,250,30);
	    with.setFont(new Font("Times New Roman",Font.BOLD,25));
	    with.setForeground(Color.BLACK);
	    with.setOpaque(false);
	    
	    with.setHorizontalAlignment(SwingConstants.CENTER);
	    add(with);
	    
	    password = new JLabel("Password : ");
	    password.setBounds(50,415,230,180);
	    password.setFont(new Font("Times New Roman",Font.BOLD,22));
	    password.setForeground(Color.BLACK);
	    password.setOpaque(false);
	    
	    password.setHorizontalAlignment(SwingConstants.CENTER);
	    add(password);
	    
	    pass = new JTextField("");
	    pass.setBounds(230,485,250,30);
	    pass.setFont(new Font("Times New Roman",Font.BOLD,25));
	    pass.setForeground(Color.BLACK);
	    pass.setOpaque(false);
	    
	    pass.setHorizontalAlignment(SwingConstants.CENTER);
	    add(pass);
	    
	    id = new JLabel("Id No : ");
	    id.setBounds(50,485,230,180);
	    id.setFont(new Font("Times New Roman",Font.BOLD,22));
	    id.setForeground(Color.BLACK);
	    id.setOpaque(false);
	    
	    id.setHorizontalAlignment(SwingConstants.CENTER);
	    add(id);
	    
	    i = new JTextField("");
	    i.setBounds(230,555,250,30);
	    i.setFont(new Font("Times New Roman",Font.BOLD,25));
	    i.setForeground(Color.BLACK);
	    i.setOpaque(false);
	    
	    i.setHorizontalAlignment(SwingConstants.CENTER);
	    add(i);
	    
	    bal = new JLabel("Balance : ");
	    bal.setBounds(50,555,230,180);
	    bal.setFont(new Font("Times New Roman",Font.BOLD,22));
	    bal.setForeground(Color.BLACK);
	    bal.setOpaque(false);
	    
	    bal.setHorizontalAlignment(SwingConstants.CENTER);
	    add(bal);
	    
	    b = new JTextField("");
	    b.setBounds(230,625,250,30);
	    b.setFont(new Font("Times New Roman",Font.BOLD,25));
	    b.setForeground(Color.BLACK);
	    b.setOpaque(false);
	    
	    b.setHorizontalAlignment(SwingConstants.CENTER);
	    add(b);
	    
	    signin = new JButton("Sign-in");
	    signin.setBounds(260, 700, 150, 40);
	    signin.addActionListener(this);
	    signin.setFont(new Font("Times New Roman",Font.BOLD,25));
	    signin.setBackground(Color.BLACK);
	    signin.setForeground(Color.WHITE);
        add(signin);
	    
	    
	    setBounds(600,100,660,840);
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String a[]) {
		new Signin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		name.getText();
		date.getText();
		mob.getText();
		use.getText();
		pass.getText();
		with.getText();
		i.getText();
		b.getText();
		
		 if (e.getSource() == signin) {
		        // Check if any of the required fields are empty
		        if (name.getText().isEmpty() || date.getText().isEmpty() || mob.getText().isEmpty() || use.getText().isEmpty() || pass.getText().isEmpty() || with.getText().isEmpty() || i.getText().isEmpty() || b.getText().isEmpty()) {
		            JOptionPane.showMessageDialog(this, "Please enter all required fields");
		        } else {
		            // All required fields are filled, proceed with database insertion
		            try {
		                // Call your method to insert data into the database
		                String sqlQuery = "INSERT INTO customer (Name, Age, Mobile, Amount_deposit, Password, Amount_withdrawal, id, Balance) VALUES ('" + name.getText() + "', " + Integer.parseInt(date.getText()) + ", " + Integer.parseInt(mob.getText()) + ", " + Integer.parseInt(use.getText()) + ", '" + pass.getText() + "', " + Integer.parseInt(with.getText()) + ", " + Integer.parseInt(i.getText()) + ", " + Integer.parseInt(b.getText()) + ")";
		                SqlInitiator.insertDatabase(sqlQuery);
		                System.out.println("Data inserted successfully!");
		            } catch (Exception ex) {
		                ex.printStackTrace();
		                JOptionPane.showMessageDialog(this, "An error occurred while inserting data into the database");
		            }
		        }
		}
	}
}
