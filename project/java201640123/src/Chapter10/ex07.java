package Chapter10;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String str1, str2, str3;

		System.out.print("단어 3개 입력 : ");
		str1 = S.next();
		str2 = S.next();
		str3 = S.next();

		System.out.print("입력된 문자열 ==> ");
		System.out.print(str1 + "," + str2 + "," + str3);
	}

}
