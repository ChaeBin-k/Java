
public class Algorithm18 {
	static class B{
		int a;
		int b;
		int c;
		
		public int sum() {
			return(a+b+c);
		}
		public double avg() {
			return(a+b+c)/3.0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob1 = new B();
		B ob2 = new B();
		B ob3 = new B();
		
		ob1.a = 10;
		ob2.b = 20;
		ob3.c = 30;
		System.out.print(ob1.sum());
		

	}

}
