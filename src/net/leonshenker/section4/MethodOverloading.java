package net.leonshenker.section4;

public class MethodOverloading {

	public static void main(String[] args) {
		int newScore = calculateScore("Tim", 500);
		System.out.println("New score is " + newScore);
		calculateScore(75);
		calculateScore();
		
		System.out.println("Centimeters: " + calcFeetAndInchesToCentimeters(86));

	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unammed player scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore() {
		System.out.println("No player name, no player score");
		return 0;
	}
	
	//number of parameters still have to change, cannot just change return type
//	public static void calculateScore() {
//		System.out.println("No player name, no player score");
//	}

	public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
		if (feet >= 0 && inches >= 0 && inches <= 12) {
			return ((feet * 12) + inches) * 2.54;
		}
		return -1;
	}
	
	public static double calcFeetAndInchesToCentimeters(int inches) {
		if (inches >= 0) {
			int feet = (inches / 12);
			inches %= 12;
			return calcFeetAndInchesToCentimeters(feet, inches);
		}
		return -1;
	}
}
