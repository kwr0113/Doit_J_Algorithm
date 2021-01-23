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
		
		System.out.println("�� ������ �ִ������� ���մϴ�.");
		
		System.out.print("������ �Է��ϼ��� : ");
		int a = sc.nextInt();		
		System.out.print("������ �Է��ϼ��� : ");
		int b = sc.nextInt();
		
		System.out.println("�ִ������� " + gcd(a,b) + " �Դϴ�.");

	}

}
