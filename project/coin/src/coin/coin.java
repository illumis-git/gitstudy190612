package coin;

import java.io.IOException;
import java.util.Scanner;

public class coin {
 public static void main (String[] args) throws IOException {
	 int[] Data = {574510,660400,275690};
	 int sum = 0;
	 int[] result = {0,0,0,0};
	 int c = 0;
	 int i=0;
	 
	 
	 for(i=0; i<Data.length; i++){
		 int token[] = new int[] {0,0,0,0};
		 result[i] = Data[i]%1000;
		 System.out.print("�����ؾ��� ������ ���� ");
		 sum += result[i];
		 if(result[i]>=500) {
			 c = result[i]%500;
			 token[0] = result[i]/500;
			 
		 }
			 if(result[i]>=100) {
				 result[i] %=500;
				 token[1] = result[i]/100;
				 c = result[i]%100;
			 }
				 
				 if(result[i]>=50) {
					 result[i] %=100;
					 token[2] = result[i]/50;
					 c = result[i]%50;
					 
				 }
				 if(result[i]>=10) {
					 result[i] %=50;
					 token[3] = result[i]/10;
					 
				 }
				 System.out.println(i+"��° ���� �����ؾ��� ������ ���� 500�� " + token[0] + "��" + " 100�� " + token[1] + "��" + 
						 " 50�� " + token[2] + "��" + " 10�� " + token[3] + "��");
				
			 }
			System.out.println("���ܵ����հ��"+sum+"���Դϴ�.");
	
	
	 /*
	 if(s>=500) {
		 c = s%500;
		 token[0] = s/500;
		 if(c>=100) {
			 token[1] = c/100;
			 c = c%100;
			 if(c>=50) {
				 token[2] = c/50;
				 c = c%50;
			 }
			 if(c>=10) {
				 token[3] = c/10;
			 }
			 
		 }
		
	 }
	 
	 System.out.println("�����ؾ��� ������ ���� 500�� " + token[0] + "��" + " 100�� " + token[1] + "��"+" 50�� " + token[2] + "��"
			 + "��"+" 10�� " + token[3] + "��");
	*/
 }
}
/**
 iIl1L|oO0
 **/
