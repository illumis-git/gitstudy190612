package Ch04;

public class Ex04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100, b = 200;
		int q;
		
		q=test(a==b);
		System.out.printf("%d == %d 는 %s 이다.\n", a,b,q);
		q=test(a!=b);
		System.out.printf("%d != %d 는 %s 이다.\n", a,b,q);
		q=test(a>b);
		System.out.printf("%d > %d 는 %s 이다.\n", a,b,q);
		q=test(a<b);
		System.out.printf("%d < %d 는 %s 이다.\n", a,b,q);
		q=test(a>=b);
		System.out.printf("%d >= %d 는 %s 이다.\n", a,b,q);
		q=test(a<=b);
		System.out.printf("%d <= %d 는 %s 이다.\n", a,b,q);
		
		System.out.printf("%d = %d 는 %s 이다.\n", a,b,a=b);
	}
	
  private static int test(Boolean x) {
		// TODO Auto-generated method stub
		int i = (x)?1:0;
		return(i);
	}

}
