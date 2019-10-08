package TutorialWeek3;

import java.util.ArrayList;
import java.util.Scanner;

public class NestedDoWhile {
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		ArrayList<String> studentNames = new ArrayList<>();
		String answer = "";
		do {
			System.out.print("Enter a name: ");
			String name = scan.next();
			studentNames.add(name);

			System.out.println("Do you want to add more name? ");
			answer = scan.next();
			if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
				System.err.println("Invalid input. Please type yes or no...");
			}
			if (answer.equalsIgnoreCase("no")) {
				System.out.println("Thank you for your inputs...");
				break;
			}

		} while (answer.equalsIgnoreCase("yes"));
	}
}