import java.util.Scanner;

public class AlgorithmHomework {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	        int[] arr = new int[5];

	        System.out.println("정수를 입력하세요:");
	        for (int i = 0; i < 5; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int max1 = arr[0];
	        int max2 = Integer.MIN_VALUE;

	        for (int i = 1; i < 5; i++) {
	            if (arr[i] > max1) {
	                max2 = max1;
	                max1 = arr[i];
	            } else if (arr[i] > max2) {
	                max2 = arr[i];
	            }
	        }
	        System.out.println("두 번째로 큰 수는: " + max2);
		
	
	}
}