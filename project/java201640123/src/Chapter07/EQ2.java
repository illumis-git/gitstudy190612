package Chapter07;

public class EQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 20;
		int a;
		int b;
		int c;
		int i,j,k;
		int Data = 0;
		int Data1 = 0;
		int Data2 = 0;
		
		for (i=1; i<20; i++) {
			for (j=1; j<20; j++) {
				for(k=1; k<20; k++) {
					if((k*k)*(j*j)==(i*i)&&(i+j+k<20)) {
						Data = k;
						Data1 = j;
						//System.out.printf("%d\n", Data);
					}
				}
			}
		}
		Data2 = (int) Math.sqrt((Data*Data)+(Data1*Data1));//a^2+b^2=c^2 9+16=25 
		 System.out.printf("%d, %d, %d", Data,Data1,Data2);
	}

}
