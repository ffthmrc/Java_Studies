package Assignments;

import java.util.Scanner;

public class NumberToWord {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter a number between 0 to 9: ");
		int number = input.nextInt();
		
		String word;
		
		switch (number) {
			case 1:
				word = "one";
			break;
			case 2:
				word = "two";
			break;
			case 3:
				word = "three";
			break;
			case 4:
				word = "four";
			break;
			case 5:
				word = "five";
			break;
			case 6:
				word = "six";
			break;
			case 7:
				word = "seven";
			break;
			case 8:
				word = "eight";
			break;
			case 9:
				word = "nine";
			break;
			default:
			word = "invalid number";
		}
		System.out.println("You have entered: "+word);
	}
}
