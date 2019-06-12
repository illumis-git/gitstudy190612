package Ch05;

import java.util.Scanner;

public class Ex05_E13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int a,b;
		char ch;
		String str[];
		
		System.out.printf("수식을 한줄로 띄어쓰기로 입력하세요 : ");
		str=S.nextLine().split(" ");
		/**
		 * nextLine().split은 지정한것마다 배열에 나누어서저장함
		 * 지금의경우 띄어쓰기한칸마다 다른배열에저장하게됨
		 * **/
		
		a=Integer.parseInt(str[0]);
		
		ch=str[1].charAt(0);
		
		b=Integer.parseInt(str[2]);
		
		switch(ch) {
		case'+':
			System.out.printf("%d + %d = %d 입니다. \n", a,b,a+b);
			break;
		case'-':
			System.out.printf("%d - %d = %d 입니다. \n", a,b,a-b);
			break;
		case'*':
			System.out.printf("%d * %d = %d 입니다. \n", a,b,a*b);
			break;
		case'/':
			System.out.printf("%d / %d = %f 입니다. \n", a,b,(float)a/b);
			break;
		case'%':
			System.out.printf("%d %% %d = %d 입니다. \n", a,b,a%b);
			break;
		default:
			System.out.printf("연산자를 잘못 입력했습니다. \n");
			break;
		}
	}

}
