package chap01;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int n = 0;
		
		while(a > 0) {
			n++;
			a /= 10;
		}

		System.out.println("그 수는 " + n + "자리 입니다.");
	}

}
