package chap04;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.println("(1) 푸시   (2) 팝    (3) 피크   (4) 덤프   (5) 검색");
			System.out.println("(6) 스택 전체 삭제     (7) 스택 상태 확인     (0) 종료");
			
			int menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
			
			int x;
			switch (menu) {
				case 1: 
					System.out.println("데이터 : ");
					x = sc.nextInt();
					try {
						s.push(x);
					} catch (IntStack.OverFlowIntStackException e) {
						System.out.println("스택이 가득 찼습니다");
					}
					break;
				
				case 2: 
					try {
						x = s.pop();
						System.out.println("팝한 데이터는 : " + x + " 입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				
				case 3: 
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 : " + x + " 입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				
				case 4: 
					s.dump();
					break;	
					
				case 5: 
					System.out.println("검색할 데이터를 입력하세요");
					x = sc.nextInt();
					if(s.indexOf(x) == -1) {
						System.out.println("해당 데이터는 존재하지 않습니다");
					} else {
						System.out.println("해당 데이터는 " + s.indexOf(x) + " 에 존재합니다");
					}
					break;
					
				case 6: 
					s.clear();
					break;
				
				case 7: 
					if(s.isEmpty()) {
						System.out.println("스택이 비어있습니다");
					} else {
						System.out.println("스택이 비어있지 않습니다");
					}
					if(s.isFull()) {
						System.out.println("스택이 가득 차 있습니다");
					} else {
						System.out.println("스택이 가득 차 있지 않습니다");
					}
					break;
				default:
			}
		}
	}
}
