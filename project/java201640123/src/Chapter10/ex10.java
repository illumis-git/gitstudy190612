package Chapter10;

import java.io.FileInputStream;
import java.io.IOException;

public class ex10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("c:/javatest.txt");
		int ch;
		byte[] bt = new byte[1024];//txt������ ���ڰ� 1024���������� �迭�ʰ������߻�.
		
		int i=0;
		while((ch=fis.read())!=-1) {
			bt[i]=(byte)ch;
			i++;
		}
		
		System.out.print(new String(bt));//String �̹Ƿ� �ѱ���°���
		fis.close();
		
	}

}
