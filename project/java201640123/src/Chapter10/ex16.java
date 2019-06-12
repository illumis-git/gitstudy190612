package Chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ex16 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fileinputstream = new FileInputStream(args[0]);
		FileOutputStream fileoutputstream = new FileOutputStream(args[1]);
		int ch;
		
		while ((ch = fileinputstream.read())!=-1) {
			fileoutputstream.write((byte)ch);
		}
		System.out.println("복사완료");
		
		fileinputstream.close();
		fileoutputstream.close();
	}

}
