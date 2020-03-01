package net.leonshenker.fundamentals;

public class ByteShortIntLong {

	public static void main(String[] args) {
		
		//8 bits 2^3
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum Value = " + myMinByteValue);
		System.out.println("Byte Maximum Value = " + myMaxByteValue);
		System.out.println();
		
		//16 bits 2^4
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Minimum Value = " + myMinShortValue);
		System.out.println("Short Maximum Value = " + myMaxShortValue);
		System.out.println();
		
		//32 bits 2^5
		int myValue = 10000;
		int myMaxIntTest = 2_147_483_647; //underscores acceptable
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); //overflow
		System.out.println("Busted MIN value = " + (myMinIntValue - 1)); //underflow
		System.out.println();
		
		//64bits 2^6
		long myLongValue = 100L; //uppercase 'L' preffered
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Minimum Value = " + myMinLongValue);
		System.out.println("Long Maximum Value = " + myMaxLongValue);
		System.out.println();
		
		//Java uses int by default
		int myTotal = (myMinIntValue / 2);
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		short myNewShortValue = (short) (myMinShortValue / 2);
	}
}
