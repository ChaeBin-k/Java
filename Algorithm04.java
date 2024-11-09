//배열 연습
import java.util.Scanner;
public class Algorithm04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum1 = 0; // 홀 수 저장
		int sum2 = 0; // 짝 수 저장
		//int same = 0; // 두 배열에서 같은 값 저장하는 변수
		
		
		int arr[] = new int[10]; //크기가 10인 배열 선언
		for(int i = 1; i < arr.length; i++) {
			arr[i] = i + 1; 
		}
		System.out.println("홀수는 "); //홀수값 출력
		for (int num : arr) {
            if (num % 2 != 0) {
            	sum1 += num; //홀수값만 더하기
                System.out.println(num);
            } 
		}
		System.out.println("홀 수의 합은" + sum1 + "입니다");
		System.out.println("---------------");
		
		System.out.println("짝수는 "); //짝수값 출력
		for (int num1 : arr) {
            if (num1 % 2 == 0) {
            	sum2 += num1; //짝수값만 더하기
                System.out.println(num1);
            } 
		}
		System.out.println("짝 수의 합은" + sum2 + "입니다");
		System.out.println("---------------");
		
		//크키가 10인 정수 배열 두 개 선언 후 중복된 숫자 찾기
		//구현하세요
		
		//1부터 10까지 더하기
		int hap1 = 0; // 1부터 10까지 더한 값 저장하는 변수
		for(int i = 1; i < 11; i++) {
			hap1 += i;
		}
		System.out.println("1부터 10까지의 합은 " +hap1+ " 입니다");
		System.out.println("---------------");
		
		//1에서 입력 받은 수 까지 더하기
				System.out.print("n의 입력하시오");
				int hap2 = 0; //합저장 변수
				int n = sc.nextInt(); //입력받을 수 저장하는 변수
				for(int i = 1; i <= n; i++) {
					hap2 += i;
				}
				System.out.println("1부터 n까지 더한 값은 "+hap2+" 입니다");
				System.out.println("---------------");
				 
				System.out.println("1에서 n까지 수 중 짝수는 ");
				for(int i = 1; i <= n; i++) {
					if(i % 2 == 0) {
						System.out.println(i);
					}
				}
				System.out.println("---------------");
				
				System.out.println("1부터 n까지 수 중 3의 배수는 ");
				for(int i = 1; i <= n; i++) {
					if(i % 3 == 0) {
						System.out.println(i);
					}
				}
				System.out.println("---------------");
	}
}
