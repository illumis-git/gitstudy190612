package Chapter07;

import java.util.Scanner;

public class Ex06a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int menu;
		
		do {
			System.out.printf("\n손님 주문하시겠습니까 ? \n");
			System.out.printf("<1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만시킬래요 => ");
			
			menu = S.nextInt();
			
			if(menu==1) {
				System.out.printf("#카페라떼 주문하셨습니다. \n");
			}
			else if(menu==2) {
				System.out.printf("#카푸치노 주문하셨습니다. \n");
			}
			else if(menu==3) {
				System.out.printf("#아메리카노 주문하셨습니다. \n");
			}
			else if(menu==4) {
				System.out.printf("주문하신 커피 준비하겠습니다. \n");
			}
			else {
				System.out.printf("잘못 주문하셨습니다. \n");
			}
		}while(menu!=4);
	}

}
