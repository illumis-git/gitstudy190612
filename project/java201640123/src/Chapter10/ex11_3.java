package Chapter10;

import java.io.BufferedReader;
import java.io.FileReader;

public class ex11_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("c:/javatest.txt");
		BufferedReader bReader = new BufferedReader(fReader);

		String str = null;
		int i = 1;
		
		while ((str = bReader.readLine()) != null) {
			System.out.println(i+"За : " + str);
			i++;
		}

		bReader.close();
		fReader.close();
	}

}
