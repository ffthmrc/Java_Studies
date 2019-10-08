package day29_ReturnMethods;

import java.util.Arrays;

public class returnMethodsPractice {
	
	public static void main(String[] args) {
		sum(10,20);
		int num=addition(15, 25);
		System.out.println(addition(2,3));
		System.out.println(num);
		int max=(int)greater(23,11,12);
		System.out.println(max);
		int[] array= {1,3,2,4,6,5,7,6,8};
		int numMax=larger(array);
		System.out.println(numMax);
		String[] names= {"Defne Ela", "Murat", "Betul", "Yusuf"};
		System.out.println(longestName(names));
		
		int[] arr= {1,4,3,6,7,2,8,5,9};
		System.out.println(Arrays.toString(arr));
		arr=sortDescending(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	public static int addition(int a, int b) {
		return a+b;
	}
	public static double greater(int a, int b, int c) {
		int[] arr= {a,b,c};
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	public static int larger(int arr[]) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	public static String longestName(String[] array) {
		String longestName="";
		int max=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i].length()>max) {
				max=array[i].length();
				longestName=array[i];
			}
		}
		return longestName;
	}
	public static int[] sortDescending(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[j]>array[i]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		return array;
	}

}
