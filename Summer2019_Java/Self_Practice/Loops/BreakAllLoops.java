package Loops;

public class BreakAllLoops {
	public static void main(String[] args) {
		int n = 10;
		
		boolean breakAll = false;
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n; j++) {
				
				if (i * j > 50) {
					breakAll = true;
				}
				if(breakAll==true) {
					break;
				}
				System.out.println(i + "x" + (j) + "=" + (i * j));
			}
		}
	}

}
