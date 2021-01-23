package chap05;

import java.util.Scanner;

public class Q2 {
	
	static int gcd(int a, int b) {
		while (b != 0) {
			int c = a;
			a = b;
			b = c % b;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();		
		System.out.print("정수를 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.println("최대공약수는 " + gcd(a,b) + " 입니다.");

	}

}
