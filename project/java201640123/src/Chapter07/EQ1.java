package Chapter07;

import java.util.Scanner;

public class EQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float FD;
		Float CD;
		
		Scanner S = new Scanner(System.in);
		System.out.print("ȭ��(F)�µ��� �Է��� �ּ��� : ");
		FD = S.nextFloat();
		
		CD = (FD-32)*5/9;
				
		System.out.printf("\nȭ���µ�(F)%f�� �����µ�(C)�� ��ȯ�� ������� %f�Դϴ�.", FD, CD);
	}

}
