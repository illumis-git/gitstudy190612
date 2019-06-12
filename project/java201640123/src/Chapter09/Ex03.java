package Chapter09;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String str;

		System.out.print("문자열 입력 ==> ");
		str = S.nextLine();

		System.out.print("출력 문자열 ==> ");

		if (!str.startsWith("("))
			System.out.printf("(");

		for (int i = 0; i < str.length(); i++)
			System.out.printf("%c", str.charAt(i));

		if (!str.endsWith(")"))
			System.out.printf(")");
		
		S.close();
	}

}
