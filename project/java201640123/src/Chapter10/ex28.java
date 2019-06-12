package Chapter10;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(new File("c:/in.txt"));
		FileReader filereader = new FileReader("c:/in.txt");
		PrintWriter filewriter = new PrintWriter("c:/out.txt");
		StringBuffer stringbuffer = new StringBuffer();
		String str=null;
		
		
		while (scanner.hasNextLine()) {
			stringbuffer.delete(0, stringbuffer.toString().length());
			str = scanner.nextLine();
			stringbuffer.append(str);
			
			//System.out.println((String)filereader.read());
			filewriter.println(stringbuffer.reverse().toString());
			
		}
		System.out.println("복사완료");
		
		scanner.close();
		filewriter.close();
	}

	

}
