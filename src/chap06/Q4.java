package chap06;

import java.util.Scanner;

public class Q4 {
	
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a, int n, int p, int m) {
		int k = 0, i = 0;
		while(k < n-1) {
			int last = n-1;
			System.out.println("�н�" + (i+1) + ":");
			for(int j = n-1; j > k; j--) {
				if(a[j-1] > a[j]) {
					print(a, j-1, 1);
					swap(a, j-1, j);
					p++;
					m++;
					last = j;
				} else {
					print(a, j-1, 0);
					m++;
				}
			}
			for(int j = 0; j < a.length; j++) {
				System.out.printf(" %d  ",a[j]);
			}
			System.out.println();
			i++;
			k = last;
		}
		System.out.println("�񱳸� " + m + "ȸ �߽��ϴ�.");
		System.out.println("��ȯ�� " + p + "ȸ �߽��ϴ�.");
	}	

	static void print(int[] a, int j, int m) {
		for(int i = 0; i < a.length; i++) {
			System.out.printf(" %d ",a[i]);
			if(i == j) {
				System.out.print(m == 1 ? "+" : "-");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ����(����3)");
		System.out.print("��� �� : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		int p = 0;
		int m = 0;
		
		bubbleSort(x, nx, p, m);
	}
}
