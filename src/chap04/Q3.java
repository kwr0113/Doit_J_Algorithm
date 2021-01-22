package chap04;

public class Q3 {
	private int max;
	private int ptrT;	
	private int ptrB;
	private int[] stk;
	
	public class EmptyStackException extends RuntimeException {
		public EmptyStackException() { }
	}
	
	public class OverFlowStackException extends RuntimeException {
		public OverFlowStackException() { }
	}
	
	public Q3(int capacity) {
		max = capacity;
		ptrT = max-1;
		ptrB = 0;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int pushT(int x) throws OverFlowStackException {
		if(ptrT <= ptrB) {
			throw new OverFlowStackException();
		}
		return stk[ptrT--] = x;
	}
	
	public int pushB(int x) throws OverFlowStackException {
		if(ptrB >= ptrT) {
			throw new OverFlowStackException();
		}
		return stk[ptrB++] = x;
	}
	
	public int popT() throws EmptyStackException {
		if(ptrT >= max - 1) {
			throw new EmptyStackException();
		}
		return stk[++ptrT];
	}
	
	public int popB() throws EmptyStackException {
		if(ptrB <= 0) {
			throw new EmptyStackException();
		}
		return stk[--ptrB];
	}

	public int peekT() throws EmptyStackException {
		if(ptrT >= max -1) {
			throw new EmptyStackException();
		}
		return stk[ptrT+1];
	}
	
	public int peekB() throws EmptyStackException {
		if(ptrB <= 0) {
			throw new EmptyStackException();
		}
		return stk[ptrB-1];
	}
	
	public int indexOfT(int x) {
		for(int i = ptrT + 1; i < max; i++) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}	
	
	public int indexOfB(int x) {
		for(int i = ptrB - 1; i >= 0; i--) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public void clearT() {
		ptrT = max-1;
	}
	
	public void clearB() {
		ptrB = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int sizeT() {
		return max - ptrT - 1;
	}
	
	public int sizeB() {
		return ptrB;
	}
	
	public boolean isEmptyT() {
		return ptrT >= max - 1;
	}
	
	public boolean isEmptyB() {
		return ptrB <= 0;
	}
	
	public boolean isFullT() {
		return ptrT <= ptrB;
	}
	
	public boolean isFullB() {
		return ptrB >= ptrT;
	}
	
	public void dumpT() {
		if(ptrT <= ptrB) {
			System.out.println("스택이 비어있습니다");
		} else {
			for(int i = max-1; i > ptrT; i--) {
				System.out.println(stk[i] + " ");
			}
			System.out.println();
		}
	}
	
	public void dumpB() {
		if(ptrB >= ptrT) {
			System.out.println("스택이 비어있습니다");
		} else {
			for(int i = 0; i < ptrB; i++) {
				System.out.println(stk[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Q3 s = new Q3(20);
		
		System.out.println("B 12345 추가 / T 12345 추가");
		s.pushB(1);
		s.pushB(2);
		s.pushB(3);
		s.pushB(4);
		s.pushB(5);
		
		s.pushT(1);
		s.pushT(2);
		s.pushT(3);
		s.pushT(4);
		s.pushT(5);
		
		System.out.println("BT 출력");
		s.dumpB();
		s.dumpT();
		
		System.out.println("B 팝 / T 팝");
		s.popB();
		s.popT();
		
		System.out.println("BT 출력");
		s.dumpB();
		s.dumpT();
		
		s.isEmptyB();
		s.isEmptyT();
		
		s.isFullB();
		s.isFullT();
		
		System.out.println("B 67895 추가 / T 67897 추가");
		s.pushB(6);
		s.pushB(7);
		s.pushB(8);
		s.pushB(9);
		s.pushB(5);

		s.pushT(6);
		s.pushT(7);
		s.pushT(8);
		s.pushT(9);
		s.pushT(7);
		
		System.out.println("BT 출력");
		s.dumpB();
		s.dumpT();
		
		System.out.println("BT peek 출력");
		System.out.println(s.peekB());
		System.out.println(s.peekT());
		
		System.out.println("BT indexOf(3)");
		System.out.println(s.indexOfB(3));
		System.out.println(s.indexOfT(3));
	}
}
