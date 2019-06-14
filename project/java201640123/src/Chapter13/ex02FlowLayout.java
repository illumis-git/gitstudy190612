package Chapter13;

import java.awt.*;
import javax.swing.*;

public class ex02FlowLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			setTitle("FlowLayout 연습");
			
			this.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
			
			JButton btn1 = new JButton("버튼1");
			this.add(btn1, BorderLayout.NORTH);
			
			JButton btn2 = new JButton("버튼2");
			this.add(btn2, BorderLayout.WEST);
			
			JButton btn3 = new JButton("버튼3");
			this.add(btn3, BorderLayout.CENTER);
			
			JButton btn4 = new JButton("버튼4");
			this.add(btn4, BorderLayout.EAST);
			
			JButton btn5 = new JButton("버튼5");
			this.add(btn5, BorderLayout.SOUTH);
			
			

			setSize(500, 500);
			setVisible(true);
		}
	}
}
