package Chapter09;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String str, strRep, strSub, strAry[];
		int i;

		System.out.print("���ڿ��� �Է��ϼ��� : ");
		str = S.nextLine();

		strRep = str.replace(" ", "/");
		strSub = str.substring(3, 8);
		strAry = str.split(" ");

		System.out.println("�Է� ���ڿ� ==> " + str);
		System.out.println("�ٲ� ���ڿ� ==> " + strRep);
		System.out.println("�Ϻ� ���ڿ� ==> " + strSub);
		
		for (i = 0; i < strAry.length; i++) {
			System.out.println("�и��� ���ڿ�" + i + "==> " + strAry[i]);
		}
		
		System.out.printf("�и��� ���ڿ��� ����==>%d", strAry.length);
		
		S.close();
	}

}
