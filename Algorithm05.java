import java.util.Vector;

public class Algorithm05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//12의 약수 구하기 {1 2 3 4 6 12}
				for(int i = 1; i < 12; i++) {
					if(12 % i == 0) {
						System.out.println("12의 약수는 " + i + " 입니다");
					}
				}
		//6의 약수 구하기
				for(int i = 0; i < 6; i++) {
					if(6 % i == 0) {
						System.out.print("6의 약수는 " + i + " 입니다");
					}
				}
				
		
				//두 배열에서 같은 원소 찾고 출력
				int arr [] = {1,2,3,4,5};
				int arr2 [] = {3,4,5,6,7};
				
				int max = arr[0];
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr2.length; j++) {
						if(arr[i]== arr2[j]) {
							if(max < arr[i]) {
								max = arr[i];
								System.out.println("두 배열에서 중복되는 원소는 " +max+ " 입니다.");
							}
						}
					}
				}
				*/
				
				//두 배열에서 가장 큰 값 찾고 출력
		
		
				/*
				//벡터 활용해서 최대 공약수 구하기 [28 48]
				int count = 0; //약수를 저장하기 위한 변수
				
				// 약수 개수 계산
		        for (int i = 1; i <= 28; i++) {
		            if (28 % i == 0) {
		                count++;
		            }
		        }
		        
		        // 약수를 저장할 배열 생성
		        int[] arrV = new int[count]; //count 크기에 맞게 배열의 생성
		        int index = 0; //배열의 값을 저장할 떄 사용
		        
		        // 약수를 배열에 저장
		        for (int i = 1; i <= 28; i++) {
		            if (28 % i == 0) {
		            	arrV[index] = i;
		                index++;
		            }
		        }
		        
		        // 결과 출력
		        System.out.println("28의 약수는:");
		        for (int i = 0; i < arrV.length; i++) {
		            System.out.print(arrV[i] + " ");
		        }
		        */
		        
		        //벡터를 사용해서 값 구하기
		        Vector<Integer> vc1 = new Vector<Integer>();
		        for(int i = 1; i <= 28; i++) {
		        	if(28 % i == 0) {
		        		vc1.add(i);
		        		i++;
		        	}
		        }
		        System.out.print("28의 약수는: ");
		        for(int i = 0; i < vc1.size(); i++) {
		        	System.out.print(vc1.size() + " "); 
		        }
				
			}
}
