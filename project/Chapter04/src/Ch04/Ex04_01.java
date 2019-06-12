package Ch04;

public class Ex04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b=5,c=3;
		float f;
		
		a = b + c;
		System.out.printf("%d + %d = %d \n", b,c,a);

		a = b - c;
		System.out.printf("%d - %d = %d \n", b,c,a);
		
		a = b * c;
		System.out.printf("%d * %d = %d \n", b,c,a);
		
		f = (float) b / c;
		System.out.printf("%d / %d = %.1f \n", b,c,f);
		
		a = b % c;
		System.out.printf("%d %% %d = %d \n", b,c,a);
	}

}