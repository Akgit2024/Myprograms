import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Quest extends JFrame implements ActionListener {
	
	String question[][] = new String[20][5];
	String answers[][] = new String [20][2];
	JLabel qno,ques;
	String userans[][] = new String[20][1];
	JRadioButton opt1,opt2,opt3,opt4;
	ButtonGroup grouption;
	JButton next,pre,sub;
	public static int timer = 20;
	public static int ans_given = 0;
	public static int count = 0;
	
	Quest(){
		setBounds(220, 60, 1500,900);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel background = new JLabel(new ImageIcon("C:\\Users\\akhil\\eclipse-workspace\\Quizapp\\src\\icons\\quiz.png"));
        background.setBounds(250, 0,1000, 270);
        add(background);
		
        qno = new JLabel();
        qno.setBounds(80, 300, 60, 30);
        qno.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        add(qno);
        
        ques = new JLabel();
        ques.setBounds(120, 275, 1500, 80);
        ques.setFont(new Font("Times New Roman", Font.PLAIN, 30));
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
        
        question[3][0] = "Which operator has the highest precedence?";
        question[3][1] = "+";
        question[3][2] = "*";
        question[3][3] = "()";
        question[3][4] = "&&";
        
        question[4][0] = "Which of these keywords are used for the block to be examined for exceptions?";
        question[4][1] = "check";
        question[4][2] = "throw";
        question[4][3] = "catch";
        question[4][4] = "try";
        
        question[5][0] = "Which of the following is not an OOPS concept in Java?";
        question[5][1] = "Polymorphism";
        question[5][2] = "Inheritance";
        question[5][3] = "Compilation";
        question[5][4] = "Encapsulation";
        
        question[6][0] = "What is the extension of compiled java classes?";
        question[6][1] = ".txt";
        question[6][2] = ".java";
        question[6][3] = ".js";
        question[6][4] = ".class";
        
        question[7][0] = "In Java, strings are:";
        question[7][1] = "Primitive data types";
        question[7][2] = "Immutable objects";
        question[7][3] = "Mutable objects";
        question[7][4] = "Arrays of characters";
        
        question[8][0] = "Which one of the following is not an access modifier?";
        question[8][1] = "Protected";
        question[8][2] = "Void";
        question[8][3] = "Public";
        question[8][4] = "Private";
        
        question[9][0] = "Who invented Java Programming?";
        question[9][1] = "Guido van Rossum";
        question[9][2] = "James Gosling";
        question[9][3] = "Dennis Ritchie";
        question[9][4] = "Bjarne Stroustrup";
        
        question[10][0] = "Which option is false about the final keyword?";
        question[10][1] = "A final method cannot be overridden in its subclasses";
        question[10][2] = "A final class cannot be extended";
        question[10][3] = "A final class cannot extend other classes";
        question[10][4] = "A final method can be inherited";
        
        question[11][0] = "How many threads can be executed at a time?";
        question[11][1] = "Only one thread";
        question[11][2] = "Multiple threads";
        question[11][3] = "Only main (main() method) thread";
        question[11][4] = "Two threads";
        
        question[12][0] = "Which keyword is used for accessing the features of a package?";
        question[12][1] = "package";
        question[12][2] = "import";
        question[12][3] = "extends";
        question[12][4] = "export";
        
        question[13][0] = "Which of the following is FALSE about abstract classes in Java?";
        question[13][1] = "If we derive an abstract class and do not implement all the abstract methods, "
        		+ "then the derived class should also be marked as abstract using 'abstract' keyword";
        question[13][2] = "Abstract classes can have constructors";
        question[13][3] = "A class can be made abstract without any abstract method";
        question[13][4] = "A class can inherit from multiple abstract classes";
        
        question[14][0] = "In which year was the first version of Java released?";
        question[14][1] = "1991";
        question[14][2] = "1995";
        question[14][3] = "1998";
        question[14][4] = "2000";
        
        question[15][0] = "What is the purpose of the \"super\" keyword in Java?";
        question[15][1] = "To refer to the current object";
        question[15][2] = "To create multiple instances of a class";
        question[15][3] = "To invoke the superclass constructor or methods";
        question[15][4] = "To hide data and methods within a class";
        
        question[16][0] = "What is the purpose of the continue statement in a loop?";
        question[16][1] = "To exit the loop immediately";
        question[16][2] = "To skip the current iteration and move to the next iteration";
        question[16][3] = "To terminate the program";
        question[16][4] = "To execute a specific block of code";
       
        question[17][0] = "Which operator is used to perform bitwise \"AND\" operation?";
        question[17][1] = "&&";
        question[17][2] = "&";
        question[17][3] = "|";
        question[17][4] = "||";
        
        question[18][0] = "Which loop construct guarantees that the loop body is executed at least once?";
        question[18][1] = "for loop";
        question[18][2] = "while loop";
        question[18][3] = "do-while loop";
        question[18][4] = "continue statement";
        
        question[19][0] = "What was the original name for Java?";
        question[19][1] = "C++++";
        question[19][2] = "Pine";
        question[19][3] = "Maple";
        question[19][4] = "Oak";
        
        answers[0][1] = "JDK";
        answers[1][1] = ".java";
        answers[2][1] = "interface";
        answers[3][1] = "()";
        answers[4][1] = "try";
        answers[5][1] = "Compilation";
        answers[6][1] = ".class";
        answers[7][1] = "Immutable objects";
        answers[8][1] = "Void";
        answers[9][1] = "James Gosling";
        answers[10][1] = "A final class cannot extend other classes";
        answers[11][1] = "Multiple threads";
        answers[12][1] = "import";
        answers[13][1] = "A class can inherit from multiple abstract classes";
        answers[14][1] = "1995";
        answers[15][1] = "To invoke the superclass constructor or methods";
        answers[16][1] = "To skip the current iteration and move to the next iteration";
        answers[17][1] = "&&";
        answers[18][1] = "do-while loop";
        answers[19][1] = "Oak";
        
        opt1 = new JRadioButton("A");
        opt1.setBounds(100,500,700,30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        add(opt1);
        
        opt2 = new JRadioButton("B");
        opt2.setBounds(100,550,700,30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        add(opt2);
        
        opt3 = new JRadioButton("C");
        opt3.setBounds(100,600,700,30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Times New Roman",Font.PLAIN,20));
        add(opt3);
        
        opt4 = new JRadioButton("D");
        opt4.setBounds(100,650,700,30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Times New Roman",Font.PLAIN,20));
        add(opt4);
        
        grouption = new ButtonGroup();
        grouption.add(opt1);
        grouption.add(opt2);
        grouption.add(opt3);
        grouption.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1250, 500, 150, 40);
        next.setFont(new Font("Times New Roman",Font.PLAIN,23));
        next.setBackground(new Color(138,43,226));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        pre = new JButton("Previous");
        pre.setBounds(1250, 600, 150, 40);
        pre.setFont(new Font("Times New Roman",Font.PLAIN,23));
        pre.setBackground(new Color(138,43,226));
        pre.setForeground(Color.WHITE);
        pre.addActionListener(this);
        add(pre);
        
        sub = new JButton("Submit");
        sub.setBounds(1250, 700, 150, 40);
        sub.setFont(new Font("Times New Roman",Font.PLAIN,23));
        sub.setBackground(new Color(138,43,226));
        sub.setForeground(Color.WHITE);
        sub.setEnabled(false);
        sub.addActionListener(this);
        add(sub);
        
        start(count);
        
		setVisible(true);
		
	}
	
	
	public void start(int count) {
		qno.setText("" + (count+1) + ".");
		ques.setText(question[count][0]);
		opt1.setText(question[count][1]);
		opt1.setActionCommand(question[count][1]);
		
		opt2.setText(question[count][2]);
		opt2.setActionCommand(question[count][2]);
		
		opt3.setText(question[count][3]);
		opt3.setActionCommand(question[count][3]);
		
		opt4.setText(question[count][4]);
		opt4.setActionCommand(question[count][4]);
		
		grouption.clearSelection();
	}
	
	public static void main(String a[]) {
		new Quest();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == next) {
		       repaint();
		       
		       ans_given = 1;
		       if(grouption.getSelection() == null) {
					userans[count][0] = "";
				}else {
					userans[count][0] = grouption.getSelection().getActionCommand();
					
				}
		       if(count == 18) {
		    	   next.setEnabled(false);
		    	   sub.setEnabled(true);
		       }
		       
		       count ++;
		       start(count);
	    }else if(e.getSource() == pre) {
	    	   
	    }else {
	    	
	    }

    }
	
	public void paint(Graphics g) {
		super.paint(g);
		
		String time = "Time left -" + timer +" "+"seconds";
		g.setColor(Color.RED);
		g.setFont(new Font("Times New Roman",Font.BOLD,25));
		
		if(timer > 0) {
			g.drawString(time, 1200, 300);
		}else {
			g.drawString("Time has run out !!!" , 1200, 300);
		}
		timer --;
		
		try {
			Thread.sleep(1000);
			repaint();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(ans_given == 1) {
			ans_given = 0;
			timer =20;
		}else if(timer < 0) {
			timer = 20;
			
			if(grouption.getSelection() == null) {
				userans[count][0] = "";
			}else {
				userans[count][0] = grouption.getSelection().getActionCommand();
				
			}
			count ++;
			start(count);
		}
	}
}
