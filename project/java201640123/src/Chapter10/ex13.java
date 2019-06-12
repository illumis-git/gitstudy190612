package Chapter10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ex13 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream F = new FileOutputStream("C:/javatest1.txt");
		
		int ch;
		
		while((ch =System.in.read())!=13) {
			F.write((byte)ch);
		}
		
		F.close();
	}

}
