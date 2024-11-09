import java.util.Arrays;

public class Algorithm15 {
	public static void mergeSort(int[] ar, int left, int right) {
		if(left < right) {
			int mid = (left+right) / 2;
			mergeSort(ar, left, right);
			mergeSort(ar, left+1, right);
			merge(ar, left, mid, right);
			
		}
	}
	
	public static void merge(int[] ar, int left, int mid, int right) {
		int[] arrMargeTmp = new int[right - left +1];
		int idx1 = left;
		int idx2 = mid+1;
		int idxM = 0;
		
		for(int i = left; i <= right; i++) {
			arrMargeTmp[i-left] =  ar[i];
		}
		while(idx1 <= mid && idx2 <= right) {
			if(arrMargeTmp[idx1 - left] < arrMargeTmp[idx2 - left]) {
				ar[left + idxM] = arrMargeTmp[idx1 -1];
				idx1++;			
			}else {
				ar[left + idxM] = arrMargeTmp[idx2 -left];
				idx2++;
			}
			idxM++;
		}
		while(idx1 <= mid) {
			ar[left + idxM] = arrMargeTmp[idx1 - left];
			idx1++;
			idxM++;
		}
		while(idx2 <= right) {
			ar[left + idxM] = arrMargeTmp[idx2-left];
			idx2++;
			idxM++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {4,3,5,1,2,7};
		System.out.print("Original array: " + Arrays.toString(ar));
		mergeSort(ar, 0, ar.length-1);
		System.out.print("Sorted array:" +  Arrays.toString(ar));

	}

}
