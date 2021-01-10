package chap01;

import java.util.Scanner;

public class Q09 {
	
	static int sumof(int n, int m) {
		
		int sum = 0;
		
		if(n > m) {
			for(int i = m; i < n+1; i++) {
				sum += i;
			}	
		} else if (m > n) {
			for(int i = n; i < m+1; i++) {
				sum += i;
			}
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("n과 m 사이의 모든 정수의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = stdIn.nextInt();
		System.out.println("m의 값 : ");
		int m = stdIn.nextInt();

		
		
		System.out.println(n + " 과 " + m + " 사이의 모든 정수의 합은 " + sumof(n,m) + " 입니다.");

	}

}
