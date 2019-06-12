package Chapter11;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 myCar1 = new Car1();
		myCar1.setColor("빨강");
		myCar1.setSpeed(0);

		Car1 myCar2 = new Car1();
		myCar2.setColor("파랑");
		myCar2.setSpeed(0);

		Car1 myCar3 = new Car1();
		myCar3.setColor("노랑");
		myCar3.setSpeed(0);

		myCar1.upSpeed(100);
		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");
		myCar1.upSpeed(150);
		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");

		myCar2.downSpeed(50);
		System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 " + myCar2.getSpeed() + "km 입니다.");

		myCar2.downSpeed(160);
		System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 " + myCar2.getSpeed() + "km 입니다.");

		myCar3.upSpeed(0);
		System.out.println("자동차3의 색상은 " + myCar3.getColor() + "이며, 현재속도는 " + myCar3.getSpeed() + "km 입니다.");
	}

}

class Car1 {
	private String color;
	private int speed = 0;

	public void upSpeed(int speed) {
		if (this.speed + speed > 200) {
			speed = 200;
		} else {
			this.speed += speed;
		}
	}

	public void downSpeed(int speed) {
		if (this.speed - speed < 0) {
			speed = 0;
		} else {
			this.speed -= speed;
		}
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}