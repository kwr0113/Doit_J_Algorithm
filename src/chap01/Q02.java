package chap01;

import java.util.Scanner;

public class Q02 {

	static int min3(int a, int b, int c) {
		int min = a;
		if ( b < min ) min = b;
		if ( c < min ) min = c;
		
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(min3(sc.nextInt(),sc.nextInt(),sc.nextInt()));
	}

}
