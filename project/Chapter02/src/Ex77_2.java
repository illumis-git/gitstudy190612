import java.io.IOException;
import java.util.Scanner;

public class Ex77_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a, b, c;
		char Ca = 0;
		int result = 0;
		
		Scanner S = new Scanner(System.in);
		
		System.out.print("첫번째 값을 입력해 주세요");
		a = S.nextInt();
		
		System.out.println("수식 값을 입력해 주세요");
		System.out.print("ex) +, -, *, /, %");
		Ca = (char) System.in.read();
		
		System.out.print("세번째 값을 입력해 주세요");
		c = S.nextInt();
		
		if(Ca=='+') {
			result = a + c;
			
		}
		else if(Ca=='-') {
			result = a-c;
			
		}
		else if(Ca=='*') {
			result = a*c;
			
		}
		else if(Ca=='/') {
			if(c!=0) {
			result = a/c;
			
			}
			else {
				
			}
		}
		else if(Ca=='%') {
			if(c!=0) {
			result = a%c;
			
			}
			else {
				
			}
		}
		else {
			System.out.print("수식 값이 잘못 입력되었습니다");
		}
		if (result!=0) {
		System.out.print("입력된 값의"+Ca+"는 "+result+"입니다.");
		}
		else {
			System.out.print("나누는값이 0 일수 없습니다.");
		}
	}

}
