package Chapter09;

import java.util.Scanner;

public class ex12_t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sel;
		int ju = 3;
		int juva = 500;
		int sa = 3;
		int sava = 700;
		int co = 3;
		int cova = 900;
		int jucnt = 0, sacnt=0, cocnt=0;
		int result =0;
		
		Scanner S = new Scanner(System.in);

		while (true) {
			System.out.println("������ ��ǰ��ȣ�� �Է����ּ��� <1>�꽺 <2>���̴� <3>�ݶ� <4>��������");
			sel = S.nextInt();
			if (ju > 0 && sel == 1) {
				ju -= 1;
				jucnt +=1;
				Select(sel);
			} else if (sel == 1) {
				System.out.println("�꽺���̹� �����Ǿ����ϴ�.");

			}
			if (sa > 0 && sel == 2) {
				sa -= 1;
				sacnt +=1;
				Select(sel);
			} else if (sel == 2) {
				System.out.println("���̴ٰ��̹� �����Ǿ����ϴ�.");

			}
			if (co > 0 && sel == 3) {
				co -= 1;
				cocnt +=1;
				Select(sel);
			} else if (sel == 3) {
				System.out.println("�ݶ��̹� �����Ǿ����ϴ�.");

			}
			if (sel==4) {
				End(jucnt, sacnt, cocnt);
				System.out.printf("�� ������ %d ���Դϴ�.", (jucnt*juva)+(sacnt&sava)+(cocnt*cova));
				break;
			}
			if (ju == 0 && sa == 0 && co == 0) {
				System.out.println("���� �����Ǿ����ϴ�.");
				break;
			}
		}

	}

	static void Select(int x) {

		switch (x) {
		case 1:
			System.out.println("�꽺(500��)�� �����ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("���̴�(700��)�� �����ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("�ݶ�(900��)�� �����ϼ̽��ϴ�.");
			break;
		default:
			System.out.println("�߸� �����ϼ̽��ϴ�.");
			break;
		}
	}
	
	static void End(int x, int y, int z) {
		if(x>0) {
			System.out.printf("�꽺 %d�� ",x);
		}
		if(y>0) {
			System.out.printf("���̴� %d�� ",y);
		}
		if(z>0) {
			System.out.printf("�ݶ� %d�� �����ϼ̽��ϴ�. ",z);
		}
	}
}
