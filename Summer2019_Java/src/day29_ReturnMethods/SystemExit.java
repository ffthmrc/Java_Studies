package day29_ReturnMethods;

public class SystemExit {
	public static void main(String[] args) {
		System.out.println("Done");
		System.out.println(number());
		System.out.println("Completed");
	}

	public static int number() {
		if(true)
			System.exit(0);
		return 5;
	}

}
