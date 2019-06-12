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
		 System.out.print("지급해야할 동전의 수는 ");
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
				 System.out.println(i+"번째 에게 지급해야할 동전의 수는 500원 " + token[0] + "개" + " 100원 " + token[1] + "개" + 
						 " 50원 " + token[2] + "개" + " 10원 " + token[3] + "개");
				
			 }
			System.out.println("각잔돈의합계는"+sum+"원입니다.");
	
	
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
	 
	 System.out.println("지급해야할 동전의 수는 500원 " + token[0] + "개" + " 100원 " + token[1] + "개"+" 50원 " + token[2] + "개"
			 + "개"+" 10원 " + token[3] + "개");
	*/
 }
}
/**
 iIl1L|oO0
 **/
