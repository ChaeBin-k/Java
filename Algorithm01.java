//메소드 연습
public class Algorithm01 {
	//메소드는 메인 위에 클래스 안에 
	
	//이름, 학번, 학과를 출력하는 메소드
	public static void a() {
		System.out.println("이름: 가나다");
		System.out.println("학번: 22학번");
		System.out.println("학과: 컴퓨터공학과");
		System.out.println("-------------------");
	}
	
	//두 수를 더하는 메소드
	public static int num2(int a, int b) {
		int sum2 = a+b;
		return sum2;
	}
	
	//세 수를 더하는 메소드
	public static int num3(int c, int d, int e) {
		int sum3 = c+d+e;
		return sum3;
	}
	
	//오 수를 더하는 메소드
	public static int num5(int f, int g, int h, int i, int j) {
		int sum5 = f+g+h+i+j;
		return sum5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메소드 호출
		a();
		int su1 = 1;
		int su2 = 2;
		int su3 = 3;
		int su4 = 4;
		int su5 = 5;
		
		int hap1 = num2(su1, su2);
		System.out.println(su1 + "+" + su2 + "의 값은" + hap1 + "입니다.");
		
		int hap2 = num3(su3, su4, su5);
		System.out.println(su3 + "+" + su4 + "+" + su5 + "의 값은" + hap2 + "입니다.");
		
		int hap3 = num5(su1, su2, su3, su4, su5);
		System.out.println(su1 + "+" + su2 + "+" + su3 + "+" + su4 + 
				"+" + su5 +"의 값은" + hap3 + "입니다.");
		System.out.println("-------------------");
		
		System.out.println("hap1, hap2, hap3 중 더 큰 메소드입니다 ");
		if(hap1 < hap2) {
			System.out.println("hap2가 더 큽니다");
		}else if(hap2 < hap3){
			System.out.println("hap3이 더 큽니다");
		}else {
			System.out.println("hap1이 더 큽니다");
		} 
		System.out.println("-------------------");
		
		//배열 선언 {배열 각 값 할당 arr[0] = 1;}
		int arr[] = new int[5];
		int X = 0;
		for(int i = 0; i < arr.length; i++) {
			X+=i;
		}
		System.out.println("다음 배열의 합은 " + X + "입니다.");
		System.out.println("-------------------");
		
		

	}

}
