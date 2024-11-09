import java.util.Arrays;

public class Algorithm14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,3,7};
		int sortedAr[] = new int[arr.length];
		int idx = 0;
		int mid = (arr.length - 1)/2;
		System.out.print("mid" + mid);
		int i = 0;
		int j = mid+1;
		while(i <= mid && j <= arr.length-1) {
			if(arr[i] <= arr[j]) {
				idx++;
				i++;
			}
			else {
				sortedAr[idx] = arr[j];
				idx++;
				j++;
			}
		}
		while(i <= mid) {
			sortedAr[idx++] = arr[i++];
		}
		System.out.print(Arrays.toString(sortedAr));
		

	}

}
