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
	
	String question[][] = new String[10][5];
	String answers[][] = new String [10][2];
	JLabel qno,ques;
	String userans[][] = new String[10][1];
	JRadioButton opt1,opt2,opt3,opt4;
	ButtonGroup grouption;
	JButton next,pre,sub;
	public static int timer = 10;
	public static int ans_given = 0;
	public static int count = 0;
	public static int score = 0;
	String name;
	
	
	public Quest(String name){
		
		this.name = name;
		
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
        
        question[3][0] = "What is the purpose of the \"super\" keyword in Java?";
        question[3][1] = "To refer to the current object";
        question[3][2] = "To create multiple instances of a class";
        question[3][3] = "To invoke the superclass constructor or methods";
        question[3][4] = "To hide data and methods within a class";
        
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
        
        question[7][0] = "Which keyword is used for accessing the features of a package?";
        question[7][1] = "package";
        question[7][2] = "import";
        question[7][3] = "extends";
        question[7][4] = "export";
        
        question[8][0] = "Which one of the following is not an access modifier?";
        question[8][1] = "Void";
        question[8][2] = "Protected";
        question[8][3] = "Public";
        question[8][4] = "Private";
        
        question[9][0] = "Which option is false about the final keyword?";
        question[9][1] = "A final method cannot be overridden in its subclasses";
        question[9][2] = "A final class cannot be extended";
        question[9][3] = "A final class cannot extend other classes";
        question[9][4] = "A final method can be inherited";
          
        answers[0][1] = "JDK";
        answers[1][1] = ".java";
        answers[2][1] = "interface";
        answers[3][1] = "To invoke the superclass constructor or methods";
        answers[4][1] = "try";
        answers[5][1] = "Compilation";
        answers[6][1] = ".class";
        answers[7][1] = "import";
        answers[8][1] = "Void";
        answers[9][1] = "A final method can be inherited";
       
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		count ++;
	}
	
	public void start2(int count) {
		qno.setText("" + (count-1) + ".");
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
		count --;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == next) {
		       repaint();
		       opt1.setEnabled(true);
			   opt2.setEnabled(true);
			   opt3.setEnabled(true);
			   opt4.setEnabled(true);
		       
		       ans_given = 1;
		       if(grouption.getSelection() == null) {
					userans[count][0] = "";
				}else {
					userans[count][0] = grouption.getSelection().getActionCommand();
					
				}
		        
		       
		       if(count == 8) {
		    	   next.setEnabled(false);
		    	   pre.setEnabled(true);
		    	   sub.setEnabled(true);
		       }
		       if(count == 0) {
		    	   pre.setEnabled(true);
		       }
		       
		   
		       count ++;
		       start(count);
	    }else if(e.getSource() == pre) {
	    	   
	    	    repaint();
	    	    ans_given = 1;
			    if(grouption.getSelection() == null) {
						userans[count][0] = "";
				}else {
						userans[count][0] = grouption.getSelection().getActionCommand();
						
				}    
			    if(count == 1) {
			    	pre.setEnabled(false);
			    }
			    
			    if(count == 9) {
			    	next.setEnabled(true);
			    	sub.setEnabled(false);
			    }
			    
	    	    
	    	    count --;
	    	    start(count); 
	    }else if(e.getSource() == sub) {
	    	if(grouption.getSelection() == null) {
			      userans[count][0] = "";
		     }else {
			      userans[count][0] = grouption.getSelection().getActionCommand();
			
		     }
			 for(int i = 0; i < userans.length; i++) {
				 if(userans[i][0].equals(answers[i][1])) {
					 score += 10;
				 }else {
					 score += 0;
				 }
			 }
			 new Score(name,score);
			 setVisible(false);
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
			timer =10;
		}else if(timer < 0) {
			timer = 10;
			
			opt1.setEnabled(true);
			opt2.setEnabled(true);
			opt3.setEnabled(true);
			opt4.setEnabled(true);
			
			if(count == 9) {
				 if(grouption.getSelection() == null) {
				      userans[count][0] = "";
			     }else {
				      userans[count][0] = grouption.getSelection().getActionCommand();
				
			     }
				 for(int i = 0; i < userans.length; i++) {
					 if(userans[i][0].equals(answers[i][1])) {
						 score += 10;
					 }else {
						 score += 0;
					 }
				 }
				 setVisible(false);
				 new Score(name, score);
				 
			}else {
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
	
	public static void main(String a[]) {
		new Quest("User");
	}
}
