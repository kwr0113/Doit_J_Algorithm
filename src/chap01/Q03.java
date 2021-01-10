package chap01;

import java.util.Scanner;

public class Q03 {

	static int min4(int a, int b, int c, int d) {
		int min = a;
		if ( b < min ) min = b;
		if ( c < min ) min = c;
		if ( d < min ) min = d;
		
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(min4(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
	}


}
