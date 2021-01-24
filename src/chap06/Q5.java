package chap06;

import java.util.Scanner;

public class Q5 {
	
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void CocktailSort(int[] a, int n) {
		int i = 1;
		int l = 0;
		int r = n-1;
		int last = n-1;
		while(l != r) {
			if(i % 2 == 1) {
				for(int j = r; j > l; j--) {
					if(a[j-1] > a[j]) {
						swap(a, j-1, j);
						last = j;
					}
				}
				l = last;
			} else if (i % 2 == 0) {
				for(int j = l; j < r; j++) {
					if(a[j] > a[j+1]) {
						swap(a, j, j+1);
						last = j;
					}
				}
				r = last;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전1)");
		System.out.print("요소 수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		CocktailSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다");
		for(int i = 0; i < nx; i++) {
			System.out.println("x["+i+"] : " + x[i]);
		}
	}

}
