package Chapter13;

import java.awt.*;

import javax.swing.*;

public class ex08Tog_But_Check_Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			setTitle("컴포넌트 연습");

			this.setLayout(new FlowLayout());

			ImageIcon imageicon1 = new ImageIcon("C:/Users/user/Desktop/solar-eclipse-clouds.jpg");
			ImageIcon imageicon2 = new ImageIcon("C:/Users/user/Desktop/total_solar_eclipse.0.jpg");
			
			JButton jbutton1 = new JButton("버튼1",imageicon1);
			this.add(jbutton1);
			
			JLabel jlabel1 = new JLabel("레이블1입니다.");
			JLabel jlabel2 = new JLabel(imageicon2);
			this.add(jlabel1);
			this.add(jlabel2);
			
			JCheckBox jcheckbox1 = new JCheckBox("C++");
			JCheckBox jcheckbox2 = new JCheckBox("JAVA");
			JCheckBox jcheckbox3 = new JCheckBox("C#",true);
			this.add(jcheckbox1);
			this.add(jcheckbox2);
			this.add(jcheckbox3);
			
			JRadioButton jradiobutton1 = new JRadioButton("고래");
			JRadioButton jradiobutton2 = new JRadioButton("상어");
			JRadioButton jradiobutton3 = new JRadioButton("새우");
			this.add(jradiobutton1);
			this.add(jradiobutton2);
			this.add(jradiobutton3);
			
			ButtonGroup buttongroup = new ButtonGroup();
			buttongroup.add(jradiobutton1);
			buttongroup.add(jradiobutton2);
			buttongroup.add(jradiobutton3);

			setSize(1920, 1080);
			setVisible(true);
		}
	}
}
