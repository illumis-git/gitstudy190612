package Chapter07;

import java.util.Scanner;

public class Ex06a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int menu;
		
		do {
			System.out.printf("\n�մ� �ֹ��Ͻðڽ��ϱ� ? \n");
			System.out.printf("<1>ī��� <2>īǪġ�� <3>�Ƹ޸�ī�� <4>�׸���ų���� => ");
			
			menu = S.nextInt();
			
			if(menu==1) {
				System.out.printf("#ī��� �ֹ��ϼ̽��ϴ�. \n");
			}
			else if(menu==2) {
				System.out.printf("#īǪġ�� �ֹ��ϼ̽��ϴ�. \n");
			}
			else if(menu==3) {
				System.out.printf("#�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�. \n");
			}
			else if(menu==4) {
				System.out.printf("�ֹ��Ͻ� Ŀ�� �غ��ϰڽ��ϴ�. \n");
			}
			else {
				System.out.printf("�߸� �ֹ��ϼ̽��ϴ�. \n");
			}
		}while(menu!=4);
	}

}
