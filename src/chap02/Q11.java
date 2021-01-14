package chap02;

import java.util.Scanner;

public class Q11 {
	
	int y;
	int m;
	int d;
		 
	Q11(int y, int m, int d) {
		 this.y = y;
		 this.m = m;
		 this.d = d;
	 }
			
	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
				
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0 ;
	}
		 
	 Q11 after(int n) {
		int ty = this.y;
		int tm = this.m;
		int td = this.d;
		 
		td += n;
		if(td > mdays[isLeap(ty)][tm-1]) {
			td -= mdays[isLeap(ty)][tm-1];
			tm++;
		}
		if(tm > 12) {
			tm -= 12;
			ty++;
		}

		Q11 ybm = new Q11(ty, tm, td);
			
		return ybm;
	 }
	 
	 Q11 before(int n) {
		 
		int ty = this.y;
		int tm = this.m;
		int td = this.d;
		 
		if(td - n <= 0) {
			td = mdays[isLeap(ty)][tm-2] + td - n;
			tm--;
		} else {
			td -= n;
		}
		
		if(tm <= 0) {
			tm += 12;
			ty++;
		}

		Q11 ybm = new Q11(ty,tm,td);
			
		return ybm;
	 }

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("날짜를 입력하세요.\n");
		System.out.print("년：");
		int y = stdIn.nextInt();
		System.out.print("월：");
		int m = stdIn.nextInt();
		System.out.print("일：");
		int d = stdIn.nextInt();
		Q11 date = new Q11(y, m, d);

		System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
		int n = stdIn.nextInt();

		Q11 d1 = date.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.y, d1.m, d1.d);

		Q11 d2 = date.before(n);
		System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.y, d2.m, d2.d);

		
	}
	
}
