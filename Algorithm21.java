
public class Algorithm21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//960원 만들기
		int mon[] = {500, 100, 50, 10};
		int Total = 960;
		int ahr = 0;
		
		for(int i = 0; i < mon.length; i++) {
			if(Total / mon[i] > 0) {
				ahr += Total / mon[i];
				Total = Total % mon[i];
			}
		
		}
		System.out.print("동전 개수: " + ahr + "개");
		
		int arr[] = {1,2,3,3,2};
		

	}

}
