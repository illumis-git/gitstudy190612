import java.io.IOException;
import java.util.Scanner;

public class Ex77_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a, b, c;
		char Ca = 0;
		int result = 0;
		
		Scanner S = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��� �ּ���");
		a = S.nextInt();
		
		System.out.println("���� ���� �Է��� �ּ���");
		System.out.print("ex) +, -, *, /, %");
		Ca = (char) System.in.read();
		
		System.out.print("����° ���� �Է��� �ּ���");
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
			System.out.print("���� ���� �߸� �ԷµǾ����ϴ�");
		}
		if (result!=0) {
		System.out.print("�Էµ� ����"+Ca+"�� "+result+"�Դϴ�.");
		}
		else {
			System.out.print("�����°��� 0 �ϼ� �����ϴ�.");
		}
	}

}
