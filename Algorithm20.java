
public class Algorithm20 {
	static class Node{
		int data;
		Node next;
		Node(int d){ //매개변수 있는 생성자
			data =d;
		}
		Node(){ //기본 생성자
			
		}
	}
	public static void prtlist(Node h) {
		Node tmp = h;
		if(tmp == null) {
			System.out.println("비엇음");
		}
		while(tmp != null) {
			System.out.println(" " + tmp.data);
			if(tmp.next != null) {
				System.out.print("->");
			}
		}
		tmp = tmp.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node();
		Node tmp = new Node();
		
		Node no1 = new Node(10);
		head = no1;
		Node no2 = new Node(20);
		Node no3 = new Node(30);
		
		no1.next = no2;
		no2.next = no3;
		
		System.out.println("print list: ");
		tmp = head;
		while(tmp != null) {
			System.out.print(tmp.data);
			if(tmp.next != null) {
				System.out.print("->");
			}
			tmp = tmp.next;
		}
		System.out.println("메소드를 사용한 출력");
		prtlist(head);
		
		Node no4 = new Node(40);
		no3.next = no4;
		System.out.println("no4 추가하고 출력");
		prtlist(head);
		
		Node no5 = new Node(50);
		tmp = head;
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = no5;
		System.out.println("no5 끝에 추가 확인하고 출력");
		prtlist(head);
		
	}

}
