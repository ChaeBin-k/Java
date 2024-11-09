
public class Algorithm17 {
	static int queue[] = new int[5];
	static int front = -1;
	static int rear = -1;
	
	public static void enQueue(int data) {
		if(isFull() == 1) {
			System.out.print("Queue Full!!" + data + "is not in");
		}else {
			queue[++rear] = data;
		}
	}
	public static int isFull() {
		if(rear >= 4) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static void display() {
		System.out.println();
		for(int i = front + 1; i <= rear; i++) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enQueue(1);
		enQueue(2);
	}

}
