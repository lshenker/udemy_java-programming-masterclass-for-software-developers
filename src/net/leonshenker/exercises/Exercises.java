package net.leonshenker.exercises;

public class Exercises {

	public static void main(String[] args) {
		
		//test methods
	}
	
    public static boolean hasTeen(int num1, int num2, int num3) {
        return (isTeen(num1) || isTeen(num2) || isTeen(num3)) ?  true : false;
    }
    
    public static boolean isTeen(int num) {
        return (num >= 13 && num <= 19) ? true : false;
    }
	
    public static double area(double radius) {
        if (radius >= 0) {
            return radius * radius * Math.PI;
        }
        return -1;
    }
    
    public static double area(double x, double y) {
        if (x >= 0 && y >= 0) {
            return x * y;
        }
        return -1;
    }
    
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long days = (minutes % 525600) / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
    
    public static void printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
        } else if ((num1 == num2) && (num2 == num3)) {
            System.out.println("All numbers are equal");
        } else if ((num1 != num2) && (num2 != num3) && (num1 != num3)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
    
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;
        return (temperature >= 25 && temperature <= upperLimit) ? true : false;
    }
    
    
    
    
}
