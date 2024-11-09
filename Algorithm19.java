
public class Algorithm19 {
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
		}
		Node(){
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node();
		Node tmp = new Node();
		
		Node no1 = new Node(10);
		head = no1;
		Node no2 = new Node(20);
		Node no3 = new Node(30);
		Node no4 = new Node(40);
		Node no5 = new Node(50);
		
		no1.next = no2;
		no2.next = no3;
		no3.next = no4;
		no4.next = no5;
		
		System.out.print("Print: ");
		tmp = head;
		while(tmp != null) {
			System.out.print(tmp.data + " -> ");
			tmp = tmp.next;
			
			if(tmp == null) {
				System.out.print("END");
			}
		}

	}

}
