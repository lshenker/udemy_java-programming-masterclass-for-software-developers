package net.leonshenker.section4;

public class Methods {

	public static void main(String[] args) {
		
		int highScore = calculateScore(true, 800, 5, 100);
		System.out.println("Your final score was " + highScore);
		
		displayHighScorePosition("Ted", calculateHighScorePosition(1500));
		displayHighScorePosition("Tina", calculateHighScorePosition(900));
		displayHighScorePosition("Tony", calculateHighScorePosition(400));
		displayHighScorePosition("Tammy", calculateHighScorePosition(50));
		displayHighScorePosition("bug1", calculateHighScorePosition(1000));
		displayHighScorePosition("bug2", calculateHighScorePosition(500));
		displayHighScorePosition("bug3", calculateHighScorePosition(100));
	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
	}
	
	public static void displayHighScorePosition(String playerName, int position) {
		System.out.println(playerName + " is in position " + position + " on the high score table");
	}
	
	public static int calculateHighScorePosition(int score) {
//		if (score >= 1000) {
//			return 1;
//		} else if (score >= 500) {
//			return 2;
//		} else if (score >= 100) {
//			return 3;
//		}
//		return 4;
		int position = 4;
		if (score >= 1000) {
			position = 1;
		} else if (score >= 500) {
			position = 2;
		} else if (score >= 100) {
			position = 3;
		}
		return position;
	}
}
