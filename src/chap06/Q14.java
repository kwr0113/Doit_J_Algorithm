package chap06;

import java.util.Scanner;

public class Q14 {
	
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int pc = (pl + pr)/2;
		int pivot = 0;
		
		if(a[pl] < a[pr] && a[pr] < a[pc] || a[pc] < a[pr] && a[pr] < a[pl]) {
			pivot = pr;
		} else if(a[pr] < a[pc] && a[pc] < a[pl] || a[pl] < a[pc] && a[pc] < a[pr]) {
			pivot = pr;
		} else if(a[pc] < a[pl] && a[pl] < a[pr] || a[pr] < a[pl] && a[pl] < a[pc]) {
			pivot = pr;
		}

		int x = a[pivot];
		
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			if(pl <= pr) {
				swap(a, pl++, pr--);
			}
		} while(pl <= pr);
		
		if(left < pr) quickSort(a, left, pr);
		if(pl < right) quickSort(a, pl, right);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�迭�� �����ϴ�.");
		System.out.print("��� �� : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		quickSort(x, 0, nx-1);
		
		System.out.println("������������ �����߽��ϴ�");
		for(int i = 0; i < nx; i++) {
			System.out.println("x["+i+"] : " + x[i]);
		}
	
	}
}
