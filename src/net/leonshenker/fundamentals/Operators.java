package net.leonshenker.fundamentals;

public class Operators {

	public static void main(String[] args) {
		
		//operands are manipulated by operators
		//expressions are formed by combining variables, literals, method return values, and operators
		int result = 1 + 2;
		System.out.println("1 + 2 = " + result);
		int previousResult = result;
		System.out.println("previousResult = " + previousResult);
		result = result -1;
		System.out.println("3 - 1 = " + result);
		System.out.println("previousResult = " + previousResult);
		
		result = result * 10; //2 * 10 = 20
		System.out.println("2 * 10 = " + result);
		
		result = result / 5; //20 / 5 = 4
		System.out.println("20 / 5 = " + result);
		
		result = result % 3; //the remainder of (4 % 3)  = 1
		System.out.println("4 % 3 = " + result);
		
		// result = result + 1
		result++; //1 + 1 = 2
		System.out.println("1 + 1 = " + result);
		
		// result = result - 1
		result--; //2 - 1 = 1
		System.out.println("2 - 1 = " + result);
		
		//result = result + 2
		result += 2; //1 + 2 = 3
		System.out.println("1 + 2 = " + result);
		
		//result = result * 10
		result *= 10; //3 * 10 = 30
		System.out.println("3 * 10 = " + result);
		
		//result = result / 3
		result /= 3; //30 / 3 = 10
		System.out.println("30 / 3 = " + result + "\n");
		
		boolean isAlien = false;
		if (isAlien == false)
			System.out.println("It is not an alien!");
		
		int money = 21;
		if (money != 0 && money > 20) {
			System.out.println("You aren't broke, and can afford the movies!\n");
		}
	}
}
