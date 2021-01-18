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
		
		System.out.print("��Ҽ� : ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		int[] ind = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� �� :");
		int ky = sc.nextInt();
		
		int idx = searchIdx(x, num, ky, ind);
		
		if(idx == 0) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println(ky + "��(��) " + idx + "�� �ֽ��ϴ�.");
		}

	}

}
