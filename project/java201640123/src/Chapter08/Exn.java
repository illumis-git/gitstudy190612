package Chapter08;

import java.util.Scanner;

public class Exn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int data=0;
		String str;
		int i=0;
		
		while(i<=10){
			System.out.printf("%d번째 정수값을 입력해 주세요",i+1);
			str = S.nextLine();
			
			if(isNumeric(str)==false) {
				break;
			}
			
			data += Integer.parseInt(str);
			i++;
		}
		
		System.out.printf("입력된 값의 합은 %d입니다.", data);
		
	}
	
	public static boolean isNumeric(String s) {
		
		try {
		    Integer.parseInt(s);
		    return true;
		} catch(NumberFormatException e) {
		    return false;
		}
	}
}
