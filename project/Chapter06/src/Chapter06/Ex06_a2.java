package Chapter06;

import java.util.Scanner;

public class Ex06_a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		
		System.out.printf("���� �Է��� �ּ��� = ");
		int data = S.nextInt();
		
		int i;
		int result=1;
		
		if(data!=0) {
			if(data>0) {
				for(i=data;i>0;i--) {
					System.out.printf("%d \n",data);
					result *= data;
					data--;
				}
				System.out.printf("%d \n",result);
			}
			else if(data<0) {
				for(i=data;i<0;i++) {
					//System.out.printf("%d \n",data);
					result *= data;
					data++;
				}
				if(result<0) {
					System.out.printf("%d \n",result);
				}
				else {
					System.out.printf("-%d \n",result);
				}
			}
		}
		else {
			System.out.printf("�Է°��� 0�� �ü� �����ϴ�.");
		}
	}

}
