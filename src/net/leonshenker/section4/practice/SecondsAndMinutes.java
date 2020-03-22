package net.leonshenker.section4.practice;

public class SecondsAndMinutes {

	private static final String INVALID_VALUE_MESSAGE = "Invalid value";
	
	public static void main(String[] args) {
		
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(3945));
	}
	
	private static String getDurationString(int minutes, int seconds) {
		
		if (minutes >= 0 && seconds >=0 && seconds <= 59) {
			int hours = minutes / 60;
			minutes %= 60;
			String hrs = hours < 10 ? "0" + hours : hours + "";
			String mins = minutes < 10 ? "0" + minutes : minutes + "";
			String secs = seconds < 10 ? "0" + seconds : seconds + "";
			return hrs + "h " + mins + "m " + secs + "s";
		}
		return INVALID_VALUE_MESSAGE;
	}
	
	public static String getDurationString(int seconds) {
		
		if (seconds >=0) {
			int minutes = seconds / 60;
			seconds %= 60;
			return getDurationString(minutes, seconds);
		}
		return INVALID_VALUE_MESSAGE;
	}
}
