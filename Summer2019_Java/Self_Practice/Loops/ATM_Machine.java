package Loops;

import java.util.Scanner;

public class ATM_Machine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int balance=10_000;
		System.out.print("Welcome to CyberBank. Please enter your PIN: ");
		int pin = scan.nextInt();
		int count = 0;
		while (true) {
			while (pin != 1234) {
				count++;
				if (count == 3) {
					System.err.println("You have entered 3 incorrect PIN. Please contact your customer assistant.");
					return;
				}
				System.err.print("Please enter the correct PIN: ");
				pin = scan.nextInt();
			}
			
			int action = transactionTypes();
			if (action == 1) {
				withdraw();
			}
			else if (action == 2) {
				deposit();
			}
			else if (action == 3) {
				transfer();
			}
			else if (action == 4) {
				exit();
			}
			else {
				System.err.println("Invalid input. Please try again...");
				transactionTypes();
			}
		}

	}
	
	

	private static int transactionTypes() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please choose your transaction type: ");
		System.out.println("1: Withdraw money");
		System.out.println("2: Deposit money");
		System.out.println("3: Transfer money");
		System.out.println("4: Return debit card");
		System.out.print("Selection: ");
		int action = scan.nextInt();
		return action;
	}

	private static void newTransaction() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Do you want to execute new transaction:");
		String answer = scan.next();
		if (answer.equalsIgnoreCase("yes")) {
			transactionTypes();
		} else if (answer.equalsIgnoreCase("no")) {
			exit();
		} else {
			do {
				System.out.print("Please enter a valid input (Yes/No): ");
				answer = scan.next();
			} while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));
		}
	
	}

	private static void withdraw() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the amount of money: ");
		int withdraw = scan.nextInt();
		while (withdraw > 1000) {
			System.err.println("Please select maximum $1000!");
			withdraw = scan.nextInt();
		}
		System.out.println("Please take your money from dispenser.");
		newTransaction();
	}

	private static void deposit () {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the amount of money: ");
		int deposit = scan.nextInt();
		while (deposit > 2000) {
			System.err.println("Please select maximum $2000!");
			deposit = scan.nextInt();
		}
		System.out.println("Please insert your money to dispenser.");
		newTransaction();
	}

	private static void transfer() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the account number: ");
		int account = scan.nextInt();
		System.out.print("Please enter the amount of money: ");
		int transfer = scan.nextInt();
		while (transfer > 1500) {
			System.err.println("Please select maximum $1500!");
			System.out.print("Please enter the amount of money: ");
			transfer = scan.nextInt();
		}
		System.out.println("$"+transfer+" has been transferred to the Account Number: "+account);
		newTransaction();
	}

	private static void exit() {
		System.out.println("Thank you for your cooperation. Please do not forget your debit card...");
		System.exit(0);
	}

}
