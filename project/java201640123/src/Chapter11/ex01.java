package Chapter11;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		myCar1.setColor("빨강");
		myCar1.setSpeed(0);

		Car myCar2 = new Car();
		myCar2.setColor("파랑");
		myCar2.setSpeed(0);

		Car myCar3 = new Car();
		myCar3.setColor("노랑");
		myCar3.setSpeed(0);

		myCar1.upSpeed(30);
		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");

		myCar2.upSpeed(60);
		System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 " + myCar2.getSpeed() + "km 입니다.");

		myCar3.upSpeed(0);
		System.out.println("자동차3의 색상은 " + myCar3.getColor() + "이며, 현재속도는 " + myCar3.getSpeed() + "km 입니다.");
	}

}

class Car {
	private String color;
	private int speed;
	static int count =0;
	Car() {
		count++;
	}

	Car(String color) {
		this.color = color;
	}

	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	public void upSpeed(int speed) {
		this.speed += speed;
	}

	public void downSpeed(int speed) {
		this.speed -= speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}


}
