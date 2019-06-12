package Ch04;

import java.util.Scanner;

public class Ex04_E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Y=0;
		Scanner S = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요 : ");;
		Y=S.nextInt();
		if(Y%4==0) {
			if(Y%100!=0) {
				System.out.printf("%d 년은 윤년입니다.", Y);
			}
		}
		else if(Y%400==0) {
			System.out.printf("%d 년은 윤년입니다.", Y);
		}
		else {
			System.out.printf("%d 년은 윤년이아닙니다.", Y);
		}
		
	}

}
