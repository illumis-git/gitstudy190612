package Chapter10;

import java.io.FileInputStream;

public class ex09 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("c:/chatbot/test.txt");
		
		int ch;
		
		while((ch=fis.read())!=-1){
			System.out.print((char)ch);
		}
		fis.close();
	}

}
