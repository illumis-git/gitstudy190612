import java.util.Scanner;

public class X_Y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner s = new Scanner(System.in);

		System.out.printf("x�� ���� �Է��ϼ���\n");
		x = s.nextInt();
		
		System.out.printf("y=(%dX%d)-(3X%d)-8\n", x,x,x);
		
		y=(x*x)-(3*x)-8;
		
		System.out.printf("y�� ���� %d�̴�.\n",y);

	}

}
