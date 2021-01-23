package chap04;

public class Queue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() { }
	}
	
	public class OverFlowQueueException extends RuntimeException {
		public OverFlowQueueException() { }
	}
	
	public Queue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enque(int x) throws OverFlowQueueException {
		if(rear >= max) {
			throw new OverFlowQueueException();
		}
		que[rear++] = x;
		num++;
		return x;
	}
	
	public int deque() throws EmptyQueueException {
		if(front < 0) {
			throw new EmptyQueueException();
		}
		int x = que[front++];
		num--;
		return x;
	}
	
	public int peek() throws EmptyQueueException {
		if(num <= 0) {
			throw new EmptyQueueException();
		}
		return que[front];
	}
	
	public int indexOf(int x) {
		for(int i = front; i < rear; i++) {
			if(que[i] == x) {
				return i;
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
		return front <= 0;
	}
	
	public boolean isFull() {
		return rear >= max;
	}
	
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비어있습니다");
		} else {
			for(int i = front; i < rear; i++) {
				System.out.println(que[i] + " ");
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) {
		Queue que = new Queue(10);
		que.enque(1);
		que.enque(2);
		que.enque(3);
		que.enque(4);
		que.enque(5);
		que.dump();
		
		que.deque();
		que.deque();
		que.dump();
	}
}
