package Chapter06;

import java.util.Scanner;

public class Ex06_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		
		int i;
		
		System.out.printf("���� �Է��� �ּ��� = ");
		int data = S.nextInt();
		
		for(i=9; i>0; i--) {
			System.out.printf("%d * %d = %d\n", data, i, data*i);
		}
		
	}

}
