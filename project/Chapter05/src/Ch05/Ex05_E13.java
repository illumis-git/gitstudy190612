package Ch05;

import java.util.Scanner;

public class Ex05_E13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int a,b;
		char ch;
		String str[];
		
		System.out.printf("������ ���ٷ� ����� �Է��ϼ��� : ");
		str=S.nextLine().split(" ");
		/**
		 * nextLine().split�� �����Ѱ͸��� �迭�� �����������
		 * �����ǰ�� ������ĭ���� �ٸ��迭�������ϰԵ�
		 * **/
		
		a=Integer.parseInt(str[0]);
		
		ch=str[1].charAt(0);
		
		b=Integer.parseInt(str[2]);
		
		switch(ch) {
		case'+':
			System.out.printf("%d + %d = %d �Դϴ�. \n", a,b,a+b);
			break;
		case'-':
			System.out.printf("%d - %d = %d �Դϴ�. \n", a,b,a-b);
			break;
		case'*':
			System.out.printf("%d * %d = %d �Դϴ�. \n", a,b,a*b);
			break;
		case'/':
			System.out.printf("%d / %d = %f �Դϴ�. \n", a,b,(float)a/b);
			break;
		case'%':
			System.out.printf("%d %% %d = %d �Դϴ�. \n", a,b,a%b);
			break;
		default:
			System.out.printf("�����ڸ� �߸� �Է��߽��ϴ�. \n");
			break;
		}
	}

}
