
public class Algorithm11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su[] = {5,4,3,2,1};
		
		for(int i = su.length; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print(su[j]+" ");
			}
			System.out.println();
		}
		for(int i = 0; i < su.length; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(su[j]+" ");
			}
			System.out.println();
		}

	}

}
