
public class Algorithm09 {
	/*public static double sum(int a, int b) {
		if(a == b) {
			return a;
		}
		if(a > b) {
			return 0;	
		}
		int m = (a+b)/2;
		
		return sum(a,m)+sum(m+1,b);
	}*/
	
	public static int recFac(int n) {
		int res;
		if(n <= 1) {
			return 1;
		}else {
			res = n*recFac(n-1);
			return res;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int su1 = 1;
		int su2 = 2;
		double hap = sum(su1,su2);
		System.out.print(hap); */
		System.out.print(recFac(4)); 

	}

}
