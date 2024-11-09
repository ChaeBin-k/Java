
public class Algorithm16 {
	static int stack[] = new int[6];
	static int top =0;
	
	public static void push(int data) {
		if(isFull() == 0) {
			top++;
			stack[top] = data;
			System.out.println("|" + stack[top] + "|");
		}else {
			System.out.print("==Full==");
		}
	}
	
	public static int isFull() {
		if(top >= 5) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		push(6);
	}

}
