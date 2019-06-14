package Chapter13;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ex14 {

	public static void main(String[] args) {
		new MyGUI();
	}

	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("메뉴 만들기");
			this.setLayout(new BorderLayout());

			JLabel lbl = new JLabel("이 글자가 바뀝니다");
			this.add(lbl, BorderLayout.NORTH);

			JMenuBar menuBar = new JMenuBar();

			JMenu fileMenu = new JMenu("파일");
			JMenu editMenu = new JMenu("편집");

			JMenuItem newItem = new JMenuItem("새 문서");
			JMenuItem openItem = new JMenuItem("열기");
			JMenuItem closeItem = new JMenuItem("닫기");

			setJMenuBar(menuBar);
			add(menuBar, BorderLayout.NORTH);
			menuBar.add(fileMenu);
			menuBar.add(editMenu);

			fileMenu.add(newItem);
			fileMenu.add(openItem);
			fileMenu.addSeparator();
			fileMenu.add(closeItem);

			newItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lbl.setText("[새 문서]를 선택했습니다.");
				}
			});

			openItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lbl.setText("[열기]를 선택했습니다.");
				}
			});

			closeItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			
			JToolBar toolBar = new JToolBar();

			JButton newItem15 = new JButton("새 문서");
			JButton openItem15 = new JButton("열기");
			JButton closeItem15 = new JButton(new ImageIcon("C:/Users/user/Desktop/solar-eclipse-clouds.jpg"));

			add(toolBar, BorderLayout.SOUTH);
			toolBar.add(newItem15);
			toolBar.add(openItem15);
			toolBar.addSeparator(new Dimension(20, 10));
			toolBar.add(closeItem15);

			JLabel label15 = new JLabel("이 글자가 바뀝니다");
			this.add(label15);

			newItem15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					label15.setText("[새 문서]를 선택했습니다.");
				}
			});

			openItem15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					label15.setText("[열기]를 선택했습니다.");
				}
			});

			closeItem15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});

			setSize(1920, 1080);
			setVisible(true);
		}
	}
}