package Loops;

import java.util.ArrayList;
import java.util.Scanner;

public class NestedDoWhile {
	public static void main(String[] args) {
//		ArrayList<String> nameList=new ArrayList<>();
//		nameList.add("Murat");
//		nameList.add("Defne");
//		nameList.add("Ela");
//		System.out.println(nameList);
//		System.out.println(nameList.get(1));
		

		Scanner scan=new Scanner(System.in);
		ArrayList<String> studentNames=new ArrayList<>();
		String answer="";
		do {
			System.out.print("Enter a name: ");
			String name=scan.next();
			studentNames.add(name);
			do {
				System.out.println("Do you Want to add a name? ");
				answer=scan.next();
				if(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))) {
					System.err.println("Invalid input. Please type yes or no...");
				}
				}while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no")));
				
		}while(!answer.equalsIgnoreCase("no"));
	}
}
