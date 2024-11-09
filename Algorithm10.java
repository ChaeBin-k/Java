
//배열에서 큰 수를 분할 정복을 통해 구하기
public class Algorithm10 {
	public static int findMax(int[] arr, int low, int high) {
        if (low == high) { // 배열의 길이가 1인 경우
            return arr[low];
        } else {
            int mid = (low + high) / 2;
            int leftMax = findMax(arr, low, mid); // 왼쪽 부분 배열에서 최댓값 찾기
            int rightMax = findMax(arr, mid + 1, high); // 오른쪽 부분 배열에서 최댓값 찾기
            return Math.max(leftMax, rightMax); // 두 부분 배열에서의 최댓값 반환
        }
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
		// TODO Auto-generated method stub
		int[] arr = {5, 10, 7, 25, 15};
        int max = findMax(arr, 0, arr.length - 1);
        System.out.println("최댓값: " + max);
		
        int ar[] = {1,3,2};
        System.out.print(getMaxArr(ar, 0, 2));

	}

}
