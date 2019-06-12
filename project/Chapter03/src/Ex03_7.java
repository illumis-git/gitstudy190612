import java.util.Scanner;

public class Ex03_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		
		String str;
		int i;
		
		System.out.print("문자열을 입력 ==> ");
		str = S.nextLine();
		
		for(i=str.length()-1; i>=0; i--) {
			System.out.printf("%c", str.charAt(i));
		}
		System.out.printf("\n");
	}

}
