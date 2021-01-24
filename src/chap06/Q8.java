package chap06;

import java.util.Scanner;

public class Q8 {
	
	static void insertionSort(int[] a, int n) {
		for(int i = 1; i < n; i++) {
			int pl = 0;
			int pr = i-1;
			int pc, pd;
			int tmp = a[i];
			
			do {
				pc = (pl + pr) / 2;
				if (a[pc] == tmp) 
					break;
				else if (a[pc] < tmp)
					pl = pc + 1;
				else
					pr = pc - 1;
			} while (pl <= pr);
			
			pd = (pl <= pr) ? pc + 1 : pr + 1;

			for(int j = i; j > pd; j--) {
				a[j] = a[j-1];
			}
			a[pd] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삽입 정렬");
		System.out.print("요소 수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		insertionSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다");
		for(int i = 0; i < nx; i++) {
			System.out.println("x["+i+"] : " + x[i]);
		}
	}

}
