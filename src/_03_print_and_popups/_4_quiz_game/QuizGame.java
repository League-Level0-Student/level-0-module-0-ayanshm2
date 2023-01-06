package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		String quest  = JOptionPane.showInputDialog("Are you smart");
		// 2.  Ask the user a question 
		int count = 0;
		// 3.  Use an if statement to check if their answer is correct
		if(quest.equalsIgnoreCase("yes")) { 
			count-= 1;
			JOptionPane.showMessageDialog(null,"sure what ever u say");
		}else{ 
			count+= 1;
			JOptionPane.showMessageDialog(null,"nice job ur wrong ");
		}
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String quest2  = JOptionPane.showInputDialog("what was the first basketball hoop made out of");
		if(quest2.equalsIgnoreCase("A peach basket from georgia")) { 
			count-= 1;
			JOptionPane.showMessageDialog(null,"Amazing how did you know that");
		}else{ 
			count+= 1;
			JOptionPane.showMessageDialog(null,"nice job ur wrong");
		
		String quest3  = JOptionPane.showInputDialog("How many moon does jupiter have");
		if(quest.equalsIgnoreCase("80")) { 
			count-= 1;
			JOptionPane.showMessageDialog(null,"Amazing how did you know that");
		}else{ 
			count+= 1;
			JOptionPane.showMessageDialog(null,"nice job ur wrong ");
		}}
		// After all the questions have been asked, tell the user their final score 
		
	}
}
