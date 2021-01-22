package chap04;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("���� ������ �� : " + s.size() + " / " + s.capacity());
			System.out.println("(1) Ǫ��   (2) ��    (3) ��ũ   (4) ����   (5) �˻�");
			System.out.println("(6) ���� ��ü ����     (7) ���� ���� Ȯ��     (0) ����");
			
			int menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
			
			int x;
			switch (menu) {
				case 1: 
					System.out.println("������ : ");
					x = sc.nextInt();
					try {
						s.push(x);
					} catch (IntStack.OverFlowIntStackException e) {
						System.out.println("������ ���� á���ϴ�");
					}
					break;
				
				case 2: 
					try {
						x = s.pop();
						System.out.println("���� �����ʹ� : " + x + " �Դϴ�.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("������ ��� �ֽ��ϴ�.");
					}
					break;
				
				case 3: 
					try {
						x = s.peek();
						System.out.println("��ũ�� �����ʹ� : " + x + " �Դϴ�.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("������ ��� �ֽ��ϴ�.");
					}
					break;
				
				case 4: 
					s.dump();
					break;	
					
				case 5: 
					System.out.println("�˻��� �����͸� �Է��ϼ���");
					x = sc.nextInt();
					if(s.indexOf(x) == -1) {
						System.out.println("�ش� �����ʹ� �������� �ʽ��ϴ�");
					} else {
						System.out.println("�ش� �����ʹ� " + s.indexOf(x) + " �� �����մϴ�");
					}
					break;
					
				case 6: 
					s.clear();
					break;
				
				case 7: 
					if(s.isEmpty()) {
						System.out.println("������ ����ֽ��ϴ�");
					} else {
						System.out.println("������ ������� �ʽ��ϴ�");
					}
					if(s.isFull()) {
						System.out.println("������ ���� �� �ֽ��ϴ�");
					} else {
						System.out.println("������ ���� �� ���� �ʽ��ϴ�");
					}
					break;
				default:
			}
		}
	}
}
