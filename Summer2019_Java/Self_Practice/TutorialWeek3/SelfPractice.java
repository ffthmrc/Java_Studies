package TutorialWeek3;

import java.util.ArrayList;
import java.util.Scanner;

public class SelfPractice {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		Scanner scan=new Scanner(System.in);
		boolean condition=true;
		do {
			System.out.print("Please enter your number: ");
			int num=scan.nextInt();
			numbers.add(num);
			System.out.println("Would you like to add more: ");
			String answer=scan.next();
			if(answer.equalsIgnoreCase("No")){
				System.out.println("Thank you for your cooperation...");
				condition=false;;
			}
			else if(answer.equalsIgnoreCase("Yes")){
				condition=true;
			}
			else {
				do {
					System.err.println("Please enter a valid answer:");
					answer=scan.next();
					if(answer.equalsIgnoreCase("No")){
						System.out.println("Thank you for your cooperation...");
						condition=false;
						break;
					}
					if(answer.equalsIgnoreCase("Yes")){
						condition=true;
						break;
					}
				}while(!answer.equalsIgnoreCase("Yes")&&!answer.equalsIgnoreCase("No"));
			}
		}while(condition);
		System.out.println(numbers);
		for(int each: numbers) {
			System.out.print(each+" ");
		}
		System.out.println();
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i)+" ");
		}
		System.out.println();
		System.out.println(numbers.get(2));
		numbers.remove(2);
		System.out.println(numbers.get(2));
		System.out.println(numbers);
		numbers.clear();
		System.out.println(numbers);
		
		Integer num1=5;
		int num2=num1; //unboxing
		int num3=3;
		num1=num3; // Auto boxing
		int num4=Integer.parseInt("453");
		Integer num5=Integer.parseInt("12312");
		int num6=Integer.valueOf("434132");
		Integer num7=Integer.valueOf("423");
	}

}
