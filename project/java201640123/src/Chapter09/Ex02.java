package Chapter09;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String str;

		System.out.print("문자열 입력 ==> ");
		str = S.nextLine();

		System.out.print("출력 문자열 ==> \n");
		
		for (int i = 0; i < str.length(); i++) {
			System.out.printf("%c", str.charAt(i)+1);
		}
		
		System.out.println();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.printf("%c", str.charAt(i)-1);
		}
		
		S.close();
	}
}