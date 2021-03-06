package chap02;

import java.util.Scanner;

public class Q07 {
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.printf(r + "|" + "  %5d \n", x);
		do {
			System.out.println(" +-------");
			d[digits++] = dchar.charAt(x % r);
			x /= r;
			System.out.printf(r + "|" + "  %5d  … ", x);
			System.out.println(d[(digits-1)]);
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
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수 : ");
				no = sc.nextInt();
			} while(no < 0);
			
			do {
				System.out.println("어떤 진수로 변환할까요? (2~36) : ");
				cd = sc.nextInt();
			} while(cd < 2 || cd > 36);
			
			dno = cardConvR(no, cd, cno);
			
			System.out.print(cd + "진수로는 ");
			for(int i = 0; i < dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.println("한번 더 할까요? (1. 예 / 0. 아니오) : ");
			retry = sc.nextInt();
		} while(retry == 1);
	}
}
