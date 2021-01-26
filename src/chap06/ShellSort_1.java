package chap06;

import java.util.Scanner;

public class ShellSort_1 {
	
	static void shellSort(int[] a, int n) {
		int h = n;
		do {
			h = h/3+1;
			for(int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for(j = i-h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
				}
				a[j+h] = tmp;
			}
		} while(h != 1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("셸 정렬 (버전 2)");
		System.out.print("요소 수 : ");
		//int nx = sc.nextInt();
		int[] x = new int[15];
		
		for(int i = 15; i > 0; i--) {
			x[15-i] = i;
		}
		
		shellSort(x, 15);
		
		System.out.println("오름차순으로 정렬했습니다");
		for(int i = 0; i < 15; i++) {
			System.out.println("x["+i+"] : " + x[i]);
		}
	}
}
