package Ch04;

public class Ex04_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100, num2 = -200;
		
		boolean a = (num1 !=0);
		
		boolean b = (num2!=0);
		
		System.out.printf("상수의 AND연산 : %s \n", a&&b);
		System.out.printf("상수의 OR연산 : %s \n", a||b);
		System.out.printf("상수의 NOT연산 : %s \n", !a);
	}

}
