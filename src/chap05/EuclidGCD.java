package chap05;

import java.util.Scanner;

public class EuclidGCD {
	
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
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
