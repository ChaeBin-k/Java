import java.util.Arrays;

public class AlgorithmHomework2 {

	public static int sum(int arr[]) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static int sum1(int arr1[]) {
		int sum1 = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] % 2 != 0) {
				sum1 += arr1[i];
			}
		}
		return sum1;
	}
	
	public static int sum2(int arr2[]) {
		int sum2 = 0;
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] % 2 == 0) {
				sum2 += arr2[i];
			}
		}
		return sum2;
	}

	public static int Max(int arr3[]) {
		int Max = 0;
		for(int i = 0; i <arr3.length; i++) {
			if(arr3[i] > Max) {
				Max = arr3[i];
			}
		}
		return Max;
	}
	
	public static int Min(int arr4[]) {
		int Min = arr4[0];
		for(int i = 0; i < arr4.length; i++) {
			if(arr4[i] < Min) {
				Min = arr4[i];
			}
		}
		return Min;
	}
	
	public static int SecMax(int arr5[]) {
		Arrays.sort(arr5);
		return arr5[arr5.length - 2];
	}
	public static int getMaxTwoNum(int n, int m) {
		if(n > m) {
			return n;
		}else {
			return m;
		}
	}
	
	public static int getMaxArr(int arr[], int left, int right) {
		int max;
		if(left == right) {
			return arr[left];
		}
		int mid = (left + right) / 2;
		max = getMaxTwoNum(getMaxArr(arr, left, mid),getMaxArr(arr,mid+1, right));
		return max;
		
	}
	
	
	public static void main(String[] args) {
		int [] arry = {1,2,3,4,5};
		System.out.print(getMaxArr(arry, 0, 2));

	}
	public static int sum3(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n + sum3(n - 1);
		}
	}

}
