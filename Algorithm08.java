
public class Algorithm08 {
	public static int getMax(int arr[]) {
		int cnt = 0;
		int max = arr[0];
		cnt++;
		for(int i = 0; i < arr.length; i++) {
			cnt++;
			if(max < arr[i]) {
				max = arr[i];
				cnt++;
			}
		}
		System.out.println("기본연산 횟수" + cnt);
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println("getMaxinArr 시간복잡도 W(n) = 2n -1 ");
		
		System.out.println("getMaxInArr 시간복잡도 B(n)= n");
		System.out.println("getMaxInArr 시간복잡도 A(n)= 3/2n -3/2");
		System.out.println("n=7 : W(n) = 13, B(n)=7, A(n)= 10.5 + 1.5 = 12 ");
		
		System.out.print("1 : wost case");
		int arr1[] = {1,2,3,4,5,6,7};
		System.out.print("{1,2,3,4,5,6,7} max = " + getMax(arr1));
		
		int arr2[]= {7,2,4,3,1,5,6};
		System.out.println("2: Best Case");
		System.out.println("[7,2,4,3,1,5,6] max = "+getMax(arr2));
		System.out.println();
		
		int arr3[]= {2,4,3,7,1,5,6};
		System.out.println("3: Average Case");
		System.out.println("[7,2,4,3,1,5,6] max = "+getMax(arr3));
		

	}

}
