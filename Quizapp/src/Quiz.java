
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Quiz implements ActionListener{
    JFrame jf;
    JLabel j1,j2;
    JLabel background;
    JLabel name;
    JLabel background1;
    JTextField n;
    JButton rules;
    JButton back;
	
	public Quiz() {
		jf = new JFrame("QUIZ");
		jf.setLayout(null);
		
		
		jf.getContentPane().setBackground(Color.WHITE);
		jf.setSize(1403,739);
		jf.setLocation(270, 160);
		
		
		j1 = new JLabel("Welcome to Psc Inspire");
	    j1.setBounds(870, 80, 550, 50);
	    j1.setFont(new Font("Times New Roman",Font.BOLD | Font.ITALIC,44));
	    j1.setForeground(new Color(255,250,240));
	    j1.setOpaque(false);
	    
	    j1.setHorizontalAlignment(SwingConstants.CENTER);
	    jf.add(j1);
	    
	    j2 = new JLabel("Java Programming Questions");
	    j2.setBounds(870, 260, 550, 50);
	    j2.setFont(new Font("Times New Roman",Font.BOLD,28));
	    j2.setOpaque(false);
	    
	    j2.setHorizontalAlignment(SwingConstants.CENTER);
	    jf.add(j2);
	    
	    name = new JLabel("Enter your name");
	    name.setBounds(870, 350, 550, 50);
	    name.setFont(new Font("Times New Roman",Font.BOLD ,30));
	    name.setForeground(new Color(25, 25, 112));
	    name.setOpaque(false);
	    
	    name.setHorizontalAlignment(SwingConstants.CENTER);
	    jf.add(name);
	   
		JLabel background = new JLabel(new ImageIcon("C:\\Users\\akhil\\eclipse-workspace\\Quizapp\\src\\icons\\quiz.jpg"));
        background.setBounds(0, 0,900, 700);
        jf.add(background);
        
        JLabel background1 = new JLabel(new ImageIcon("C:\\Users\\akhil\\eclipse-workspace\\Quizapp\\src\\icons\\line.jpg"));
        background1.setBounds(890, 0,500, 195);
        jf.add(background1);
        
        n = new JTextField();
        n.setBounds(1000, 420, 300, 28);
        n.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,18));
        jf.add(n);
        
        rules = new JButton("Rules");
        rules.setBounds(1000, 500, 100, 30);
        rules.addActionListener(this);
        rules.setFont(new Font("Times New Roman",Font.BOLD,20));
        rules.setBackground(new Color(25, 25, 112));
        rules.setForeground(Color.WHITE);
        jf.add(rules);
        
        back = new JButton("Back");
        back.setBounds(1195, 500, 100, 30);
        back.addActionListener(this);
        back.setFont(new Font("Times New Roman",Font.BOLD,20));
        back.setBackground(new Color(25, 25, 112));
        back.setForeground(Color.WHITE);
        jf.add(back);
        
        
        jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String a[]) {
		new Quiz();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == rules) {
			String name = n.getText();
			new Rules(name);
			jf.setVisible(false);
		
		}else if(e.getSource() == back) {
			jf.setVisible(false);
		}
		
	}

}
