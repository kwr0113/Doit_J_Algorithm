package chap03;

import java.util.Scanner;

public class Q3 {
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int idxi = 0;
		
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				idx[idxi++] = i;
			}
		}
		
		return idxi;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		int[] ind = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 :");
		int ky = sc.nextInt();
		
		int idx = searchIdx(x, num, ky, ind);
		
		if(idx == 0) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "은(는) " + idx + "개 있습니다.");
		}

	}

}
