package Chapter08;

import java.util.Scanner;

public class Ex12_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char[] stack = new char[5];
		int top = 0;
		int i;

		char carName = 'A';
		int select = 9;

		while (select != 3) {
			System.out.printf("<1> �ڵ��� �ֱ� <2> �ڵ��� ���� <3> �� : ");
			select = s.nextInt();

			switch (select) {
			case 1:
				if (top >= 5) {
					System.out.printf("�ͳ��� �� ���� ���� �� ��\n");
				} else {
					stack[top] = carName++;
					System.out.printf(" %c �ڵ����� �ͳο� ��\n", stack[top]);
					top++;
				}
				break;

			case 2:
				if (top <= 0) {
					System.out.printf("�������� �ڵ����� ����\n");
				} else {
					top--;
					System.out.printf(" %c �ڵ����� �ͳο��� ����\n", stack[0]);
					stack[0] = ' ';
					for (i=0; i<=(top-1);i++) {
						stack[i] = stack[i+1];
						if(top==1) {
							carName='A';
						}
					}
				}
				break;

			case 3:
				System.out.printf("���� �ͳο� %d�밡 ����.\n", top);
				System.out.printf("���α׷��� �����մϴ�.\n");
				break;

			default:
				System.out.printf("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���. \n");
			}
		}
		
		s.close();

	}

}
