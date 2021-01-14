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
		
		System.out.println("�� �� ���� �ϼ��� ���մϴ�.");
		
		do {
			System.out.println("�� : ");
			int year = sc.nextInt();
			System.out.println("�� : ");
			int month = sc.nextInt();
			System.out.println("�� : ");
			int day = sc.nextInt();
			
			System.out.printf("�� �ذ� %d�� ���ҽ��ϴ�.\n", leftDayOfYear(year, month, day));
			
			System.out.println("�ѹ� �� �ұ��? (1. �� / 0. �ƴϿ�) : ");
			retry = sc.nextInt();
		}while(retry == 1);

	}

}
