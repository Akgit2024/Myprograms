import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
	
	String name;
	JButton start,back;
	public Rules(String name) {
		this.name=name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel j1 = new JLabel("Hi, " +name+ ".  Welcome to Psc Inspire!");
	    j1.setBounds(70, 20, 500, 50);
	    j1.setFont(new Font("Times New Roman",Font.BOLD | Font.ITALIC,25));
	    j1.setForeground(new Color(0, 0, 128));
	    j1.setOpaque(false);
	    j1.setHorizontalAlignment(SwingConstants.CENTER);
	    add(j1);
	    
	    JLabel rules = new JLabel();
	    rules.setBounds(50, 80, 500, 350);
	    rules.setFont(new Font("Times New Roman",Font.PLAIN | Font.ITALIC,18));
        rules.setText(
        		"<html>"+
                "1. The Quiz contains 20 Multiple Choice Questions." + "<br><br>" +
        		"2. Read the questions carefully and then answer them." + "<br><br>" +
         		"3. Each questions will be given points. There is no negative marking." + "<br><br>" +
                "4. Make sure you are connected to a stable Wi-fi or cable internet." + "<br><br>" +
        		"5. You are free to take the quiz several times until you get 100% result." + "<br><br>" +
                "<html>"
        );
	    rules.setOpaque(false);
	    rules.setHorizontalAlignment(SwingConstants.CENTER);
	    add(rules);
	    
	    start = new JButton("Start");
	    start.setBounds(360, 410, 100, 30);
	    start.addActionListener(this);
	    start.setFont(new Font("Times New Roman",Font.BOLD,20));
	    start.setBackground(new Color(25, 25, 112));
	    start.setForeground(Color.WHITE);
        add(start);
        
        back = new JButton("Back");
        back.setBounds(140, 410, 100, 30);
        back.addActionListener(this);
        back.setFont(new Font("Times New Roman",Font.BOLD,20));
        back.setBackground(new Color(25, 25, 112));
        back.setForeground(Color.WHITE);
        add(back);
		
		setSize(650,540);
		setLocation(570,260);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String a[]) {
		new Rules("User");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == start) {
			new Quest();
			setVisible(false);
		}else {
			setVisible(false);
			new Quiz();
		}
		
	}

}
