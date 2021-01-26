package chap06;

import java.util.Scanner;

public class Q9 {
	
	static int shellSort(int[] a, int n) {
		int count = 0;
		int h;
		for(h = 1; h < n/9; h = h * 3 + 1)
			;

		for(; h > 0; h /= 3) {
			for(int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for(j = i-h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
					count++;
				}
				a[j+h] = tmp;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� (���� 2)");
		System.out.print("��� �� : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		int count = shellSort(x, nx);
		
		System.out.println("������������ �����߽��ϴ�");
		for(int i = 0; i < nx; i++) {
			System.out.println("x["+i+"] : " + x[i]);
		}
		System.out.println("�̵� Ƚ�� : " + count);
	}
}