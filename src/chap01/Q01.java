package chap01;

import java.util.Scanner;

public class Q01 {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		if ( b > max ) max = b;
		if ( c > max ) max = c;
		if ( d > max ) max = d;
		
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(max4(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
	}

}
