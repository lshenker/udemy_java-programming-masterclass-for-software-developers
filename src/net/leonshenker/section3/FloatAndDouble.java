package net.leonshenker.section3;

public class FloatAndDouble {

	public static void main(String[] args) {
		
		//32 bits 2^5 single precision
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float Minimum Value = " + myMinFloatValue);
		System.out.println("Float Maximum Value = " + myMaxFloatValue);
		System.out.println();
		
		//64 bits 2^6 double precision 
		//default data type for precision
		//computers process faster
		//java libraries written to process doubles
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double Minimum Value = " + myMinDoubleValue);
		System.out.println("Double Maximum Value = " + myMaxDoubleValue);
		System.out.println();
		
		int myIntValue = 5 / 3; //does not handle remainder
		float myFloatValue = 5f / 3f; //7 digits precision
		double myDoubleValue = 5.00 / 3.00; //16 digits precision
		System.out.println("MyIntValue= " + myIntValue);
		System.out.println("MyFloatValue= " + myFloatValue);
		System.out.println("MyDoubleValue= " + myDoubleValue);
		
		//BigDecimal data type exists for extremely precise numbers
	}
}
