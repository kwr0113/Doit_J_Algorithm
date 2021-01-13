package chap02;

import java.util.Scanner;

public class Q3 {
	
	static int sumOf(int[] a) {
		int total = 0;
		for(int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("¿ä¼Ò ¼ö : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.println(sumOf(x));

	}

}
