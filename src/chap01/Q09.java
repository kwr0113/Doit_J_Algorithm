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
		
		System.out.println("n�� m ������ ��� ������ ���� ���մϴ�.");
		System.out.println("n�� �� : ");
		int n = stdIn.nextInt();
		System.out.println("m�� �� : ");
		int m = stdIn.nextInt();

		
		
		System.out.println(n + " �� " + m + " ������ ��� ������ ���� " + sumof(n,m) + " �Դϴ�.");

	}

}
