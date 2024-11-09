import java.util.Arrays;

public class Algorithm13 {
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static int partSort(int[] a, int left, int right) {
		int low = left + 1;
		int high = right;
		int pivot = a[left];
		
		while(low <= high) {
			while(low <= right && a[low] < pivot) {
				low++;
			}
			while(high >= left && a[high] > pivot) {
				high--;
			}
			if(low <= high) {
				swap(a, low, high);
				low++;
				high--;
			}
		}
		swap(a, left, high);
		return high;
	}
	
	public static void quickSort(int[] a, int left, int right) {
		if(left < right) {
			int q = partSort(a, left, right);
			quickSort(a, left, q-1);
			quickSort(a, q+1, right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {8,1,2,3,7,4,9};
		System.out.println("Original array: " + Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println("Sorted array: " + Arrays.toString(arr));
		

	}

}
