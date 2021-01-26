package chap06;

import java.util.Scanner;

public class QQQ {
	
	public static int partition(int[] array, int left, int right) {
	    int mid = (left + right) / 2;
	    swap(array, left, mid);
	 
	    int pivot = array[left];
	    int i = left, j = right;
	 
	    while (i < j) {
	        while (pivot < array[j]) {
	            j--;
	        }
	 
	        while (i < j && pivot >= array[i]) {
	            i++;
	        }
	        swap(array, i, j);
	    }
	    array[left] = array[i];
	    array[i] = pivot;
	    return i;
	}
	 
	public static void swap(int[] array, int a, int b) {
	    int temp = array[b];
	    array[b] = array[a];
	    array[a] = temp;
	}
	 
	public static void quicksort(int[] array, int left, int right) {
	    if (left >= right) {
	        return;
	    }
	 
	    int pi = partition(array, left, right);
	 
	    quicksort(array, left, pi - 1);
	    quicksort(array, pi + 1, right);
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
		
		quicksort(x, 0, nx-1);
		
		System.out.println("������������ �����߽��ϴ�");
		for(int i = 0; i < nx; i++) {
			System.out.println("x["+i+"] : " + x[i]);
		}
	
	}

}
