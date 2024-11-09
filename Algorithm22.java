
public class Algorithm22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int br[] = {0,0,0,0,0};
		int m = 1000000;
		for(int i = 0; i < arr.length; i++) {
			m = 10000;
			for(int j = 0; j < br.length; j++) {
				if(br[j] == 0 && arr[j] < m) {
					m = arr[j];
				}
			}
			for(int j = 0; j < arr.length; j++) {
				if(br[j] == 0 && arr[j] == m) {
					System.out.print(" " + j);
					br[j] = 1;
					break;
				}
			}
		}
	}

}
