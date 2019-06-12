import java.util.Scanner;

public class Ex02_02 {
 public static void main(String[] args) {
	 int a, b;
	 int result;
	 
	 Scanner c = new Scanner(System.in);
	 System.out.print("첫번째 값을 입력해 주세요");
	 a = c.nextInt();
	 System.out.print("두번째 값을 입력해 주세요");
	 b = c.nextInt();
	 
	 result = a+b;
	 System.out.println(a + " + " + b + " = " + result);
	 result = a-b;
	 System.out.println(a + " - " + b + " = " + result);
	 result = a*b;
	 System.out.println(a + " * " + b + " = " + result);
	 result = a/b;
	 System.out.println(a + " / " + b + " = " + result);
 }
}
