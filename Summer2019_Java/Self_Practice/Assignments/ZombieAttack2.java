package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}
		for (int i = 0; i < 20; i++) {
			if (i > 0) {
				for (int j = 0; j < inhabitants.length; j++) {
					boolean go = false;
					if (j == 0 && inhabitants[j + 1] == 0) {
						inhabitants[0] = (int) inhabitants[0] / 2;
					}
					if ((0 < j && j < inhabitants.length - 1) && (inhabitants[j - 1] == 0 || inhabitants[j + 1] == 0)) {
						if(j<6&&inhabitants[j]==1&&inhabitants[j+2]!=0) {
							inhabitants[j+1]*=2;
						}
						inhabitants[j] = (int) inhabitants[j] / 2;
					}
					if (j == inhabitants.length - 1 && inhabitants[inhabitants.length - 2] == 0) {
						inhabitants[inhabitants.length - 1] = (int) inhabitants[inhabitants.length - 1] / 2;
					}
				}
			}
			System.out.print("Day " + i + " ");
			System.out.println(Arrays.toString(inhabitants));
			int sum = 0;
			for (int j = 0; j < inhabitants.length; j++) {
				sum += inhabitants[j];
			}
			if (sum == 0) {
				break;
			}
		}

		System.out.println("---- EXTINCT ----");

	}

}
