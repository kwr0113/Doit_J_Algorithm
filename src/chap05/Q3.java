package chap05;

import java.util.Scanner;

public class Q3 {
	
	static int gcd(int a, int b) {
		while (b != 0) {
			int c = a;
			a = b;
			b = c % b;
		}
		return a;
	}
	
	static int gcdArray(int[] a) {
		int t = gcd(a[0], a[1]);
		for(int i = 0; i < a.length - 1; i++) {
			t = gcd(t, a[i]);
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 ������ �Է��ϼ��� : ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("������ �Է��ϼ��� : ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("�ִ������� " + gcdArray(array) + " �Դϴ�.");

	}

}
