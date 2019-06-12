package Chapter08;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa= new int[100];
		int bb[] = new int[100];
		int i,j;
		
		for(i=0,j=99;i<100;i++,j--) {
			aa[i]=i*2;
			bb[j]=aa[i];
		}
		
		System.out.printf("bb[0]ดย %d, bb[99]ดย %d ภิทยตส\n", bb[0],bb[99]);
	}

}
