package net.leonshenker.fundamentals;

public class Strings {

	public static void main(String[] args) {
		
		//String is a class, not a data type
		//it is a sequence of characters (MAX_INT_VALUE)
		String myString = "This is a string";
		System.out.println("myString is equal to " + myString);
		myString = myString + ", and this is more.";
		System.out.println("myString is equal to " + myString);
		myString = myString + " \u00A9 2020";
		System.out.println("myString is equal to " + myString + "\n");
		
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println(numberString + "\n");
		
		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println("LastString is equal to " + lastString); //automatic casting
		
		double doubleNumber = 120.47d;
		lastString = lastString + doubleNumber;
		System.out.println("LastString is equal to " + lastString); //appends
		
		//Strings in Java are immutable, you cannot change a string after creation
		//a new string is created when concatenation occurs, making it inefficient
	}
}
