package chap01;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = n * (n+1) / 2;
				
		System.out.println("1���� " + n + " ������ ���� " + sum + " �Դϴ�.");
	}

}
