import java.util.Scanner;

public class Ex03_5 {
  public static void main (String[] args) {
	Scanner S = new Scanner(System.in);
	int result=0;
	String b;
	
	System.out.print("입력진수 결정 <1>10 <2>16 <3>8 : ");
	int a = S.nextInt();
	
	System.out.print("값 입력 : ");
	
	if (a==1) {
		b = S.next();
		result = Integer.parseInt(b,10);
	}
	if (a==2) {
		b = S.next();
		result = Integer.parseInt(b,16);
	}
	if (a==3) {
		b = S.next();
		result = Integer.parseInt(b,8);
	}
	
	System.out.printf("10진수 ==> %d \n",result);
    System.out.printf("16진수 ==> %X \n",result);
    System.out.printf("18진수 ==> %o \n",result);
  }
}
