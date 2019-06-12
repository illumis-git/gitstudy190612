package Chapter06;

import java.util.Scanner;

public class Ex06_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int i;
		int j;
		int data = S.nextInt();
		
		for(i=2; i<=9; i++) {
			if(i==data) {
				for(j=1; j<=9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
			}
			System.out.printf("\n");
		}
	}

}
