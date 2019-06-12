package Chapter06;

import java.util.Scanner;

public class Ex06_X16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String S1;
		
		System.out.printf("글자를 입력해 주세요 :");
		S1 = S.nextLine();
		StringBuffer Sb = new StringBuffer(S1);
		System.out.printf(Sb.reverse().toString());
	}

}
