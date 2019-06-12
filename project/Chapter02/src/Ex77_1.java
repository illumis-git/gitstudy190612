import java.util.Scanner;

public class Ex77_1 {
 public static void main(String[] args) {
	 int a, b, d, e;
	 int result;
	 
	 Scanner c = new Scanner(System.in);
	 System.out.print("첫번째 값을 입력해 주세요");
	 a = c.nextInt();
	 System.out.print("두번째 값을 입력해 주세요");
	 b = c.nextInt();
	 System.out.print("세번째 값을 입력해 주세요");
	 d = c.nextInt();
	 System.out.print("네번째 값을 입력해 주세요");
	 e = c.nextInt();
	 
	 result = a+b+d+e;
	 System.out.println(a + " + " + b + " + " + d + " + " + e + " = " + result);
 }
}
