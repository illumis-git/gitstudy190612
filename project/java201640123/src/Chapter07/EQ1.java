package Chapter07;

import java.util.Scanner;

public class EQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float FD;
		Float CD;
		
		Scanner S = new Scanner(System.in);
		System.out.print("화씨(F)온도를 입력해 주세요 : ");
		FD = S.nextFloat();
		
		CD = (FD-32)*5/9;
				
		System.out.printf("\n화씨온도(F)%f를 섭씨온도(C)로 변환한 결과값은 %f입니다.", FD, CD);
	}

}
