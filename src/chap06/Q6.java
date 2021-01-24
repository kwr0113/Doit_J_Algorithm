package chap06;

import java.util.Scanner;

public class Q6 {
	
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void selectionSort(int[] a, int n) {
		for(int i = 0; i < n-1; i++) {
			int min = i;
			for(int j = i+1; j < n; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			print(a, i, min);
			swap(a, i, min);
		}
	}
	
	static void print(int[] a, int i, int min) {
		for(int j = 0; j < a.length; j++) {
			if(j == i) {
				System.out.print(" * ");
			} else if (j == min) {
				System.out.print(" + ");
			} else {
				System.out.print("   ");
			}
		}
		System.out.println();
		for(int j = 0; j < a.length; j++) {
			System.out.printf(" %d ", a[j]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("선택 정렬");
		System.out.print("요소 수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		selectionSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다");
		for(int i = 0; i < nx; i++) {
			System.out.println("x["+i+"] : " + x[i]);
		}
	}

}
