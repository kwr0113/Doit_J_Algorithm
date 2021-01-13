package chap02;

import java.util.Scanner;

public class ArrayEqual {
	
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�迭 a�� ��� �� : ");
		int numa = sc.nextInt();
		
		int[] a = new int[numa];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("�迭 b�� ��� �� : ");
		int numb = sc.nextInt();
		
		int[] b = new int[numb];
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("�迭 a�� b�� " + (equals(a, b) ? "�����ϴ�." : "���� �ʽ��ϴ�."));

	}

}
