import java.util.Scanner;

public class Ex02_02 {
 public static void main(String[] args) {
	 int a, b;
	 int result;
	 
	 Scanner c = new Scanner(System.in);
	 System.out.print("ù��° ���� �Է��� �ּ���");
	 a = c.nextInt();
	 System.out.print("�ι�° ���� �Է��� �ּ���");
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
