package Chapter10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		//FileWriter Fw = new FileWriter("c:/javatest1.txt");
		PrintWriter Pw = new PrintWriter("c:/javatest1.txt");
		String str;

		while (!(str = S.nextLine()).equals("")) {
			Pw.println(str);
			
		}
		Pw.close();
	}

}
