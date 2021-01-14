package chap02;

import java.util.Scanner;

public class Q04 {
	
	static void copy(int[] a, int[] b) {
		
		for(int i = 0; i < a.length; i ++) {
			b[i] = a[i]; 
		}
		
		//b = a.clone();
		
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("¿ä¼Ò ¼ö : ");
		int num = sc.nextInt();
		
		int[] a = new int[num];
		int[] b = new int[num];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		copy(a, b);
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] : " + b[i]);
		}
	}

}
