package Chapter09;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String str, strRep, strSub, strAry[];
		int i;

		System.out.print("문자열을 입력하세요 : ");
		str = S.nextLine();

		strRep = str.replace(" ", "/");
		strSub = str.substring(3, 8);
		strAry = str.split(" ");

		System.out.println("입력 문자열 ==> " + str);
		System.out.println("바꾼 문자열 ==> " + strRep);
		System.out.println("일부 문자열 ==> " + strSub);
		
		for (i = 0; i < strAry.length; i++) {
			System.out.println("분리한 문자열" + i + "==> " + strAry[i]);
		}
		
		System.out.printf("분리된 문자열의 개수==>%d", strAry.length);
		
		S.close();
	}

}
