package merge;

import java.util.Arrays;

public class merge {
 public static void main (String[] args) {
	 int a[] = {6, 14, 18, 20 ,29};
	 int b[] = {1, 2, 15, 25, 30, 45};
	 int c[] = new int[a.length+b.length];
	 int d[] = new int[a.length+b.length];
	 
	 for (int i=0; i<a.length; i++) {
		 c[i]=a[i];
	 }
	 for (int i=0; i<b.length; i++) {
		 c[i+a.length]=b[i];
	 }
	 Arrays.sort(c);
	 for (int i=0; i<c.length; i++) {
	   System.out.print(c[i] + " ");
	 }
 }
}
