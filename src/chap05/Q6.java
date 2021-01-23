package chap05;

import java.util.Scanner;

public class Q6 {
	
	static void move(int no, int x, int y) {
		if (no > 1) {
			move (no-1, x, 6-x-y);
		}
		System.out.println("원반[" + no + "]을 "+ Alphabet(x) +" 기둥에서 "+ Alphabet(y) +" 기둥으로 옮김");
		if (no > 1) {
			move (no-1, 6-x-y, y);
		}
	}
	
	static char Alphabet(int i) {
		char c;
		switch(i) {
		case 1: 
			c = 'A';
			break;
		case 2: 
			c = 'B';
			break;
		case 3: 
			c = 'C';
			break;
		default:
			c =' ';
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하노이의 탑 원반 개수 : ");
		int n = sc.nextInt();
		
		move(n, 1, 3);
	}	
}
