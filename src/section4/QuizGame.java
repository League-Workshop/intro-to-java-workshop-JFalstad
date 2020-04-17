package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("Who is the greatest basketball player of all time?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer.equalsIgnoreCase("Michael Jordan") || answer.equalsIgnoreCase("Jordan") ) {
		// 4.  if the user's answer was correct, add one to their score 
			score = score + 1; }
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		answer = JOptionPane.showInputDialog("How many rings does Michael Jordan have?");
		if (answer.equalsIgnoreCase("6") || answer.equalsIgnoreCase("six") ) {
		score = score + 1; 
		}
		answer = JOptionPane.showInputDialog("What player scored the most points in one game?");
		if (answer.equalsIgnoreCase("Wilt Chamberlain")) {
		score = score + 1;
		}
		answer = JOptionPane.showInputDialog("Who won the most career NBA championships as a player?");
		if (answer.equalsIgnoreCase("Bill Russell")) {
		score = score + 1;
		}
		answer = JOptionPane.showInputDialog("What team drafted Kobe Brayant?");
		if (answer.equalsIgnoreCase("Charlotte Hornets") || answer.equalsIgnoreCase("Hornets") ) {
		score = score + 1;
		}
		answer = JOptionPane.showInputDialog("Who is the shortest player of all-time?");
		if (answer.equalsIgnoreCase("Muggsy Bogues") || answer.equalsIgnoreCase("Tyrone Bogues") ) {
		score = score + 1;
		}
		// 6.  After all the questions have been asked, print the user's score
		JOptionPane.showMessageDialog(null, "You scored " + score + ".");
		
	}
}
