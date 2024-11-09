//public 클래스 위에 새로운 클래스 셍성 // 클래스 연습
class A{
	//속성(변수)
	int a;
	
	A(){ //메소드
		a = 1;
		System.out.println("생성자 실행"); //클래스는 그냥 모르겠는데 
		System.out.println("a = " +a);
	}
	void printA() { //이거의 의미는 뭐고 
		System.out.println("a = " +a);
	}
	int GetA() { //얘의 의미는 뭐임? 
		return a;
	}
} // 클래스A끝
public class Algorithm02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A();
		

	}
}
