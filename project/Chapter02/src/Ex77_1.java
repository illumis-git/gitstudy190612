import java.util.Scanner;

public class Ex77_1 {
 public static void main(String[] args) {
	 int a, b, d, e;
	 int result;
	 
	 Scanner c = new Scanner(System.in);
	 System.out.print("ù��° ���� �Է��� �ּ���");
	 a = c.nextInt();
	 System.out.print("�ι�° ���� �Է��� �ּ���");
	 b = c.nextInt();
	 System.out.print("����° ���� �Է��� �ּ���");
	 d = c.nextInt();
	 System.out.print("�׹�° ���� �Է��� �ּ���");
	 e = c.nextInt();
	 
	 result = a+b+d+e;
	 System.out.println(a + " + " + b + " + " + d + " + " + e + " = " + result);
 }
}
