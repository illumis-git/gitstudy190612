import java.util.Scanner;

public class Ex03_4 {
  public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    System.out.print("정수를 입력하세요 ==> ");
    
    int a = S.nextInt();
    
    System.out.printf("10진수 ==> %d \n",a);
    System.out.printf("16진수 ==> %X \n",a);
    System.out.printf("18진수 ==> %o \n",a);
    
    S.close();
  }
}
