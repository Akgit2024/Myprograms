import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener {

	public Score(String name, int score){
		
		getContentPane().setBackground(new Color(245,245,245));
		setSize(850,750);
		setLocation(570,160);
		
		
		JLabel screen =new JLabel(new ImageIcon("C:\\Users\\akhil\\eclipse-workspace\\Quizapp\\src\\icons\\congrat.gif"));
		screen.setBounds(170, 40,500, 550);
        add(screen);
        
        JLabel heading = new JLabel("Thank You " + name + " for playing the Quiz Test.");
        heading.setBounds(140, 10, 700, 50);
        heading.setFont(new Font("Times New Roman",Font.BOLD | Font.ITALIC,30));
        heading.setForeground(new Color(128,0,0));
        add(heading);
        
        JLabel Score = new JLabel("Your score is: " + score + "" );
        Score.setBounds(320, 560, 700, 70);
        Score.setFont(new Font("Times New Roman",Font.BOLD | Font.ITALIC,30));
        Score.setForeground(new Color(128,0,0));
        add(Score);
        
        JButton exit = new JButton("EXIT");
        exit.setBounds(380, 640, 100, 30);
        exit.setFont(new Font("Times New Roman",Font.BOLD,20));
        exit.setBackground(new Color(25, 25, 112));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Quiz(); 
		
	}
	
	public static void main(String a[]) {
		new Score("User",0);
	}
}
