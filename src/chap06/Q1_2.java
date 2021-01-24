package chap06;

import java.util.Scanner;

public class Q1_2 {
	
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a, int n) {
		int k = n - 1;
		while(k > 0) {
			int last = 0;
			for(int j = 0; j < k; j++) {
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
					last = j;
				}
			}
			k = last;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전3)");
		System.out.print("요소 수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다");
		for(int i = 0; i < nx; i++) {
			System.out.println("x["+i+"] : " + x[i]);
		}
	}

}
