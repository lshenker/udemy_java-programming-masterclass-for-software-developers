package net.leonshenker.challenges;

public class Operators {

	public static void main(String[] args) {
		
		double double1 = 20.00;
		double double2 = 80.00;
		double result1 = (double1 + double2) * 100;
		double remainder = result1 % 40.00;
		boolean isZero = remainder == 0 ? true : false;
		System.out.println("isZero = " + isZero);
		if (!isZero)
			System.out.println("Got some remainder");	
	}
}
