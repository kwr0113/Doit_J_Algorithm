package chap01;

import java.util.Scanner;

public class Q17 {
	
	static void npira(int n) {
		System.out.println("숫자 피라미드 출력");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i-1; j++) {
				System.out.printf(" ");
			}
			for(int k = 0; k < 1+i+i; k++) {	
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		npira(n);

	}

}
