package chap03;

import java.util.Scanner;

public class Q4 {
	
	static int binSearch(int[]a, int n, int key) {
		int pl = 0;
		int pr = n - 1;
		String[] plpcpr = new String[n];
		
		for(int i = 0; i < n; i++) {
			plpcpr[i] = "   ";
		}
		
		System.out.print("   |");
		for(int i = 0; i < n; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("---+--------------------");
		
		do {
			int pc = (pl + pr) / 2;
			plpcpr[pl] = " <- ";
			plpcpr[pr] = " -> ";
			plpcpr[pc] = " + ";
			System.out.print("   |");
			for(int j = 0; j < n; j++) {
				System.out.printf(plpcpr[j]);
			}
			System.out.printf("\n  %d|", pc);
			for(int k = 0; k < n; k++) {
				System.out.printf("%3d", a[k]);
			}
			System.out.println();
			if(a[pc] == key) {
				return pc;
			} else if (a[pc] < key) {
				pl = pc + 1;
			} else {
				pr = pc - 1;
			} 
			for(int i = 0; i < n; i++) {
				plpcpr[i] = "   ";
			}
		}while(pl <= pr);
		System.out.println();
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��Ҽ� : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է��ϼ���.");
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while ( x[i] < x [i-1]);
		}
		
		System.out.print("�˻��� �� : ");
		int ky = sc.nextInt();
		int idx = binSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
		}

	}

}
