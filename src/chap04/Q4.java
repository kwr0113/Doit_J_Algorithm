package chap04;

public class Q4 {
	private int max;
	private int num;
	private int[] que;
	
	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() { }
	}
	
	public class OverFlowQueueException extends RuntimeException {
		public OverFlowQueueException() { }
	}
	
	public Q4(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enque(int x) throws OverFlowQueueException {
		if(num >= max) {
			throw new OverFlowQueueException();
		}
		que[num++] = x;
		return x;
	}
	
	public int deque() throws EmptyQueueException {
		if(num <= 0) {
			throw new EmptyQueueException();
		}
		int x = que[0];
		num--;
		for(int i = 0; i < num; i++) {
			que[i] = que[i+1];
		}
		return x;
	}
	
	public int peek() throws EmptyQueueException {
		if(num <= 0) {
			throw new EmptyQueueException();
		}
		return que[num-1];
	}
	
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			if(que[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public void clear() {
		num = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비어있습니다");
		} else {
			for(int i = 0; i < num; i++) {
				System.out.println(que[i] + " ");
			}
			System.out.println();
		}
	}
}
