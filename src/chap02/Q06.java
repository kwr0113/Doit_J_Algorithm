package chap02;

import java.util.Scanner;

public class Q06 {
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while(x != 0);
		
		for (int i = 0; i < digits / 2; i++) {
			char temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.println("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = sc.nextInt();
			} while(no < 0);
			
			do {
				System.out.println("� ������ ��ȯ�ұ��? (2~36) : ");
				cd = sc.nextInt();
			} while(cd < 2 || cd > 36);
			
			dno = cardConvR(no, cd, cno);
			
			System.out.print(cd + "�����δ� ");
			for(int i = 0; i < dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");
			
			System.out.println("�ѹ� �� �ұ��? (1. �� / 0. �ƴϿ�) : ");
			retry = sc.nextInt();
		} while(retry == 1);
	}
}
