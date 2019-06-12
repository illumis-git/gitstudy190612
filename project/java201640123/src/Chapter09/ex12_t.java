package Chapter09;

import java.util.Scanner;

public class ex12_t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sel;
		int ju = 3;
		int juva = 500;
		int sa = 3;
		int sava = 700;
		int co = 3;
		int cova = 900;
		int jucnt = 0, sacnt=0, cocnt=0;
		int result =0;
		
		Scanner S = new Scanner(System.in);

		while (true) {
			System.out.println("구입할 상품번호를 입력해주세요 <1>쥬스 <2>사이다 <3>콜라 <4>구매종료");
			sel = S.nextInt();
			if (ju > 0 && sel == 1) {
				ju -= 1;
				jucnt +=1;
				Select(sel);
			} else if (sel == 1) {
				System.out.println("쥬스가이미 매진되었습니다.");

			}
			if (sa > 0 && sel == 2) {
				sa -= 1;
				sacnt +=1;
				Select(sel);
			} else if (sel == 2) {
				System.out.println("사이다가이미 매진되었습니다.");

			}
			if (co > 0 && sel == 3) {
				co -= 1;
				cocnt +=1;
				Select(sel);
			} else if (sel == 3) {
				System.out.println("콜라가이미 매진되었습니다.");

			}
			if (sel==4) {
				End(jucnt, sacnt, cocnt);
				System.out.printf("총 가격은 %d 원입니다.", (jucnt*juva)+(sacnt&sava)+(cocnt*cova));
				break;
			}
			if (ju == 0 && sa == 0 && co == 0) {
				System.out.println("전부 매진되었습니다.");
				break;
			}
		}

	}

	static void Select(int x) {

		switch (x) {
		case 1:
			System.out.println("쥬스(500원)를 선택하셨습니다.");
			break;
		case 2:
			System.out.println("사이다(700원)를 선택하셨습니다.");
			break;
		case 3:
			System.out.println("콜라(900원)를 선택하셨습니다.");
			break;
		default:
			System.out.println("잘못 선택하셨습니다.");
			break;
		}
	}
	
	static void End(int x, int y, int z) {
		if(x>0) {
			System.out.printf("쥬스 %d개 ",x);
		}
		if(y>0) {
			System.out.printf("사이다 %d개 ",y);
		}
		if(z>0) {
			System.out.printf("콜라 %d개 구입하셨습니다. ",z);
		}
	}
}
