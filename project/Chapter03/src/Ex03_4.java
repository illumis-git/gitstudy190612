import java.util.Scanner;

public class Ex03_4 {
  public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    System.out.print("������ �Է��ϼ��� ==> ");
    
    int a = S.nextInt();
    
    System.out.printf("10���� ==> %d \n",a);
    System.out.printf("16���� ==> %X \n",a);
    System.out.printf("18���� ==> %o \n",a);
    
    S.close();
  }
}
