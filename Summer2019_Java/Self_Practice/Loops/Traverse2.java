package Loops;

public class Traverse2 {
	public static void main(String[] args) {
		int num=5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= num-1; i++) {
			for (int j = 1; j <= num-i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	//	5 4 3 2 1
//		5 4 3 2 
//		5 4 3
//		5 4 
//		5
		System.out.println();
		for (int i =1 ; i<=num; i++) {
			for (int j = num; j >= i ; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
