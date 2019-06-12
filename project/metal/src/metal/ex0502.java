package metal;

public class ex0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[] =new int[100];
		int i;
		for(i=0; i<list.length; i++) {
			list[i]=(int) (Math.random()*100);
		}
		selection_sort(list, list.length);
		
		for(i=0; i<list.length; i++) {
			System.out.printf("%d\n",list[i]);
		}
	}
 static void selection_sort(int list[], int n) {
	 int i, j, least, temp = 0;
	 for(i=0; i<n-1;i++) {
		 least = i;
		 
		 for(j=i+1; j<n; j++) {
			 if(list[j]<list[least]) {
				 least=j;
				 
			 }
			 
		 }
		 //SWAP(list[i], list[least], temp);
		 temp = list[i];
		 list[i] = list[least];
		 list[least] = temp;
		 
	 }
 }
 static void SWAP(int x, int y, int t) {
	 t=x;
	 x=y;
	 y=t;
	 
 }
}
