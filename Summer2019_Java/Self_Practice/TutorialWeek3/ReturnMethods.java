package TutorialWeek3;

public class ReturnMethods {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3=2;
		int num4=3;
		int num5=9;
		
		multiplication(num1, num2);
		System.out.println(sum(num1,num2, num5));
		float c = sum(num3, num4)+199;
		System.out.println((int)c);
		
	}

	private static float sum(int num3, int num4) {
		int result=(num4-num3)+sum(num3, num4, num3);
		return result;
	}

	private static int sum(int a, int b, int c) {
		int result=(a+b)*multiplication(2, 3);
		return result;
	}

	public static int multiplication(int a, int b) {

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (i * j <= 100) {
					System.out.println("i*j=" + i * j);
					continue;
				} 
				System.out.println("Jack");
			}
		}
		System.out.println("Jerry");
		return a;
	}
}
