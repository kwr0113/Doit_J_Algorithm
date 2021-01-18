package chap03;

import java.util.Scanner;

public class Q2 {
	
	static int seqSearchSen(int[] a, int n, int key) {
		System.out.print("   |");
		for(int i = 0; i < n; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("---+--------------------");
		for(int i = 0; i < n; i++) {
			System.out.print("   |");
			for(int j = 0; j < i; j++) {
				System.out.printf("   ");
			}
			System.out.print("  *");
			System.out.printf("\n  %d|", i);
			for(int k = 0; k < n; k++) {
				System.out.printf("%3d", a[k]);
			}
			System.out.println();
			System.out.println("   |");
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	static int seqSearch(int[] a, int n, int key) {
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 :");
		int ky = sc.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		}

	}

}
