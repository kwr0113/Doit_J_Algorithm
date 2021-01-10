package chap01;

import java.util.Scanner;

public class Q15 {
	
	static void triangleLB(int n) {
		System.out.println("왼쪽 아래가 직각");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {	
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		System.out.println("왼쪽 위가 직각");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < (n-i); j++) {	
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		System.out.println("오른쪽 위가 직각");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i-1; j++) {	
				System.out.printf(" ");
			}
			for(int j = 0; j < (n-i); j++) {	
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		System.out.println("오른쪽 아래가 직각");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < (n-i-1); j++) {	
				System.out.printf(" ");
			}
			for(int j = 0; j <= i; j++) {	
				System.out.printf("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		triangleLB(n);
		triangleLU(n);
		triangleRB(n);
		triangleRU(n);
		


	}

}
