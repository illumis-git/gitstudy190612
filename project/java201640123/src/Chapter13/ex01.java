package Chapter13;

import javax.swing.*;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setTitle("GUI ����");
			//��ư, ���̺�, üũ�ڽ� �� 
			
			setSize(500,500);
			setVisible(true);
		}
	}
}
