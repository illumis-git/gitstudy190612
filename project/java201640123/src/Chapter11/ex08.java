package Chapter11;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();

		Car myCar2 = new Car("빨강");

		Car myCar3 = new Car("파랑", 30);

		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");

		System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 " + myCar2.getSpeed() + "km 입니다.");

		System.out.println("자동차3의 색상은 " + myCar3.getColor() + "이며, 현재속도는 " + myCar3.getSpeed() + "km 입니다.");
	}

}
