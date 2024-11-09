//클래스 예제
class B{
	//필드 = 멤버변수
	int b;
	int c;	
	
	B(){ //생성자
		b = 0;
		c = 0;
		System.out.print("생성자 실행");
	}
	int hap1(int x, int y) { //두 정수의 합을 구하는 메소드
		int sum1 = x+y;
		return sum1;
	}
	double hap2(int q, int z) { //두 정수의 평균을 구하는 메소드
		double avg = (q+z)%2;
		return avg;
	}
	void printA() { //두 정수 변수를 출력하는 메소드
		System.out.print("정수1: " + b);
		System.out.print("정수1: " + c);
	}
	int GetA() {
		return b;
		//저렇게 어케 뽑는지 모르겠는데요 하기 싫엉 
	}
}

public class Algorithm03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B();
	}
}
