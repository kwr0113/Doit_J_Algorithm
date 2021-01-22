package chap04;

public class Q7 {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() { }
	}
	
	public class OverFlowIntQueueException extends RuntimeException {
		public OverFlowIntQueueException() { }
	}
	
	public Q7(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enqueF(int x) throws OverFlowIntQueueException {
		if(num >= max) {
			throw new OverFlowIntQueueException();
		}
		que[rear++] = x;
		num++;
		if(rear == max) {
			rear = 0;
		}
		return x;
	}
	
	public int enqueR(int x) throws OverFlowIntQueueException {
		if(num >= max) {
			throw new OverFlowIntQueueException();
		}
		num++;
		if(--front < 0) {
			front = max-1;
		}
		que[front] = x;
		return x;
	}
	
	public int dequeF() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		int x = que[front++];
		num--;
		if(front == max) {
			front = 0;
		}
		return x;
	}
	
	public int dequeR() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		num--;
		if(--rear < 0) {
			rear = max-1;
		}
		int x = que[rear];
		return x;
	}
	
	public int peekF() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		return que[front];
	}
	
	public int peekR() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		return que[rear == 0 ? max-1 : rear-1];
	}
	
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(que[idx] == x) {
				return idx;
			}
		}
		return -1;
	}
	
	public void clear() {
		num = front = rear = 0;
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
				System.out.println(que[(i + front) % max] + " ");
			}
			System.out.println();
		}
	}
}
