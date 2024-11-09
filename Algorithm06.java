
public class Algorithm06 {
	public static int gcd(int a, int b){ //유클리드 호제법
		if (b == 0) return a;
	    return gcd(b, a % b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 28;
		int num2 = 46;
		
		int getGCD = gcd(num1,num2);
		System.out.print(getGCD);
		
		//시간복잡도
		
	}

}
