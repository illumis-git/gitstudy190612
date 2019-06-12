package Chapter07;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int data=0;
		
		for(i=0;i<=100;i++) {
			
			if(i%3==0) {
				continue;
			}
			if(data>1000) {
				break;
			}
			
			data +=i;
			System.out.printf("%d \n", data);
		}
		System.out.printf("1부터 100까지의 합에서 1000을넘어가는때는 %d번째 %d입니다.", i,data);
	}

}
