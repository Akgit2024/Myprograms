import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Quest extends JFrame {
	
	String question[][] = new String[20][5];
	String answers[][] = new String [20][2];
	
	Quest(){
		setBounds(220, 60, 1500,900);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel background = new JLabel(new ImageIcon("C:\\Users\\akhil\\eclipse-workspace\\Quizapp\\src\\icons\\quiz.png"));
        background.setBounds(250, 0,1000, 270);
        add(background);
		
        JLabel qno = new JLabel("1.");
        qno.setBounds(70, 350, 60, 30);
        qno.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        add(qno);
        
        JLabel ques = new JLabel("This is it");
        ques.setBounds(120, 350, 900, 30);
        ques.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        add(ques);
        
        question[0][0] = "Which component is used to compile, debug and execute the java programs?";
        question[0][1] = "JRE";
        question[0][2] = "JIT";
        question[0][3] = "JDK";
        question[0][4] = "JVM";
        
        question[1][0] = "What is the extension of java code files?";
        question[1][1] = ".js";
        question[1][2] = ".txt";
        question[1][3] = ".class";
        question[1][4] = ".java";
        
        question[2][0] = "Which of these keywords is used to define interfaces in Java?";
        question[2][1] = "extends";
        question[2][2] = "super";
        question[2][3] = "interface";
        question[2][4] = "intf";
        
        question[3][0] = "";
        question[3][1] = "";
        question[3][2] = "";
        question[3][3] = "";
        question[3][4] = "";
        
        question[4][0] = "";
        question[4][1] = "";
        question[4][2] = "";
        question[4][3] = "";
        question[4][4] = "";
        
        question[5][0] = "";
        question[5][1] = "";
        question[5][2] = "";
        question[5][3] = "";
        question[5][4] = "";
        
        question[6][0] = "What is the extension of compiled java classes?";
        question[6][1] = ".txt";
        question[6][2] = ".java";
        question[6][3] = ".js";
        question[6][4] = ".class";
        
        question[7][0] = "";
        question[7][1] = "";
        question[7][2] = "";
        question[7][3] = "";
        question[7][4] = "";
        
        question[8][0] = "";
        question[8][1] = "";
        question[8][2] = "";
        question[8][3] = "";
        question[8][4] = "";
        
        question[9][0] = "";
        question[9][1] = "";
        question[9][2] = "";
        question[9][3] = "";
        question[9][4] = "";
        
        question[10][0] = "";
        question[10][1] = "";
        question[10][2] = "";
        question[10][3] = "";
        question[10][4] = "";
        
		setVisible(true);
		
	}
	public static void main(String a[]) {
		new Quest();
	}

}
