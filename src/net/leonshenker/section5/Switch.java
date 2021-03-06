package net.leonshenker.section5;

public class Switch {

	public static void main(String[] args) {
		
		int value = 1;
		if (value == 1) {
			System.out.println("Value was 1");
		} else if (value == 2) {
			System.out.println("Value was 2");
		} else {
			System.out.println("Value was not 1 or 2");
		}
		
		int switchValue = 6;
		
		//byte, short, char, int, string
		switch(switchValue) {
			case 1:
				System.out.println("Value was 1");
				break;
			case 2:
				System.out.println("Value was 2");
				break;
			case 3: case 4: case 5:
				System.out.println("Value was 3, 4, or 5");
				System.out.println("It was " + switchValue);
				break;
			default:
				System.out.println("Value was not 1, 2, 3, 4, or 5");
				break;
		}
		
		char charVal = 'Z';
		switch(charVal) {
		case 'A':
			System.out.println("Value was A");
			break;
		case 'B':
			System.out.println("Value was B");
			break;
		case 'C':
			System.out.println("Value was C");
			break;
		case 'D':
			System.out.println("Value was D");
			break;
		case 'E':
			System.out.println("Value was E");
			break;
		default:
			System.out.println("Value was not A, B, C, D, or E");
			break;
		}
	}
}
