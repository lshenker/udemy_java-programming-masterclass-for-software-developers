package net.leonshenker.challenges;

public class LongTotal {

	public static void main(String[] args) {
		//Challenge
		byte byteVar = 10;
		short shortVar = 20;
		int intVar = 50;
		long longTotal = 50000L + 10L * (byteVar + shortVar + intVar);
		System.out.println(longTotal + "\n");
		
		short shortTotal = (short) (50000 + 10 * 
				(byteVar + shortVar + intVar));
		System.out.println(shortTotal);
	}
}
