package Chapter07;

import java.util.Scanner;

public class EQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min;
		int si;
		int time;
		
		Scanner S = new Scanner(System.in);
		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		time = S.nextInt();
		
		si = time/3600;
		time = time%3600;
		
		min = time/60;
		time = time%60;
		
		System.out.printf("%d�ð� %d�� %d��", si, min, time);
		
	}

}
