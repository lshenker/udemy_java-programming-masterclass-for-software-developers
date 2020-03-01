package net.leonshenker.fundamentals;

public class CharAndBoolean {

	public static void main(String[] args) {
		
		//16 bits 2^4
		//lets you store 65535 different unicode characters
		char myChar = 'D';
		char myUnicodeChar = '\u00A9';
		System.out.println(myChar);
		System.out.println(myUnicodeChar);
		
		boolean myTrueBooleanValue = true;
		boolean myFalseBooleanValue = false;
		boolean isCustomerOverTwentyOne = true; //"is" naming best practice
	}
}
