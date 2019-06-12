package Chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(new File("c:/number.txt"));
		
		int sum = 0;
		
		while (S.hasNextLine()) {
			sum += S.nextInt();
			System.out.println(sum);
		}
		System.out.println("гу╟Х : " + sum);
		S.close();
	}

}
