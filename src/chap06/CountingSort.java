package chap06;

import java.util.Scanner;

public class CountingSort {
	
	static void countingSort(int[] a, int n) {
		int max = a[0];
		for(int i = 0; i < n; i++) {
			if(a[i] > max)
				max = a[i];
		}
		
		int[] counting = new int[max+1];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++) counting[a[i]]++;
		for(int i = 1; i <= max; i++) counting[i] += counting[i-1];
		for(int i = n-1; i >= 0; i--) b[--counting[a[i]]] = a[i];
		for(int i = 0; i < n; i++) a[i] = b[i];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카운팅 정렬");
		System.out.print("요소 수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		countingSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다");
		for(int i = 0; i < nx; i++) {
			System.out.println("x["+i+"] : " + x[i]);
		}
	}
}
