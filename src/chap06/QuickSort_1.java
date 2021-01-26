package chap06;

import java.util.Scanner;

public class QuickSort_1 {
	
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static int partition(int[]a, int left, int right) {
		int pc = (left + right)/2;
		int pivot = a[pc];
		int pl = left;
		int pr = right;
		swap(a, pl, pc);
		
		while(pl < pr) {
			while(a[pr] > pivot) pr--;
			while(a[pl] <= pivot && pl < pr) pl++;
			swap(a, pl, pr);
		}
		a[left] = a[pl];
		a[pl] = pivot;
		return pl;
	}
	
	static void quickSort(int[] a, int left, int right) {
		
		if(left >= right)
			return;
		
		int pc = partition(a, left, right);
		
		quickSort(a, left, pc-1);
		quickSort(a, pc+1, right);	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열을 나눕니다.");
		System.out.print("요소 수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		quickSort(x, 0, nx-1);
		
		System.out.println("오름차순으로 정렬했습니다");
		for(int i = 0; i < nx; i++) {
			System.out.println("x["+i+"] : " + x[i]);
		}
	
	}
}
