package net.leonshenker.section5.practice;

public class Sum3And5 {

	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			if(i % 3 == 0 && i % 5 ==0) {
				count ++;
				sum += i;
				System.out.println(i);
				if(count == 5) {
					System.out.println("Sum: " + sum);
					break;
				}
			}
		}

	}
}
