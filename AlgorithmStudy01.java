import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmStudy01 {
	/*public static int GCD(int a, int b) {
		if(a % b == 0) {
			return b;
		}
		else {
			return GCD(b, a%b);
		}
	}
	
	public static int secMax(int arr5[]) {
		Arrays.sort(arr5);
		return arr5[arr5.length - 2];
	}*/
	public static int swap(int arr5[]) {
		Arrays.sort(arr5);
		return arr5[arr5.length];
	}

	public static void main(String[] args) {
		// GCD구하기
		Scanner sc = new Scanner(System.in);
		
		/*for(int i = 0; i < 5; i++) {
			System.out.println("정수 2개를 입력하시오.");
			int num11 = sc.nextInt();
			int num22 = sc.nextInt();
			
			int gcd6 = GCD(num11, num22);
			System.out.println(num11 + "과(와)"+num22 + "의 최대공약수는 " +gcd6+ " 입니다");
			System.out.println(" ");
		}
		sc.close();
		System.out.println("5번 반복했습니다. 반복을 끝냅니다.");*/
		
		/*int arr[] = {5,3,2,4,1};
		int hap = secMax(arr);
		System.out.print("배열에서 두 번째로 큰 수는 "+hap+" 입니다." );*/
		
		/*
		 * 배열에서 두 번쨰로 큰 수를 구하는 메소드를 선언한다
		 * 배열의 정렬한다
		 * 정렬한 배열에서 두 번째로 큰수를 찾늗다
		 * 정수 배열을 선언한다
		 * 앞에서 선언한 메소드를 사용해 배열을 정렬한다
		 * 두 번쨰로 큰 수를 출력한다
		 */
		/*int arry1[] = new int[6];
		int max = arry1[0];
		
		System.out.println("정수 5개를 입력하시오");
		for(int i = 1; i < arry1.length; i++) {
			arry1[i] = sc.nextInt();
			if(max < arry1[i]) {
				max = arry1[i];
			}
		}
		System.out.print("다음 배열에서 가장 큰 수는 " +max+ "입니다."); */
		
		/*int sum = 0;
		int arry2[] = {1,2,3,4,5};
		
		for(int i = 0; i < arry2.length; i++) {
			sum += arry2[i];
		}
		System.out.print("다음 배열의 합은 " +sum+ " 입니다.");*/
		
		/*int sum2 = 0;
		int arry3[] = {2,3,4,5,6};
		
		for(int i = 0; i < arry3.length; i++) {
			if(arry3[i] % 2 == 0) {
				sum2 += arry3[i];
			}
		}
		System.out.print("다음 배열에서 짝수의 합은 " +sum2+ " 입니다.");*/
		
		int arrt[] = {5,4,3,2,1};
		for(int i = 0; i < arrt.length; i++) {
		}
		
		int su[] = {5,4,3,2,1};
		
		for(int i = 0; i < su.length; i++) {
			int minIndex = i;
			for(int j = i+1; j < su.length; j++) {
				if(su[minIndex] > su[j]) {
					minIndex = j;
				}
			}
			int temp = su[minIndex];
			su[minIndex] = su[i];
			su[minIndex] = temp;
			System.out.print("정렬 후: " +temp+ " ");
		}
	}

}
