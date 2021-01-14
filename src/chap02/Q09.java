package chap02;

import java.util.Scanner;

public class Q09 {
	
	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0 ;
	}
	
	static int leftDayOfYear(int y, int m, int d) {
		int leftDays = mdays[isLeap(y)][m-1] - d;
		
		for(int i = 11; i >= m; i--) {
			leftDays += mdays[isLeap(y)][i];
		}
		return leftDays;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 남은 일수를 구합니다.");
		
		do {
			System.out.println("년 : ");
			int year = sc.nextInt();
			System.out.println("월 : ");
			int month = sc.nextInt();
			System.out.println("일 : ");
			int day = sc.nextInt();
			
			System.out.printf("그 해가 %d일 남았습니다.\n", leftDayOfYear(year, month, day));
			
			System.out.println("한번 더 할까요? (1. 예 / 0. 아니요) : ");
			retry = sc.nextInt();
		}while(retry == 1);

	}

}
