
public class Algorithm12 {
	public static void swap(int[]a,int i, int j) {
		int temp = a[i];
		 a[i] = a[j];
		 a[j] = temp;
	}
	public static void selectsort(int[]a) {
		for(int i = 0; i < a.length - 1; i++) {
			int minIdx = i;
			
			for(int j= 1; j < a.length; j++) {
				if(a[j] < a[minIdx]) {
					minIdx = j;
				}
			}
			swap(a, minIdx, 1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,6,7,3,5};
		selectsort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
			
		}
	}

}
